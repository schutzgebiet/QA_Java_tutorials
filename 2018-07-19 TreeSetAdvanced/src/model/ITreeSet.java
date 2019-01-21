package model;

import java.util.Collection;
import java.util.Comparator;

public interface ITreeSet<T> extends Iterable<T>{
	
	public boolean add(T data);
	public boolean addAll(Collection<T> collection);
	public boolean contains(T data);
	public boolean containsAll(Collection<T> collection);
	public boolean remove(T data);
	public boolean removeAll(Collection<T> collection);
	public boolean retainAll(Collection<T> collection);
	
	public T ceiling(T data); 	// least >= data
	public T floor(T data); 	// greatest <= data
	public T higher(T data); 	// least > data
	public T lower(T data); 	// greatest < data
	public T first();			// least (retrieves only)
	public T last();			// greatest least (retrieves only)
	public T pollFirst();		// least (retrieves and removes)
	public T pollLast();		// greatest (retrieves and removes)
	
	public MyTreeSet<T> headSet(T data); 			  // < data
	public MyTreeSet<T> headSet(T data, boolean inc); // <= data if inc=true
	public MyTreeSet<T> tailSet(T data); 			  // >= data
	public MyTreeSet<T> tailSet(T data, boolean inc); // > data if inc=false
	
	public MyTreeSet<T> subSet(T from, T to); 		  // from > data > to
	public MyTreeSet<T> subSet(T from, boolean incF, 
			                   T to, boolean incT); 
	                                                  // from > data > to	
    												  // from >= data  if incF = true
    												  // data >= to if incT = true;
	public void clear();
	public boolean isEmpty();
	public Comparator<T> getComparator();
	public int size();
}
