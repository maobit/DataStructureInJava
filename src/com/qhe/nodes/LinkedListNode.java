package com.qhe.nodes;

/**
 * Node for LinkedList
 * 
 * @author sunshine
 *
 * @param <T>
 */

public class LinkedListNode<T> {
	private T item;
	private LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.item = data;
	}
	
	public T getData() {
		return item;
	}
	
	public void setData(T data) {
		item = data;
	}
	
	public void setNext(LinkedListNode<T> data) {
		this.next = data;
	}
	
	public LinkedListNode<T> next() {
		return next;
	}
	
}
