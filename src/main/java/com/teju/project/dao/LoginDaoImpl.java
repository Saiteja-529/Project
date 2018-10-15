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
public class LoginDaoImpl implements LoginDao
{
  @Autowired
  SessionFactory sessionFactory;
	
	public boolean loginCheck(String userName, String passWord) 
	{
	 try
	{
		Session session=sessionFactory.openSession();
	    Query query = session.createQuery("From Authentication where username=:um and password=:pwd");
        query.setParameter("um", userName).setParameter("pwd",passWord);
        Authentication authentication=(Authentication)query.uniqueResult();
      if(authentication.getUserName()==userName&& authentication.getPassWord()==passWord)
        {
            System.out.println("login sucess");     
           
		    return true;
	        }
	}
    catch(Exception e)
	 {
    	   System.out.println("login failed");
	 }
	 return false;
	}
}