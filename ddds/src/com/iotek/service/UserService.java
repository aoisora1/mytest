package com.iotek.service;

import com.iotek.entiy.User;

public interface UserService {
	public void regist(User user);
	public User findByName(String name);
}
