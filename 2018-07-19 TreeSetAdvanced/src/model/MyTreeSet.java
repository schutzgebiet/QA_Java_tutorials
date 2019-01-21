package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class MyTreeSet<T> implements ITreeSet<T>{
	
	private static final int LEFT = -1;
	private static final int RIGHT = 1;
	private static final int MIN_BALANCE = 100;
	private static final double DISBALANCE = 1.2;
	
	private Node<T> head = null;
	private int size = 0;
	private Comparator<T> comp;
	
	public MyTreeSet() {
		this(new NaturalComparator<T>());
	}
	
	public MyTreeSet(Comparator<T> comp){
		this.comp = comp;
	}
	
	public MyTreeSet(Collection<T> collection){
		this();
		this.addAll(collection);
	}
	
	public MyTreeSet(Collection<T> collection, Comparator<T> comp){
		this(comp);
		addAll(collection);
	}

	@Override
	public Iterator<T> iterator() {
		return new MyTreeSetIterativeIterator<T>(head);
	}
	
	private Iterator<T> startIterator(T bound, boolean inc) {
		return new MyTreeSetIterativeIterator<T>(head, limits(bound, inc, MyTreeSetCodes.LOWER_BOUND));
	}

	@Override
	public boolean add(T data) {
		if (head == null){
			head = new Node<T>(data);
			size++;
			return true;
		}
		
		Node<T> node = head;
		Node<T> novice = null;
		double counter = 0;
		while(true){
			counter += 1.;
			int c = comp.compare(data, node.getData());
			if (c == 0) return false;
			if (c > 0){
				if (node.hasRightChild()) node = node.getRight();
				else{
					novice = new Node<T>(data);
					novice.setParent(node);
					node.setRight(novice);
					size++;
					if (balanceRequired(counter)) granBalance();
					return true;
				}
			}
			else{
				if (node.hasLeftChild()) node = node.getLeft();
				else{
					novice = new Node<T>(data);
					novice.setParent(node);
					node.setLeft(novice);
					size++;
					if (balanceRequired(counter)) granBalance();
					return true;
				}
			}
		}
		
	}

	private boolean balanceRequired(double counter) {
		return size > MIN_BALANCE && DISBALANCE*(Math.log(size)/Math.log(2)+1.) < counter ;
	}

	@Override
	public boolean addAll(Collection<T> collection) {
		boolean res = false;
		for (T t : collection)res = add(t) || res;
		return res;
	}

	@Override
	public boolean contains(T data) {
		return findNodeByData(data) != null;
	}

	private Node<T> findNodeByData(T data) {
		Node<T> node = head;
		int c = 0;
		while(node != null){
			c = comp.compare(data, node.getData());
			if (c == 0) return node;
			if (c > 0) node = node.getRight();
			else node = node.getLeft();
		}
		return null;
	}

	@Override
	public boolean containsAll(Collection<T> collection) {
		boolean res = true;
		for (T t : collection) {
			if (!contains(t)) {
				res = false;
				break;
			}
		}
		return res;
	}

	@Override
	public boolean remove(T data) {
		Node<T> found = findNodeByData(data);
		if (found == null) return false;
		
		if (!found.hasRightChild()){							// no right leg + leaf			
			if (found.isHead()) head = head.getLeft();
			else connect(found.getParent(),found.getLeft(), found.isRightChild());				
		}
				
		else if (!found.hasLeftChild()){						// no left leg
			if (found.isHead()) head = head.getRight();
			else connect (found.getParent(), found.getRight(), found.isRightChild());
		}
		
		else{													// general case
			Node<T> victim = getLeftMost(found.getRight());
			found.setData(victim.getData());
			connect(victim.getParent(), victim.getRight(), victim.isRightChild());
		}
		
		size--;
		return true;
	}
	

	private void connect(Node<T> p, Node<T> node, boolean rc) {
		if (rc)p.setRight(node);
		else p.setLeft(node);
		
		if(node != null) node.setParent(p);		
	}

	@Override
	public boolean removeAll(Collection<T> collection) {
		boolean res = false;
		for (T t : collection) res = remove(t) || res;
		return res;
	}

	@Override
	public boolean retainAll(Collection<T> collection) {
		ArrayList<T> victims = new ArrayList<>();
		for (T t : this){
			if (!collection.contains(t))victims.add(t);
		}
		for(T t : victims)remove(t);
		return victims.size() > 0;
	}
	
	@Override
	public T ceiling(T data) {
		return limits(data, MyTreeSetCodes.BORDER_INCLUDED, MyTreeSetCodes.LOWER_BOUND).getData();
	}
	
	@Override
	public T floor(T data) {
		return limits(data, MyTreeSetCodes.BORDER_INCLUDED, MyTreeSetCodes.UPPER_BOUND).getData();
	}
	
	@Override
	public T higher(T data) {
		return limits(data, MyTreeSetCodes.BORDER_NOT_INCLUDED, MyTreeSetCodes.LOWER_BOUND).getData();
	}

	@Override
	public T lower(T data) {
		return limits(data, MyTreeSetCodes.BORDER_NOT_INCLUDED, MyTreeSetCodes.UPPER_BOUND).getData();
	}
	
	private Node<T> limits(T data, boolean borderIncluded, boolean lowerBound) {
		int sign = lowerBound ? 1 : -1;
		T bound = lowerBound ? last() : first();
		int check = comp.compare(data, bound);
		if (check*sign > 0 || (check == 0 && !borderIncluded)) return null;
		
		Node<T> node = head;
		int c = 0;
		while(true){
			c = comp.compare(data, node.getData());
			if (c == 0 && borderIncluded) return node;
			if (c > 0 || (c == 0 && lowerBound)){
				if (node.hasRightChild()) node = node.getRight();
				else return goUp(data, node, lowerBound);			
			}
			else{
				if (node.hasLeftChild()) node = node.getLeft();
				else return goUp(data, node, lowerBound);
			}
		}
	}
	
	private Node<T> goUp(T data, Node<T> node, boolean flag) {
		
		int c1 = flag ? 1 : -1;
		while((c1 == 0 || (c1 > 0 == flag)) && node != head){
			c1 = comp.compare(data, node.getData());
			if (c1 == 0 || (c1 > 0 == flag)) node = node.getParent();
		}		
		return node;	
	}
	
	
	@Override
	public T first() {
		if (head == null) return null;
		return getLeftMost(head).getData();
	}

	@Override
	public T last() {
		if (head == null) return null;
		return getRightMost(head).getData();
	}

	@Override
	public T pollFirst() {
		if (head == null) return null;
		T res =first();
		remove(res);
		return res;
	}

	@Override
	public T pollLast() {
		if (head == null) return null;
		T res =last();
		remove(res);
		return res;
	}

	@Override
	public MyTreeSet<T> headSet(T data) {
		return headSet(data, false);
	}

	@Override
	public MyTreeSet<T> headSet(T data, boolean inc) {
		MyTreeSet<T> mtst = new MyTreeSet<>();
		int c = 0;
		for (T t : this){
			c = comp.compare(data, t);
			if (c > 0 || (c==0 && inc)) mtst.add(t);
			else break;
		}
		return mtst;
	}

	@Override
	public MyTreeSet<T> tailSet(T data) {
		return tailSet(data, MyTreeSetCodes.BORDER_NOT_INCLUDED);
	}

	@Override
	public MyTreeSet<T> tailSet(T data, boolean inc) {
		
		MyTreeSet<T> mtst = new MyTreeSet<>();
		int c = comp.compare(last(), data); 
		if (c < 0 || c == 0 && !inc) return mtst;
		
		Iterator<T> it = startIterator(data, inc);
		while(it.hasNext())mtst.add(it.next());
		
		return mtst;
	}

	@Override
	public MyTreeSet<T> subSet(T from, T to) {
		return subSet(from,MyTreeSetCodes.BORDER_NOT_INCLUDED,to, MyTreeSetCodes.BORDER_NOT_INCLUDED);
	}

	@Override
	public MyTreeSet<T> subSet(T from, boolean incF, T to, boolean incT) {
		MyTreeSet<T> mtst = new MyTreeSet<>();
		int c = comp.compare(last(), from); 
		if (c < 0 || c == 0 && incF) return mtst;
		
		T nxt = null;
		Iterator<T> it = startIterator(from, incF);
		while(it.hasNext()){
			nxt = it.next();
			c = comp.compare(to, nxt);
			if (c > 0 || (c==0 && incT)) mtst.add(nxt);
			else break;
		}
		
		return mtst;
	}

	@Override
	public void clear() {
		clearSubtree(head);
		head = null;
		size = 0;
	}
	

	private void clearSubtree(Node<T> node) {
		if (node == null) return;
		Node<T> left = node.getLeft();
		Node<T> right = node.getRight();
		node.setParent(null);
		node.setLeft(null);
		node.setRight(null);
		clearSubtree(left);
		clearSubtree(right);
	}

	@Override
	public boolean isEmpty() {return size == 0;}

	@Override
	public Comparator<T> getComparator() {return comp;}

	@Override
	public int size() {return size;}
	
	public static <T> Node<T> getLeftMost(Node<T> node){
		while(node.hasLeftChild())node = node.getLeft();
		return node;
	}
	
	public static <T> Node<T> getRightMost(Node<T> node){
		while(node.hasRightChild())node = node.getRight();
		return node;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for (T t : this)sb.append(t+", ");
		int l2 = sb.length()-2;
		return (l2 > 0 ? sb.substring(0, l2) : sb).toString()+"]";
	}
	
	public int deep(){
		return subTreeDeep(head);
	}

	private int subTreeDeep(Node<T> node) {
		if (node == null) return 0;
		return Integer.max(subTreeDeep(node.getLeft()), subTreeDeep(node.getRight()))+1;
	}
	
	private void granBalance(){
		ArrayList<Node<T>> arr = new ArrayList<Node<T>>(size);
		Iterator<Node<T>> it = new MyTreeSetIterativeNodeIterator<>(head);
		while (it.hasNext()) arr.add(it.next());
		
		int s = size;
		clear();
		
		setNode(arr,0,s-1, null, 0);	
		
		size = s;
	}
	
	private void setNode(ArrayList<Node<T>> arr, int beg, int end, Node<T> parent, int position){
		if (end - beg < 0) return;
		int middle = beg + (end-beg)/2;
		Node<T> novice = arr.get(middle);
		if (parent == null)	head = novice;
		else {
			novice.setParent(parent);
			if (position < 0)parent.setLeft(novice);
			else parent.setRight(novice);
		}
		
		setNode(arr, beg, middle-1, novice, LEFT);
		setNode(arr, middle+1, end, novice, RIGHT);
	}
	
	
}
