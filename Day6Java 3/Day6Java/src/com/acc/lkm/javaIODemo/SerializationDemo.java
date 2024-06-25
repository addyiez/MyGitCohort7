package com.acc.lkm.javaIODemo;

import java.io.*;

public class SerializationDemo {
	public static void main(String args[]) {
		Project project, project2;
		project2=new Project(500,"Accenture Song", "Pune");
        project=new Project(200,"Disney", "Bangalore");
        
        try {
        	ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Serialize.txt"));
        	objectOutputStream.writeObject(project);
        	objectOutputStream.writeObject(project2);
        	objectOutputStream.flush();
        	objectOutputStream.close();
        	System.out.println("Created file");
        }catch(Exception ex) {
        	System.out.println(ex);
        }
        try {
        	//De-Serialization
        	ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("Serialize.txt"));
        	Project projectobj=(Project)objectInputStream.readObject();
        	Project projectobj2=(Project)objectInputStream.readObject();
        	System.out.println(projectobj.project_id+"\n"+projectobj.project_name+"\n"+projectobj.project_loc);
        	System.out.println(projectobj2.project_id+"\n"+projectobj2.project_name+"\n"+projectobj2.project_loc);
        }catch(Exception ex) {
        	System.out.println(ex);
        }
	}
}
