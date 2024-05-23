package com.acc.lkm.StringBuilderDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder();
		//stringBuilder.append(" Java");
		//stringBuilder.insert(17, "Java");
		//stringBuilder.replace(3, 9,"StringBuilder");
		//stringBuilder.delete(4, 11);
		//stringBuilder.reverse();
		//capacity & ensureCapacity()
		//System.out.println(stringBuilder.capacity());
		//stringBuilder.append("Java STringBuilder is in Progress and other concepts");
		System.out.println(stringBuilder.capacity());
		stringBuilder.ensureCapacity(50);
		stringBuilder.append("Hii Java ,this is Day 2 of Programming");
		stringBuilder.ensureCapacity(100);
		System.out.println(stringBuilder.capacity());
		//System.out.println(stringBuilder);

	}

}
