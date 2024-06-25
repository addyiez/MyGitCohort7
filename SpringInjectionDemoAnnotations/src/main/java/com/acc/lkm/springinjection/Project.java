package com.acc.lkm.springinjection;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myProj")
public class Project {
	public Project(Integer pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
		System.out.println("Project ID is:"+pid +"\n"+"Project name is:"+name);
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + "]";
	}
    @Value("21")
	private Integer pid;
    @Value("Java")
	private String name;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project() {
		super();
	}

}
