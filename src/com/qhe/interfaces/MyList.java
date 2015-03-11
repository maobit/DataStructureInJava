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
	 * Insert an element into the list
	 * 
	 * @param position, the position insert into the list
	 * @param element, the element to be inserted
	 * @return boolean, the status of insertion, true for success 
	 */
	public boolean insert(int position, T element);
	
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
