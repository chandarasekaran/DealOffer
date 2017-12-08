package com.bypro.dealoffer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bypro.dealoffer.model.User;
import com.bypro.dealoffer.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
    public String welcome() {
        return "Welcome to bypro.";
    }
	
	@RequestMapping(value="signup/",method=RequestMethod.POST)
	public User signUpUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return user;
	}
	
	@RequestMapping(value="login/{mobileno}")
	public String login(@PathVariable String mobileno)
	{
		User user=userService.findUserByPhoneNo(mobileno);
		if(user!=null)
		{
			System.out.println(mobileno);
		}
		user.setMobileotp("1234");
		userService.updateUser(user);
		return mobileno;
		
	}
	
	@RequestMapping(value="login/resetotp/{mobileno}")
	public String resetMobileOtp(@PathVariable String mobileno)
	{
		User user=userService.findUserByPhoneNo(mobileno);
		if(user!=null)
		{
			user.setMobileotp(null);
			userService.updateUser(user);
		}
		return mobileno;
		
	}
	
	@RequestMapping(value="login/verifyotp/{mobileno}/{mobileotp}")
	public String verifyOTP(@PathVariable String mobileno,@PathVariable String mobileotp)
	{
		User user=userService.findUserByPhoneNo(mobileno);
		if(user!=null)
		{
			if(user.getMobileotp()!=null && user.getMobileotp().equals(mobileotp))
			{
				return "sucess";
			}
		}
		return mobileotp;
		
	}

}
