package com.acc.lkm.springinjectiontest;

public class Project {
	
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + "]";
	}
	public Project(Integer pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
		System.out.println("Project ID is:"+pid+"\n"+"Project name is:"+name);
	}

	public Project() {
		super();
	}

	private Integer pid;
	private String name;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
