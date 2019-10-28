package com.dzkj.Mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dzkj.pojo.Users;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IUsersMapper extends Mapper<Users>{
	
}
