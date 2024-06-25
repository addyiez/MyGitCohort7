package com.acc.lkm.scopeautowiring;

public class Company {
	

	public Company(String comp_name, String location) {
		super();
		this.comp_name = comp_name;
		this.location = location;
		System.out.println(comp_name+"\n"+location);
	}

	private String comp_name;
	private String location;

	public Company() {
		super();
		
	}

	public String getComp_name() {
		return comp_name;
	}

	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
