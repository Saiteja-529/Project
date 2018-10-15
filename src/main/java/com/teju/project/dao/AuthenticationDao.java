package com.teju.project.dao;

import com.teju.project.pojo.Authentication;


public interface AuthenticationDao 
{
	boolean insert (Authentication register);
	Authentication getUser(String userName);
	
}
