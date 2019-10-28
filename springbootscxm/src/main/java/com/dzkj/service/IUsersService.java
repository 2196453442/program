package com.dzkj.service;

import java.util.List;

import com.dzkj.pojo.Users;

public interface IUsersService {
	
	Users login(String uname, String pwd);
}
