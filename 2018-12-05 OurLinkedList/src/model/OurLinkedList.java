package model;

import java.util.Iterator;

public class OurLinkedList<T> implements Iterable<T>{
	
	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;
	
	public void add(T data) {
		
		Node<T> node = new Node<T>(data);
		
		if (head == null) {
			head = node;
			tail = node;
			size++;
		}
		else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
			size++;
		}
	}
	
	public void addLast(T data){add(data);}
	
	public void addFirst(T data) {
		
		Node<T> node = new Node<T>(data);
		
		if (head == null) {
			head = node;
			tail = node;
			size++;
		}
		else {
			head.setPrev(node);
			node.setNext(head);
			head = node;
			size++;
		}	
	}
	
	public boolean add(int index, T data) {
		if (index < 0 || index > size) return false;
		
		if (index == 0) addFirst(data);
		else if (index == size) add (data);
		else {
			Node<T> n = getNodeByIndex(index);
			Node<T> p = n.getPrev();
		
			Node<T> node = new Node<T>(data);
			
			node.setPrev(p);
			node.setNext(n);
			n.setPrev(node);
			p.setNext(node);
		}
		size++;
		return true;
	}
	
	private Node<T> getNodeByIndex(int index){
		if (index < 0 || index >= size) return null;
		
		Node<T> result;
		int counter;
		if (index < size/2) {
			result = head;
			counter = 0;
			while (counter < index) {
				result = result.getNext();
				counter++;
			}
		}
		else {
			result = tail;
			counter = size-1;
			while (counter > index) {
				result = result.getPrev();
				counter--;
			}
		}
		return result;
	}
	
	public T get(int index) {
		Node<T> found = getNodeByIndex(index);
		return found == null ? null : found.getData();
	}
	
	public boolean set(int index, T data) {
		Node<T> found = getNodeByIndex(index);
		if (found != null) found.setData(data);
		return found != null;
	}
	
	public int size() {return size;}

	@Override
	public Iterator<T> iterator() {
		return new OurLinkedListBackIterator<>(tail);
	}

}
