package com.pb.service;

import java.util.List;

import com.pb.domain.User;

public interface UserService {
	int add(User user);

	User findByName(String name);
}
