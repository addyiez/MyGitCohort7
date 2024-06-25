package com.acc.lkm.Java8Demo;

@FunctionalInterface
public interface EmployeeFunctional {
void get(String OB);
//void set(int cohort_no);

default void company(String comp_name) {
	System.out.println(comp_name);
}

static double salary(double salary) {
	return salary;
}
}
