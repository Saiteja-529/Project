package com.teju.project.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.ProductDao;
import com.teju.project.dao.CartDao;


@Controller
public class CartController 
{
	
	@Autowired
	CartDao cartDao;
	@Autowired
	ProductDao productDao;
	@Autowired
	HttpSession session;
	
	  @RequestMapping("/Addtocart")
	    public ModelAndView cart(@RequestParam("id") int productId,@RequestParam("quantity")int quantity)
	    { 
		 String username=(String) session.getAttribute("userName");
		
		 cartDao.insert(productId, quantity,username);
		  List allproducts=productDao.getAllProducts();
		  ModelAndView modelandview=new ModelAndView("user","proinfo",allproducts);
	      return modelandview;
	    }
	  
	  @RequestMapping("/ViewCart")
	    public ModelAndView viewCart()
	    { 
		  String username=(String) session.getAttribute("userName");
		  List allcart=cartDao.viewCart(username);
		  ModelAndView modelandview=new ModelAndView("cart","cartinfo",allcart);
	      return modelandview;
	    }
	  
}
