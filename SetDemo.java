package com.demo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		
		Set set=new LinkedHashSet();
		
		set.add(23);
		set.add(34);
		set.add(7);
		set.add(9);
		set.add(155);
		set.add('A');
		set.add("Padmaja");
		set.add(23);
		set.add(3.4);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(null);
		set.add(0);
		set.add(true);
		
		Set set1=new LinkedHashSet();
		set1.add("Mansi");
		set1.add("Rutuja");
		set1.add("Pooja");
		
		System.out.println(set.addAll(set1));
		System.out.println(set);
	
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Mansi");
		lhs.add("Rutuja");
		lhs.add("Pooja");
		//lhs.add(12);
		
		//iterate the data using iterator interface (No listInterafce is applicable)
		 Iterator iterator=lhs.iterator();
	        //Traversing list elements in forward direction using Iterator
	        while(iterator.hasNext())
	        {
	        	System.out.println(iterator.next());
	        }
	       
	}

}

