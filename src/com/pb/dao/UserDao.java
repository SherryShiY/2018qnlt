package com.pb.dao;

import com.pb.domain.User;

public interface UserDao {
	int add(User user);
	User findByName(String name);

}
