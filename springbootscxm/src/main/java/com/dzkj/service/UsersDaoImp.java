package com.dzkj.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dzkj.Mapper.IUsersMapper;
import com.dzkj.pojo.Users;

@Service
public class UsersDaoImp implements IUsersDao{
	
//	����ע��
	@Autowired
	IUsersMapper users_mapper;
	
	@Override
	public List<Users> findAll() {
		
		return users_mapper.findAll();
	}

	@Override
	public boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkout() {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	
}
