package com.qhe.test;

import com.qhe.main.MyLinkedList;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("HeQiang");
		list.add("成都市金堂县");
		
		System.out.println(list.length());
//		System.out.println(list.itemAt(2));
		System.out.println(list);
		
		list.insert(3, "Hello");
		System.out.println("After add:\n\n" + list);
		System.out.println(list.length());
		
//		list.replace(2, "没有了");
//		System.out.println(list);
		
		list.remove(3);
		System.out.println("After remove:\n\n" + list);
	}

}
