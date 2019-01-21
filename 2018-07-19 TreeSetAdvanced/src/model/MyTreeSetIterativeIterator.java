package model;

import java.util.Iterator;

public class MyTreeSetIterativeIterator<T> implements Iterator<T> {
	
	private Node<T> head;
	private Node<T> current;

	public MyTreeSetIterativeIterator(Node<T> head) {
		this.head = head;
		if (head != null) current = MyTreeSet.getLeftMost(head);
	}
	
	public MyTreeSetIterativeIterator(Node<T> head, Node<T> start) {
		this.head = head;
		if (head != null) current = start;
	}

	@Override
	public boolean hasNext() {
		if (head == null) return false;
		return current != null;
	}

	@Override
	public T next() {

		T res = current.getData();
		
		if (current.hasRightChild())
			current = MyTreeSet.getLeftMost(current.getRight());
		else if (current.isLeftChild()) current=current.getParent();
		else {
			boolean lc = false;
			while (current != null && !lc) {
				lc = current.isLeftChild();
				current=current.getParent();
			}
			
		}
		return res;	
	}
}
