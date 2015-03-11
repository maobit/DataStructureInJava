package com.qhe.test;

import com.qhe.main.MyArrayList;

public class ArrayListTest {

	/**
	 * @param <T>
	 * @param args
	 */
	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<String>();
		
		list.add("电子科技大学");
		list.add("hello world");
		list.add("dongdong");
		list.add("hehe");
		list.add("we are the world");
		
		System.out.println(list);
		
	}

}
