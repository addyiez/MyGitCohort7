package com.acc.lkm.CollectionDemo;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
	LinkedHashSet<String>hashset=new LinkedHashSet<>();
	
	hashset.add("Spring");
	hashset.add("Hibernate");
	hashset.add("MicroServices");
	hashset.add("Spring MVC");
	hashset.add(null);
	hashset.add("MicroServices");
	hashset.add("Spring REST");
	System.out.println(hashset);
	/*for (String obj:hashset) {
		System.out.println(obj);
	}*/
	LinkedHashSet<String>hashset2=new LinkedHashSet<>();
    hashset2.add("KDC");
    hashset2.add("MDC");
    hashset2.add("PDC");
    hashset.addAll(hashset2);
    System.out.println(hashset);
    hashset.remove(null);
    System.out.println(hashset);
	}

}
