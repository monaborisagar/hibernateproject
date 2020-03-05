package com.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import com.model.*;
import com.util.HibernateUtil;

public class ContactDao {
	private static Session session;
	
	
	public static void addContactDetails(contactDetails c)
	{
		session	=HibernateUtil.createSession2();
		System.out.println("1");
		Transaction tr=session.beginTransaction();
		System.out.println("2");
		session.save(c);
		tr.commit();
		session.close();
	}
	
	
}
