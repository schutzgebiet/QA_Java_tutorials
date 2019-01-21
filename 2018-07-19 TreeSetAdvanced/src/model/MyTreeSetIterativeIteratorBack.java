package model;

import java.util.Iterator;

public class MyTreeSetIterativeIteratorBack<T> implements Iterator<T> {

	private Node<T> head;
	private Node<T> current;

	public MyTreeSetIterativeIteratorBack(Node<T> head) {
		this.head = head;
		if (head != null) current = MyTreeSet.getRightMost(head);
	}

	@Override
	public boolean hasNext() {
		if (head == null) return false;
		return current != null;
	}

	@Override
	public T next() {

		T res = current.getData();
		
		if (current.hasLeftChild())current = MyTreeSet.getRightMost(current.getLeft());
		else if (current.isRightChild()) current=current.getParent();
		else {
			boolean rc = false;
			while (current != null && !rc) {
				rc = current.isRightChild();
				current=current.getParent();
			}	
		}
		return res;	
	}


}
