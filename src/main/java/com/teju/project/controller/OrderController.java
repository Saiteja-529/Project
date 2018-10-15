package com.teju.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.CartDao;
import com.teju.project.dao.OrderDao;


@Controller
public class OrderController 
{
	@Autowired
	OrderDao orderDao;
	
    @Autowired
	HttpSession session;
   @Autowired
   CartDao  cartDao;
	@RequestMapping("/cancelcart")
    public ModelAndView deleteCart()
    { 
		
		String cartUser=(String) session.getAttribute("userName");
		orderDao.delete(cartUser);
    	
    	 List allcart=cartDao.viewCart(cartUser);
    	  ModelAndView modelandview=new ModelAndView("cart","cartinfo",allcart);
	      return modelandview;
    }
	
}
