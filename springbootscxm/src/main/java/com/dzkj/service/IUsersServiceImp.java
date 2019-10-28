package com.dzkj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dzkj.Mapper.IUsersMapper;
import com.dzkj.pojo.Users;
import tk.mybatis.mapper.entity.Example;

@Service
public class IUsersServiceImp implements IUsersService{
	
	@Autowired
	IUsersMapper usersmapper;

	@Override
	public Users login(String uname,String pwd) {
		
		Example example=new Example(Users.class);
		example.createCriteria().orEqualTo("email", uname).orEqualTo("tellphone", uname).orEqualTo("uname",uname).andEqualTo("pwd",pwd);
		List<Users> list = usersmapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}


	

}
