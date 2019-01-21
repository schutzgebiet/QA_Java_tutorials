package model;

public class Node<T> {
	
	private T data;
	private Node<T> parent = null;
	private Node<T> left = null;
	private Node<T> right = null;
	
	public Node() {}
	public Node(T data) {this.data = data;}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	
	public boolean isHead(){return parent==null;}
	public boolean hasLeftChild(){return left != null;}
	public boolean hasRightChild(){return right != null;}
	public boolean isLeaf(){return left == null && right == null;}
	public boolean isLeftChild(){return parent != null && parent.getLeft() == this;}
	public boolean isRightChild(){return parent != null && parent.getRight() == this;}

}

	
	
	
	
	
	