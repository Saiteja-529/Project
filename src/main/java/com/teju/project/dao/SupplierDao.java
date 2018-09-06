package com.teju.project.dao;

import java.util.List;

import com.teju.project.pojo.Product;
import com.teju.project.pojo.Supplier;

public interface SupplierDao 
{
	boolean insert(Supplier supplier);
	List getAll();
	boolean delete(int supplierId);
	Supplier editSupplier(int supplierId);
}
