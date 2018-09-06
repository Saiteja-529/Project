package com.teju.project.dao;

import java.util.List;

import com.teju.project.pojo.Category;

public interface CategoryDao
{
	boolean insert (Category category);
	List getAll();
	boolean delete(int categoryId);
	Category editCategory(int categoryId);
}
