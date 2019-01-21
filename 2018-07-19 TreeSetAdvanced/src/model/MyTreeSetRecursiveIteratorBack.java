package model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyTreeSetRecursiveIteratorBack<T> implements Iterator<T> {

	private Node<T> head;
	private MyTreeSetRecursiveIteratorBack<T> leftIterator=null;
	private MyTreeSetRecursiveIteratorBack<T> rightIterator=null;
	
	private boolean liHasNext = true;
	private boolean headNotReturned = true;
	private boolean riHasNext = true;
	
	public MyTreeSetRecursiveIteratorBack(Node<T> head) {
		super();
		this.head = head;
		if (head != null){
			leftIterator = new MyTreeSetRecursiveIteratorBack<>(head.getLeft());
			rightIterator = new MyTreeSetRecursiveIteratorBack<>(head.getRight());
		}
	}

	@Override
	public boolean hasNext() {
		if (head == null) return false;
		liHasNext = leftIterator.hasNext();
		riHasNext = rightIterator.hasNext();
		return riHasNext || headNotReturned || liHasNext;
	}

	@Override
	public T next() {
		if (!hasNext())throw new NoSuchElementException();
			
		if (riHasNext) return rightIterator.next();
		if (headNotReturned) {
			headNotReturned = false;
			return head.getData();
		}
		if (liHasNext) return leftIterator.next();
		
		return null;
	}


}
