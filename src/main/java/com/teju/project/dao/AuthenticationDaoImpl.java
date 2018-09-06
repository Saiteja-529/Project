package com.teju.project.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.teju.project.pojo.Authentication;
@Component
@Repository
public class AuthenticationDaoImpl implements AuthenticationDao
{
	 @Autowired
	   SessionFactory sessionFactory;
	public boolean insert(Authentication register) 
	{
		
		  Session session=sessionFactory.openSession();
	      register.setRole("ROLE_USER");
	      register.setEnabled(true);
		  session.save(register);
		
	        org.hibernate.Transaction t=session.beginTransaction();
	        t.commit();
	        session.close();
		return true;
		}
	@Override
	public Authentication getUser(String userName)
	{
		
		//AUTHENTICATION 
		String hql="from Authentication where userName=:uname";
		Session session=sessionFactory.openSession();
		Query query=session.createQuery(hql);
		query.setParameter("uname", userName);
		Authentication au=(Authentication)query.uniqueResult();
		return au;
	}

}
