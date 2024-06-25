package com.acc.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.acc.lkm.dto.User;

@Component
public class UserDAO {

private List<User>userList;

public List<User>getUserList(){
	return userList;
}
public void setUserList(List<User> userList) {
	this.userList=userList;
	
}
@PostConstruct
public void init() {
	userList=new ArrayList<User>();
}
public void save(User user) {
	userList.add(user);//User will be stored in List
}

}
