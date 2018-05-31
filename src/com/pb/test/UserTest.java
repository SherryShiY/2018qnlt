package com.pb.test;

import java.util.Date;

import com.pb.dao.UserDao;
import com.pb.dao.UserDaoImpl;
import com.pb.domain.User;

public class UserTest {
	public static void main(String[] args){
		UserDao dao = new UserDaoImpl();
		User user = new User("zhangsan3","zhangsan",1,"zhang","zhang3");
//		User count=dao.findByName("ndx01");
//		System.out.println(count.getLgName());
		
		int count = dao.add(user);
	}

}
