package com.qhe.interfaces;

/**
 * Interfaces for list.
 * 
 * @author sunshine
 *
 * @param <T>
 */

public interface MyList<T> {
	/**
	 * Add one element at the end of list
	 * @param element
	 * @return true for success, false for failure
	 */
	public boolean add(T element);
	
	/**
	 * Insert an element into the list
	 * 
	 * @param position, the position insert into the list
	 * @param element, the element to be inserted
	 * @return boolean, the status of insertion, true for success 
	 */
	public boolean insert(int position, T element);
	
	/**
	 * Replace the element at position
	 * 
	 * @param position, position of element to be replaced
	 * @param element, use the element to replace the element at position
	 * @return true for success, false for failure.
	 */
	public boolean replace(int position, T element);
	
	/**
	 * Get item at position.
	 * @param position, position of the element you want to get of this list
	 * @return element at position.
	 */
	public T itemAt(int position);
	
	/**
	 * Remove item at position
	 * @param position
	 * @return the element removed, else null
	 */
	public T remove(int position);
	
}
