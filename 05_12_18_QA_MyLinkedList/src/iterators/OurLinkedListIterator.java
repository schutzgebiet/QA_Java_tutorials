package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.Node;

public class OurLinkedListIterator<T> implements Iterator<T>{
	
	Node<T> current;
	
	public OurLinkedListIterator(Node<T> head) {
		current = head;
	}
	
	@Override
	public boolean hasNext() {
		
		return current != null;
	}

	@Override
	public T next() {
		if(!hasNext()) throw new NoSuchElementException();
		
		T res = current.getData();
		current = current.getNext();
		return res;
	}



}
