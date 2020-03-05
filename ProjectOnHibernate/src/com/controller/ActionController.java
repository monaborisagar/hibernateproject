package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ContactDao;
import com.dao.StudentCourseDao;
import com.dao.loginDao;
import com.model.Authentication;
import com.model.Course;
import com.model.Student;
import com.model.StudentCourse;
import com.model.contactDetails;

@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	String message;
	int max_sid;
	Collection<StudentCourse> col = new ArrayList<StudentCourse>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if(action.equalsIgnoreCase("registration"))
		{
			  
			  Student s1 = new Student();
			  
			  s1.setFname(request.getParameter("fname"));
			  s1.setLname(request.getParameter("lname"));
			  
			  
			  String[] a = request.getParameterValues("courses");
			  
			  for(int i=0;i<a.length;i++) { int selectedCourse_id = Integer.parseInt(a[i]);
			  
			  System.out.println("selected course is "+selectedCourse_id);
			  
			  StudentCourse sc1 = new StudentCourse(); sc1.setC_id(selectedCourse_id);
			  col.add(sc1);
			  
			  
			  
			  
			  } Authentication au = new Authentication();
			  au.setEmail(request.getParameter("email"));
			  au.setPassword(request.getParameter("pass")); s1.setAccount(au);
			  au.setSc(s1);
			  
			  s1.setSc(col); System.out.println("done"); StudentCourseDao.addsession();
			  if(true)
			  {
				  StudentCourseDao.addStudent(s1);
				  String success = "data is saved successfully";
				  request.setAttribute("success", success);
				  response.sendRedirect("registration.jsp");
			  }
			  
		}
		if(action.equalsIgnoreCase("login"))
		{
			  
			  Authentication au = new Authentication();
			  
			  au.setEmail(request.getParameter("username"));
			  au.setPassword(request.getParameter("password"));
			  System.out.println(au.getEmail());
			  System.out.println(au.getPassword());
			  System.out.println("rrfr");
			  
			 Authentication authentication =	(Authentication) loginDao.getAuthentication((String)request.getParameter("username"));
			  System.out.println("done");
			  if(authentication!=null)
			  {
				  System.out.println("data retrived successfully");
				  
				  System.out.println(authentication.getEmail());
				  System.out.println(authentication.getPassword());
				  
				  if(authentication.getEmail().equalsIgnoreCase(au.getEmail()) && authentication.getPassword().equalsIgnoreCase(au.getPassword()))
				  {
					  response.sendRedirect("home.jsp");
				  }else {
					System.out.println("notmatched");
					message	= "login is not matched";
					  request.setAttribute("mona", message);
					  RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					  rd.forward(request, response);
				}
				 
			  }else
			  {
				  System.out.println("data is not retrived successfully");
				  
			  }
			 
		}
		
		if(action.equalsIgnoreCase("submitnow"))
		{
			 contactDetails contactdetails = new contactDetails();
			 contactdetails.setContact_name(request.getParameter("contact_name"));
			 contactdetails.setContact_email(request.getParameter("contact_email"));
			 contactdetails.setContact_message(request.getParameter("contact_message"));
	       
			  ContactDao.addContactDetails(contactdetails);
			 
			  
		
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		