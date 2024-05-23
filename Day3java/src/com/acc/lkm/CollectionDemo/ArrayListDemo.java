package com.acc.lkm.CollectionDemo;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		//Non-generic
		//ArrayList arrayList=new ArrayList();
		//Generic Way
		ArrayList <String>arrayList=new ArrayList<String>();
		System.out.println("Technology Sector");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("SFDC");
		arrayList.add("Oracle");
		arrayList.add("Oracle");
		Iterator iterator=arrayList.iterator();
		/*while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		/*for(String obj:arrayList) {
			System.out.println(obj);
		}*/
        arrayList.add(3,"Hybris");
        System.out.println(arrayList);
        System.out.println("Markets");
        ArrayList<String>arrayList2=new ArrayList<>();
        arrayList2.add("Europe");
        arrayList2.add("CloudFirst");
        arrayList2.add("NorthAmerica");
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        arrayList.remove(7);
        System.out.println(arrayList);
        arrayList.removeIf(str->str.contains("Oracle"));
        System.out.println(arrayList);
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        System.out.println(arrayList2);
        
	}

}
