package org.collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class list {
	public static void main(String[] args) {
		
		
		
		
		Set<Integer> li1=new LinkedHashSet<>();
		List<Integer> li =new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		
		
		System.out.println(li);
		li1.add(100);
		li1.add(200);
		li1.add(300);
		li1.add(100);
		
		System.out.println(li1);
		
		li.addAll(li1);
		System.out.println(li);
		
		
		
		
				
		
		
	}

}
