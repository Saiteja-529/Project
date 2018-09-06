package com.teju.project.dao;



import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.teju.project.pojo.Category;

import javassist.bytecode.stackmap.BasicBlock.Catch;

@Component
@Repository
public class CategoryDaoImpl implements CategoryDao 
{
 @Autowired
	   SessionFactory sessionFactory;
	   	public boolean insert(Category category) 
		{
	   		int s=(int)(Math.random()*10000);
	   		category.setCatId(s);
	   		Session session=sessionFactory.openSession();
		        session.save(category);
		        org.hibernate.Transaction t=session.beginTransaction();
		        t.commit();
			return true;
		
		}
		public List getAll() 
		{
			 Session session=sessionFactory.openSession();
		        Query query=session.createQuery("from Category");
		        List categoryList=query.list();
		        return categoryList;
		}
		
		
			public boolean delete(int categoryId) 
			{
			try 
			{
				Session session=sessionFactory.openSession();
				Category category=(Category)session.get(Category.class, categoryId);
		        session.delete(category);
		        org.hibernate.Transaction transaction=session.beginTransaction();
		        transaction.commit();
			return true;
		    }
			catch(Exception e)
			{
				return false;
			}
		}
			
		
			public Category editCategory(int categoryId)
			{
				
				
					Session session=sessionFactory.openSession();
					Category category=(Category)session.get(Category.class, categoryId);
			        return category;
				
				}
			}
	
