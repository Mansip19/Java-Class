package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
	
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
        
      //Traversing list elements using Iterator
        
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

