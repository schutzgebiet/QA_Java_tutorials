package model;

import java.util.Comparator;

public class OurTreeSet<T> {
	
	private Node<T> root = null;
	private Comparator<T> comp;
	private int size = 0;
	
	public OurTreeSet(Comparator<T> comp) {
		super();
		this.comp = comp;
	}
	
	public boolean add(T data) {
		
		if (root == null) {
			root = new Node<T>(data);
			size++;
			return true;
		}
		
		Node<T> current = root;
		Node<T> node;
		while(true) {
			if (comp.compare(data, current.getData()) == 0) return false;
			if (comp.compare(data, current.getData()) > 0) {
				if (current.getRight() == null) {
					node = new Node<T>(data);
					current.setRight(node);
					node.setParent(current);
					size++;
					return true;
				}
				current = current.getRight();
			}
			else {
				if (current.getLeft() == null) {
					node = new Node<T>(data);
					current.setLeft(node);
					node.setParent(current);
					size++;
					return true;
				}
				current = current.getLeft();
			}
		}
		
	}
	
	public boolean contains(T data) {
		
		if (root == null) return false;
		
		Node<T> current = root;
		while(true) {
			if (comp.compare(data, current.getData()) == 0) return true;
			
			if (comp.compare(data, current.getData()) > 0) {
				if (current.getRight() == null) return false;
				current = current.getRight();
			}
			else {
				if (current.getLeft() == null) return false;
				current = current.getLeft();
			}
		}
		
	}
	
	

}
