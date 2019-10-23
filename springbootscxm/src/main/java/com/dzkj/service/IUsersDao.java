package com.dzkj.service;

import java.util.List;

import com.dzkj.pojo.Users;

public interface IUsersDao {
	List<Users> findAll();
	boolean deleteById(Integer id);
	boolean add();
	boolean checkout();
}
