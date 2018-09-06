package com.teju.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.ProductDao;
import com.teju.project.pojo.Category;
import com.teju.project.pojo.Product;

@Controller
public class HomeControler
{
 @Autowired
  ProductDao pd;	

	  @RequestMapping("/user")
	  public ModelAndView m1()
	  {
		  List allproducts=pd.getAllProducts();
		  ModelAndView mv=new ModelAndView("user","proinfo",allproducts);
		  return mv;
	  }

@RequestMapping("/administrator")
String m2()
{
	  return "administrator";
} 

@RequestMapping("/home")
String m3()
{
	  return "home";
}


}
