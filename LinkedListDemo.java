package com.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(23);
		list.add('A');
		list.add("String");
		list.add("Mansi");
		list.add(2.3);
		list.add(true);
		list.addFirst(10);
		System.out.println(list);
		
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(2);
		list2.add(7);
		list2.add(10);
		list2.add(7);
		list2.add(10);
		list2.add(7);
		list2.add(10);
		//list2.add("Mansi");
		list.remove(10);
		list.remove(3);
		list.get(5);
		list.getFirst();
		list.getLast();
		
		System.out.println(list2);
		// fetch the record using iterator and list iterator from a LinkedList
		
		//Iterator iterator
		 Iterator iterator=list.iterator();
	        //Traversing list elements in forward direction using Iterator
	        while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        }

	      //Traversing list elements using ListIterator 
	        // List Iterator is only applicable to List Interface and its implementation
	        //not for Queue Set Map
	        ListIterator listIterator=list.listIterator();
	        
	      //Traversing list elements in forward direction using ListIterator
	        while(listIterator.hasNext())
	        {
	        	System.out.println(listIterator.next());
	        }
	      //Traversing list elements in backward direction using ListIterator
	        while(listIterator.hasPrevious())
	        {
	        	System.out.println(listIterator.previous());
	        }
	        
	        
		
	}

}
