package model;

public class Node<T> {
	
	private T data = null;
	private Node<T> prev = null;
	private Node<T> next = null;
	
	public Node() {}
	public Node(T data) {this.data = data;}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
}
