package com.qhe.main;

import com.qhe.interfaces.MyList;

/**
 * List implemented in array.
 * 
 * @author sunshine
 * @date 2015.03.11
 *
 */

public class MyArrayList<T> implements MyList<T> {
	private final int DEFAULT_SIZE = 1;
	private int capacity;
	private int length;
	private Object[] data;
	
	public MyArrayList() {
		data = new Object[DEFAULT_SIZE];
		length = 0;
		capacity = DEFAULT_SIZE;
	}

	@Override
	public  boolean add(T element) {
		if(length >= capacity) 
			expansion();
		
		data[length++] = element;
		
		return true;
	}

	private void expansion() {
		capacity <<= 1;
		Object tmp[] = new Object[capacity];
		for(int i=0; i<data.length; i++) 
			tmp[i] = data[i];
		data = tmp;
	}

	@Override
	public boolean insert(int position, T element) {
		if(position<1 || position>length+1) {
			System.err.println("Out of range");
			return false;
		}
		
		for(int i=length; i>=position; i--)
			data[i] = data[i-1];
		data[position-1] = element;
		
		length++;
		return true;
	}

	@Override
	public boolean replace(int position, T element) {
		if(position<1 || position>length) {
			System.err.println("Out of range");
			return false;
		}
		
		data[position-1] = element;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T itemAt(int position) {
		if(position<1 || position>length) {
			System.err.println("Out of range");
			return null;
		}
		
		return (T) data[position-1];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int position) {
		if(position<1 || position>length) {
			System.err.println("Out of range");
			return null;
		}
		
		T tmp = (T) data[length-1];
		for(int i=position-1; i<length; i++)
			data[i] = data[i+1];
		
		length--;
		return tmp;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length; i++)
			sb.append(data[i] + "\n");
		return sb.toString();
	}

}
