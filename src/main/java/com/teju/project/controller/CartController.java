package com.teju.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.ProductDao;
import com.teju.project.dao.CartDao;
import com.teju.project.pojo.Product;

@Controller
public class CartController 
{
	
	@Autowired
	CartDao ct;
	@Autowired
	ProductDao pd;
	@Autowired
	HttpSession session;
	
	  @RequestMapping("/Addtocart")
	    public ModelAndView cart(@RequestParam("b") int productId,@RequestParam("a")int quantity)
	    { 
		 String username=(String) session.getAttribute("userName");
		
		   ct.insert(productId, quantity,username);
		  List allproducts=pd.getAllProducts();
		  ModelAndView mv=new ModelAndView("user","proinfo",allproducts);
	      return mv;
	    }
	  
	  @RequestMapping("/ViewCart")
	    public ModelAndView viewCart()
	    { 
		  List allcart=ct.viewCart();
		  ModelAndView mv=new ModelAndView("cart","cartinfo",allcart);
	      return mv;
	    }
	  
}
