package com.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import com.model.*;
import com.util.HibernateUtil;

public class StudentCourseDao {
	private static Session session;
	
	public static void addsession()
	{
		session	=HibernateUtil.createSession2();
	}
	
	
	public static void addCourses(Course c)
	{
		addsession();
		System.out.println("1");
		Transaction tr=session.beginTransaction();
		System.out.println("2");
		session.save(c);
		tr.commit();
		session.close();
	}
	public static void addStudent(Student s)
	{
		addsession();
    	Transaction tr=session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();
	}
	
	public static int getMaxIdFromStudent()
	{
		addsession();
		Transaction tr=session.beginTransaction();
	 Query query = 	session.createQuery("Select max(s.sid) FROM Student s ");
	 int max_sid = (int) query.list().get(0);
	 System.out.println("max id is ccccrrrr "+max_sid);
		
		tr.commit();
		session.close();
		return max_sid;
		
	}
	
	public static void StudentCourse(StudentCourse sc)
	{
		addsession();
		Transaction tr=session.beginTransaction();
		session.save(sc);
		tr.commit();
		session.close();
	}
	
	public static List<Course> getAllCourse()
	{
		addsession();
		Transaction tr=session.beginTransaction();
		List<Course> list=session.createQuery("from Course").list();
		return list;
	}
    
}
