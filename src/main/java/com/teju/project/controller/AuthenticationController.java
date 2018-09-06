package com.teju.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.AuthenticationDao;
import com.teju.project.dao.LoginDao;
import com.teju.project.pojo.Authentication;
import com.teju.project.pojo.Product;

@Controller
public class AuthenticationController
{
	@Autowired
	AuthenticationDao ad;
	@Autowired
	LoginDao lg;
	
	@RequestMapping("/Register")
	  public ModelAndView register()
	  {
		
		  ModelAndView mv=new ModelAndView("register","reg",new Authentication());
		  return mv;
	  }

	 @RequestMapping(value="/addregister",method=RequestMethod.POST)
	  public ModelAndView addRegister(@ModelAttribute("reg")  Authentication re)
	  {
		  ad.insert(re);
		 
		  return new ModelAndView("home","",null);
	  }

	
}
