package com.teju.project.dao;

import java.util.List;

import com.teju.project.pojo.Cart;

public interface CartDao 
{
 void insert(int productId,int quantity,String username);
 List viewCart();

}
