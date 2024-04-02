package com.demo;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(5);
		list.add("Mansi");
		list.add('A');
		list.add(true);
		list.add(2.3f);	
		
		ArrayList<String> list2=new ArrayList<String>();
	    list2.add("One");//index 0
	    list2.add("Two");
	    list2.add("Three");//index 2
	    
	    System.out.println(list2.size());//output 3
	    
	    list2.add("Four");//index 3
	    list2.add("Five");//index 4
	    
	    System.out.println(list2.size());//output 5
	    
	    list2.remove("Two");
	    
	    System.out.println(list2.size());//output 4
	    
	    list2.add(1, "Two");//index 1
	    
		
		System.out.println(list.get(4));
		System.out.println(list2);

	}

}
