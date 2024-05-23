package com.acc.lkm.CollectionDemo;
import java.util.*;
public class MapDemo {

public static void main(String args[]) {
	LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
	map.put(300,"Bikash");
	map.put(100,"Aman");
	map.put(200,"Shubham");
	map.put(100, "Prakash");
	map.put(300,null);
	//map.put(null, "Amit");
	map.put(null, "Sakshi");
	
	//map.put(null, "Rashi");
	//map.put(null, null);
	/*for(Map.Entry m1:map.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	map.entrySet()
	.stream()
	//.sorted(Map.Entry.comparingByKey())
	.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	.forEach(System.out::println);*/
	System.out.println(map);
	//map.remove(null);
	//System.out.println(map);
	map.remove(300, null);
	System.out.println(map);
	System.out.println(map.keySet());
	
	
}

}
