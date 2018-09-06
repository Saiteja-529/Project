package com.teju.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.teju.project.pojo.Authentication;
import com.teju.project.pojo.Cart;
import com.teju.project.pojo.Product;

@Component
@Repository
public class CartDaoImpl implements CartDao
{
	@Autowired
	   SessionFactory sessionFactory;
	
	public void insert(int productId,int quantity,String username)
	{
		Session session=sessionFactory.openSession();
		
		Product product=(Product)session.get(Product.class, productId);
		
		int s=(int)(Math.random()*10000);
	    Cart cart=new Cart();
		cart.setCartId(s);
		cart.setCartUser(username);
		cart.setQuantity(quantity);
		cart.setProductName(product.getProductName());
		cart.setProductPrice(product.getProductPrice());
		cart.setTotalPrice(quantity*product.getProductPrice());
		session.save(cart);
	    org.hibernate.Transaction t=session.beginTransaction();
        t.commit();
        session.close();
	}

	
	public List viewCart() 
	{
		  Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from Cart");
	        List cartList=query.list();
	        session.close();
	        return cartList;
		
	}

	

}
