package com.teju.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.ProductDao;
import com.teju.project.pojo.Product;

@Controller
public class UserControler
{
	@Autowired
	ProductDao productDao;

	 @RequestMapping("/viewdetails")
	    public ModelAndView productSpecification(@RequestParam("proid") int productId)
	    { 
	    Product product=productDao.select(productId);
	    
	    	 ModelAndView modelandview=new ModelAndView("productspecification","proinfo",product);
	    	
			return modelandview;
          }
	
}