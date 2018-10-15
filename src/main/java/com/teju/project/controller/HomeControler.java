package com.teju.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.ProductDao;



@Controller
public class HomeControler
{
 @Autowired
  ProductDao productDao;	

	  @RequestMapping("/user")
	  public ModelAndView getProducts()
	  {
		  List allproducts=productDao.getAllProducts();
		  ModelAndView modelandview=new ModelAndView("user","proinfo",allproducts);
		  return modelandview;
	  }

@RequestMapping("/administrator")
String admin()
{
	  return "administrator";
} 

@RequestMapping("/home")
String m3()
{
	  return "home";
}


}
