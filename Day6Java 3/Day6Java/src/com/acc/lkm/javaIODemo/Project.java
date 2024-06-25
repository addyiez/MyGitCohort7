package com.acc.lkm.javaIODemo;

import java.io.Serializable;

public class Project implements Serializable {
	int project_id;
	String project_name;
	String project_loc;

	public Project(int project_id, String project_name, String project_loc) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_loc = project_loc;
	}

}
