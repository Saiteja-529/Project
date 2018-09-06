package com.teju.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.teju.project.pojo.Category;
import com.teju.project.pojo.Product;
@Component
@Repository
public class ProductDaoImpl implements ProductDao
{
	
		 @Autowired
			   SessionFactory sessionFactory;
			   	public boolean insert(Product product)
				{
			   		     Session session=sessionFactory.openSession();
				        session.save(product);
				        org.hibernate.Transaction t=session.beginTransaction();
				        t.commit();
				        session.close();
					return true;
				}
			   	
			   	
			    public List getAllProducts()
                  {
			        Session session=sessionFactory.openSession();
			        Query query=session.createQuery("from Product");
			        List productList=query.list();
			        session.close();
			        return productList;
			    }


				
				public boolean delete(int productId)
				{
				try 
				{
					Session session=sessionFactory.openSession();
					Product product=(Product)session.get(Product.class, productId);
			        session.delete(product);
			        org.hibernate.Transaction transaction=session.beginTransaction();
			        transaction.commit();
			        session.close();
				return true;
			    }
				catch(Exception e)
				{
					return false;
				}
			}


				
				public Product editProduct(int productId) 
				{
					Session session=sessionFactory.openSession();
					Product product=(Product)session.get(Product.class, productId);
					 session.close();
			        return product;
				}


				
				public Product select(int productId)
				{
					Session session=sessionFactory.openSession();
					Product product=(Product)session.get(Product.class, productId);
					 session.close();
					return product;
				}
}
