package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.Node;

public class OurLinkedListBitterflyIterator<T> implements Iterator<T> {

	Node<T> current;
	boolean forward = true;

	public OurLinkedListBitterflyIterator(Node<T> head) {
		current = head;

	}

	@Override
	public boolean hasNext() {
		return current != null;// (currentHead!=null && currentTail!=null);
	}

	@Override
	public T next() {
		if (!hasNext())
			throw new NoSuchElementException();
		T res = current.getData();
		if (forward) {
			Node<T> firstStep = current.getNext();
			if (firstStep == null) {
				current = current.getPrev();
				forward = false;
			} else {
				Node<T> secondStep = firstStep.getNext();
				if (secondStep == null) {
					current = firstStep;
					forward = false;
				} else {
					current = secondStep;
				}
			}
		} else {
			current = current.getPrev().getPrev();
		}
		return res;
	}

//	if(current.getData()!=null) {  res = current.getData();
//	current = current.getNext().getNext();
//	return res;
//	}
//	if(res==current.getPrev().getData()) {
//		current = current.getPrev().getPrev();
//		return res=current.getPrev().getData();
//	}

}
