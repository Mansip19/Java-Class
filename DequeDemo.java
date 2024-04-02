package com.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque sq=new ArrayDeque();
		sq.add(5);
		sq.add("Mansi");
		sq.add('A');
		sq.add(true);
		sq.add(2.3f);
		sq.add(2.3f);
		sq.add(2.3f);

		System.out.println(sq);
		
		Deque<Integer> deque=new ArrayDeque<>();
		deque.add(2);
		deque.add(7);
		deque.add(10);
		deque.add(7);
		deque.add(10);
		deque.add(7);
		deque.addFirst(9);
		System.out.println(deque);

	}

}
