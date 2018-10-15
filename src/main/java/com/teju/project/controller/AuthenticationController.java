package com.teju.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.AuthenticationDao;
import com.teju.project.pojo.Authentication;


@Controller
public class AuthenticationController
{
	@Autowired
	AuthenticationDao authenticationDao;
	
	
	@RequestMapping("/Register")
	  public ModelAndView register()
	  {
		
		  ModelAndView modelandview=new ModelAndView("register","reg",new Authentication());
		  return modelandview;
	  }

	 @RequestMapping(value="/addregister",method=RequestMethod.POST)
	  public ModelAndView addRegister(@ModelAttribute("reg")  Authentication registration)
	  {
		 authenticationDao.insert(registration);
		 
		  return new ModelAndView("home","",null);
	  }

	
}
