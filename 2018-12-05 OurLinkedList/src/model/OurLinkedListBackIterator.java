package model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OurLinkedListBackIterator<T> implements Iterator<T>{
	
	Node<T> current;
	
	public OurLinkedListBackIterator(Node<T> tail) {
		current = tail;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() {
		if (!hasNext()) throw new NoSuchElementException();
		
		T res = current.getData();
		current = current.getPrev();
		return res;
		
	}

}
