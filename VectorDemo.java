package com.demo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[]args) {
		
		Vector vc=new Vector();
		vc.add(5);
		vc.add("Mansi");
		vc.add('A');
		vc.add(true);
		vc.add(2.3f);
		vc.add(null);
		vc.add(null);
		vc.add(null);
		vc.add(null);
		vc.add(2.3f);
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
	    v.add(2);
	    v.add(3);
	    System.out.println(v.size());
		
	    v.add(4);
	    v.add(5);
	    System.out.println(v.size());
	    
		//System.out.println(vc);
		//System.out.println(vc.get(2));
		
		
		
		
	}
}
