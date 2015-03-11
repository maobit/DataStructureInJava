package com.qhe.nodes;


/**
 * Node for LinkedList
 * 
 * @author sunshine
 *
 * @param <T>
 */

public class LinkedListNode<T> {
	
	private T data;
	private LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(LinkedListNode<T> data) {
		this.next = data;
	}
	
	public LinkedListNode<T> getNext() {
		return next;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof LinkedListNode))
			return false;
		LinkedListNode<T> listNode = (LinkedListNode<T>) obj;
		if(!(listNode.getData()).equals(data))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return data.hashCode();
	}
	
	@Override
	public String toString() {
		return "LinkedListNode {data: " + data + " , next: " + next + "}";
	}
	
}
