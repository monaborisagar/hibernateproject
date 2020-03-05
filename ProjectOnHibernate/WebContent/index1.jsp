<%@page import="com.dao.StudentCourseDao"%>
<%@page import="com.model.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%

List<Course> list = StudentCourseDao.getAllCourse();

%>

	<form action="ActionController" method="post">
		<table>
			<tr>
				<td>Student Fname:</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Student Lname:</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="pass"></td>
			</tr>
			<!-- <tr><td>Select Course</td>
				<td><select  multiple name="courses" size=3 >
						<option  value="1">Java_Programing</option>
						<option value="2">.net_Programing</option>
						<option value="3">php</option>
						<option value="4">Admin</option>
						<option  value="5">Python</option>
						<option value="6">.SEO</option>
						<option value="7">Angular</option>
						<option value="8">Web_Development</option>
						
				</select></td>
			</tr> -->
			<tr>
				<td>Select Course</td>
              
				<td><select multiple name="courses" size=3>
				  <% for(Course l:list){ %>  
						<option value="<%=l.getCid()%>"><%=l.getCourseName() %></option>
						 <%} %>
				    </select>
				   
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="action" value="Insert"></td>
			</tr>
		</table>
	</form>
</body>
</html>
