<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Sona Template">
<meta name="keywords" content="Sona, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sona | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="css/flaticon.css" type="text/css">
<link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="css/nice-select.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<%

String success = (String)request.getAttribute("success");
out.println(success);

%>
<body>
	<jsp:include page="header.jsp" />

	<!-- Hero Section Begin -->
	<section class="hero-section">
		<div class="container">
			<div class="row">

				<div class="col-lg-6">
					<div class="hero-text">
						<h1>Workflow system</h1>
						<p>this is the best workflow system for attendence reprot .</p>
						<a href="#" class="primary-btn">Discover Now</a>
					</div>
				</div>
				<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
					<div class="booking-form">
					<%if(success!= null)
					{
						%>
						<label for="date-in"><%=success %></label>
					
						<%} %>
						
						
					
						<h3 style="align-self: center;">Registration page</h3>
						<form action="ActionController" method="post">
							<div class="check-date">
								<label for="date-in">Student Fname:</label> <input type="text"
									name="fname">
							</div>
							<div class="check-date">
								<label for="date-in">Student lname:</label> <input type="text"
									name="lname">
							</div>
							<div class="check-date">
								<label for="date-in">Email</label> <input type="text"
									name="email">
							</div>
							<div class="check-date">
								<label for="date-in">Password</label> <input type="text"
									name="pass">
							</div>

							<div class="check-date">
								
									<label for="date-in">Role</label>
									<select multiple name="courses" size=3>
											<option value="1">Java_Programing</option>
											<option value="2">.net_Programing</option>
											<option value="3">php</option>
											<option value="4">Admin</option>
											<option value="5">Python</option>
											<option value="6">.SEO</option>
											<option value="7">Angular</option>
											<option value="8">Web_Development</option>

									</select>
								
							</div>
							<br/>
							
							<button type="submit" name="action" value="registration">Registration</button>
						</form>
						<a href="index.jsp"
							style="color: orange; font-size: 14px; color: #707079; display: block; margin-bottom: 10px; margin-top: 10px;">Back to login</a>
					</div>
				</div>
			</div>
		</div>
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg" data-setbg="img/hero/hero-1.jpg"></div>
			<div class="hs-item set-bg" data-setbg="img/hero/hero-2.jpg"></div>
			<div class="hs-item set-bg" data-setbg="img/hero/hero-3.jpg"></div>
		</div>
	</section>
	<!-- Hero Section End -->


	<jsp:include page="footer.jsp" />




</body>

</html>
