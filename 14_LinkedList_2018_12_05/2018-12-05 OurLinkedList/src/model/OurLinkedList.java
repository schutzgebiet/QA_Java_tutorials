package model;

public class OurLinkedList<T> {
	
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
	
	private Node<T> getNodeByIndex(int index){
		if (index < 0 || index >= size) return null;
		
		Node<T> result = head;
		int counter = 0;
		while (counter < index) {
			result = result.getNext();
			counter++;
		}
		return result;
	}
	
	public T get(int index) {
		Node<T> found = getNodeByIndex(index);
		return found == null ? null : found.getData();
	}
	
	public int size() {return size;}

}
