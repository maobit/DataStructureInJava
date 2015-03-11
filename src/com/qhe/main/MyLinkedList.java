package com.qhe.main;

import com.qhe.interfaces.MyList;
import com.qhe.nodes.LinkedListNode;

public class MyLinkedList<T> implements MyList<T>{
	private LinkedListNode<T> head = null;
	private int length;
	private LinkedListNode<T> tail = null;
	
	public MyLinkedList() {
		head = new LinkedListNode<T>(null);
		head.setNext(null);
		tail = head;
		length = 0;
	}
	
	
	@Override
	public boolean add(T element) {
		if(length == 0) {
			head.setData(element);
			head.setNext(null);
			length++;
		} else {
			LinkedListNode<T> node = new LinkedListNode<T>(element);
			node.setNext(tail.next());
			tail.setNext(node);
			tail = node;
			length++;
		}
		return true;
	}
	

	@Override
	public boolean insert(int position, T element) {
		LinkedListNode<T> cur = head;
		LinkedListNode<T> node = null;
		if(position < 0 || position > length+1) {
			System.err.println("Error, out of range");
			return false;
		}
		
		if(position == 1) {
			node = new LinkedListNode<T>(head.getData());
			node.setNext(head.next());
			head.setNext(node);
			head.setData(element);
			
		} else {
			for(int i=1; i<position-1; i++) 
				cur = cur.next();
			node = new LinkedListNode<T>(element);
			
			node.setNext(cur.next());
			cur.setNext(node);
		}
		
		length++;
		
		return true;
	}

	@Override
	public boolean replace(int position, T element) {
		if(position<0 || position>length) {
			System.err.println("Out of range");
			return false;
		}
		LinkedListNode<T> cur = head;
		for(int i=1; i<position; i++)
			cur = cur.next();
		cur.setData(element);
		return true;
	}

	@Override
	public T itemAt(int position) {
		if(position<0 || position>length) {
			System.err.println("Index Out Of Boundary");
			return null;
		}
		
		LinkedListNode<T> cur = head;
		for(int i=1; i<position; i++)
			cur = cur.next();
		return cur.getData();
	}

	@Override
	public T remove(int position) {
		if(position<0 || position>length) {
			System.err.println("Out of range");
			return null;
		}
		
		LinkedListNode<T> cur = head;
		LinkedListNode<T> pre = null;
		T item = null;
		if(position == 1) {
			item = head.getData();
			head.setData(head.next().getData());
			head.setNext(head.next().next());
		} else {
			for(int i=1; i<position; i++) {
				pre = cur;
				cur = cur.next();
			}
			item = cur.getData();
			pre.setNext(cur.next());
		}
		
		length--;
		
		return item;
	}
	
	
	public int length() {
		return length;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedListNode<T> cur = head;
		while(cur != null) {
			sb.append(cur.getData() + "\n");
			cur = cur.next();
		}
		return sb.toString();
	}
}
