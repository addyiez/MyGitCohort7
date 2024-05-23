package com.acc.lkm.ExceptionDemo;

public class EmpSkill extends Exception{
	public EmpSkill(String str) {
		super(str);
	}
 static void skill(String proficiency)throws EmpSkill{
	 if(proficiency=="P5") {
		 throw new EmpSkill("Expert in Java");
	 }else {
		 throw new EmpSkill("Beginner in Java");
	 }
 }
 void display(String tech)throws EmpSkill{
	 System.out.println(tech);
 }
 
}
