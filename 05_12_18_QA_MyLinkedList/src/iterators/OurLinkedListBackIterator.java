package iterators;

import java.util.Iterator;

import model.Node;

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
		T res = current.getData();
		current = current.getPrev();
		return res ;
	}

}
