package com.teju.project.dao;

import java.util.List;

import com.teju.project.pojo.Category;
import com.teju.project.pojo.Product;

public interface ProductDao 
{
	boolean insert (Product product);
	List getAllProducts();
	boolean delete(int productId);
	Product editProduct(int productId);
	
	Product select(int productId);
}