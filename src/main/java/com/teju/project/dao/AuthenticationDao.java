package com.teju.project.dao;

import com.teju.project.pojo.Authentication;
import com.teju.project.pojo.Product;

public interface AuthenticationDao 
{
	boolean insert (Authentication register);
	Authentication getUser(String userName);
	
}
