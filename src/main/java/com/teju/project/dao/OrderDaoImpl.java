package com.teju.project.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class OrderDaoImpl implements OrderDao
{
@Autowired
SessionFactory sessionFactory;

	@Override
	public boolean delete(String cartUser) 
	{
		try 
		{
			 Session session=sessionFactory.openSession();
			 Query query = session.createQuery("delete Cart where cartuser=:un");
			 query.setParameter("un",cartUser);
			 query.executeUpdate();
			
			 org.hibernate.Transaction t=session.beginTransaction();
	            t.commit();
	            session.close();
		return true;
	    }
		catch(Exception e)
		{
			return false;
		}
	}

}

