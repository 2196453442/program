package com.dzkj.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj.Mapper.IUsersMapper;
import com.dzkj.pojo.Users;
import com.dzkj.service.IUsersService;





@Controller    

public class UsersController {
	
	@Autowired
	IUsersService usersService;
	
	@RequestMapping("/show") 
	public String show4(Model model) {
		return "home/login";
	}
	@RequestMapping("/login")
	public String login(String uname,String pwd,HttpSession session) {
		Users result = usersService.login(uname, pwd);
		if(result!=null) {
			session.setAttribute("result", result);
			return "home/home";
		}else {
			return "home/login";
		}
	}
    @RequestMapping("register")	
    public String Add(Users Users) {
    	return "home/register";
}
    /*
    @RequestMapping("/findAll")
	public String findAll(Map map) {
    	List<Users> data = new ArrayList<Users>();
    	//Map.addAttribute("data",data);
		return "list";
	}
	*/
	
}
