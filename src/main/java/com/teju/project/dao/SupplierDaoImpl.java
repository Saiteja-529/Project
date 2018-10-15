package com.teju.project.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.teju.project.pojo.Supplier;
@Component
@Repository
public class SupplierDaoImpl implements SupplierDao
{
	
		 @Autowired
			   SessionFactory sessionFactory;
			   	public boolean insert(Supplier supplier) 
				{
			   		int s=(int)(Math.random()*10000);
			   		supplier.setSupplierId(s);
					 Session session=sessionFactory.openSession();
				        session.save(supplier);
				        org.hibernate.Transaction t=session.beginTransaction();
				        t.commit();
					return true;
				}
				public List getAll() {
					 Session session=sessionFactory.openSession();
				        Query query=session.createQuery("from Supplier");
				        List supplierList=query.list();
				        return supplierList;
				}
			
				public boolean delete(int supplierId)
				{
					try 
					{
						Session session=sessionFactory.openSession();
						Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
				        session.delete(supplier);
				        org.hibernate.Transaction transaction=session.beginTransaction();
				        transaction.commit();
					return true;
				    }
					catch(Exception e)
					{
						return false;
					}
				
				}
				
				public Supplier editSupplier(int supplierId)
				{
					Session session=sessionFactory.openSession();
					Supplier supplier=(Supplier)session.get(Supplier.class,supplierId);
			        return supplier;
				
				}
				
}
