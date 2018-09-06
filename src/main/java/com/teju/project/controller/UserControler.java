package com.teju.project.controller;

import java.util.List;

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
	ProductDao pd;

	 @RequestMapping("/viewdetails")
	    public ModelAndView deleteProduct(@RequestParam("proid") int productId)
	    { 
	    Product product=pd.select(productId);
	    
	    	 ModelAndView mv=new ModelAndView("productspecification","proinfo",product);
	    	
			return mv;
          }
	
}