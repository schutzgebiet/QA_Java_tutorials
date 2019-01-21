package model;

import java.util.Iterator;

public class MyTreeSetIterativeNodeIterator<T> implements Iterator<Node<T>> {

	private Node<T> head;
	private Node<T> current;

	public MyTreeSetIterativeNodeIterator(Node<T> head) {
		this.head = head;
		if (head != null) current = MyTreeSet.getLeftMost(head);
	}

	@Override
	public boolean hasNext() {
		if (head == null) return false;
		return current != null;
	}

	@Override
	public Node<T> next() {

		Node<T> res = current;
		
		if (current.hasRightChild())current = MyTreeSet.getLeftMost(current.getRight());
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
