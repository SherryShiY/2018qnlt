package com.pb.service;

import java.sql.SQLException;
import java.util.List;

import com.pb.dao.UserDao;
import com.pb.dao.UserDaoImpl;
import com.pb.domain.User;



public class UserServiceImpl implements UserService{
UserDao dao=new UserDaoImpl();
	
	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return dao.add(user);
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

}
