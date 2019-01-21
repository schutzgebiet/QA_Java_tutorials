package model;

import java.util.Iterator;

import iterators.OurLinkedListBackIterator;
import iterators.OurLinkedListBitterflyIterator;
import iterators.OurLinkedListIterator;

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
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
			size++;
		}

	}

	public boolean add1(int index, T data) { // HOME_WORK
		Node<T> node = new Node<T>(data);
		if (index < 0 || index > size)
			return false;
		if (index == 0) {
			addFirst(data);
			return true;
		}
		if (index == size) {
			addLast(data);
			return true;
		}
		for (int i = 1; i < size; i++) {
			if (i == index) {
				node.setNext(getNodeByIndex(i));
				getNodeByIndex(i).setPrev(node);
				node.setPrev(getNodeByIndex(i).getPrev());
				getNodeByIndex(i - 1).setNext(node);
				size++;
			}
		}

		return true;
	}

	public boolean set(int index, T data) { // HOME_WORK
		if (index < 0 || index > size) {
			return false;
		} else {
			getNodeByIndex(index).setData(data);
		}
		return true;
	}

	public void addLast(T data) {
		add(data);
	}

	public void addFirst(T data) {
		Node<T> node = new Node<T>(data);

		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {
			head.setPrev(node);
			node.setNext(head);
			head = node;
			size++;
		}
	}

	public Node<T> getNodeByIndex(int index) {
		if (index < 0 || index >= size)
			return null;
		Node<T> result;
		int counter = 0;
		if (index < size / 2) {
			result = head;

			while (counter < index) {
				result = result.getNext();
				counter++;
			}
		} else {
			result = tail;
			counter = size - 1;
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

	public int size() {
		return size;
	}

	public boolean set1(int index, T data) { // CLASS_WORK
		Node<T> found = getNodeByIndex(index);
		if (found != null)
			found.setData(data);
		return found != null;
	}

	public boolean add(int index, T data) { //CLASS_WORK
	    if(index < 0 || index > size)
	      return false;
	    if(index == 0) {
	      addFirst(data);
	    }
	    else if(index == size) {
	      addLast(data);
	    }
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

	@Override
	public Iterator<T> iterator() {
		
		//return new OurLinkedListBackIterator<T>(tail);
		//return new  OurLinkedListIterator<T>(head);
		return new OurLinkedListBitterflyIterator<T>(head);
	}

}
