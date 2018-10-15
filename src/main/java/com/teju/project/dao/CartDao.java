package com.teju.project.dao;

import java.util.List;



public interface CartDao 
{
 void insert(int productId,int quantity,String username);
 List viewCart(String userName);

}
