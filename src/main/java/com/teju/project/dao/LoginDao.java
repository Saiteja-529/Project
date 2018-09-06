package com.teju.project.dao;

import com.teju.project.pojo.Authentication;

public interface LoginDao 
{
	boolean loginCheck (String userName, String passWord);
}
