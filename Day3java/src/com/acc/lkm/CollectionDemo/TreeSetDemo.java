package com.acc.lkm.CollectionDemo;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String>treeSet=new TreeSet<>();
		treeSet.add("Zen");
		treeSet.add("Java");
		treeSet.add("Python");
		treeSet.add("SpringCloud");
		
		//System.out.println(treeSet);
		//pollLast() & pollFirst()
		//System.out.println(treeSet.pollLast());
		//System.out.println(treeSet.pollFirst());
	/*	for (String obj:treeSet) {
			System.out.println(obj);
		}*/
//NavigableSet
		/*NavigableSet<String>navigableSet=treeSet.descendingSet();
		Iterator<String>iterator=navigableSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		System.out.println(treeSet);
		
		
	}

}
