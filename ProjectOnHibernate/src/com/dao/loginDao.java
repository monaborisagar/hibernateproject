package com.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

import com.model.*;
import com.util.HibernateUtil;

public class loginDao {
	private static Authentication authentication;
	
	
	
	
	public static Authentication getAuthentication(String email )
	{
		Session session	=HibernateUtil.createSession2();

		System.out.println("1");
		
		Transaction tr=session.beginTransaction();
		System.out.println("2");
	Query result = session.createQuery(" from Authentication a where a.email=:email");
	System.out.println("3");
			List authenticatedetails = result.setParameter("email", email).list();
			for(int i =0;i<authenticatedetails.size();i++)
			{
				 authentication = (Authentication)authenticatedetails.get(i);
			}
	/*Iterator iterator = result.iterator();
	while(iterator.hasNext())
	{
		au.setEmail((String) iterator.next());
		au.setPassword((String) iterator.next());
		
	}*/
		tr.commit();
		session.close();
		return authentication;
	}


	

	
	
    
}
