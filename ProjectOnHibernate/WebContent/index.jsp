
<%
					String message = (String)request.getAttribute("mona");

%>

<jsp:include page="header.jsp" />

<!-- Hero Section Begin -->
<section class="hero-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<div class="hero-text">
					<h1>Sona A Luxury Hotel</h1>
					<p>Here are the best hotel booking sites, including
						recommendations for international travel and for finding
						low-priced hotel rooms.</p>
					<a href="#" class="primary-btn">Discover Now</a>
				</div>
			</div>
			<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
				<div class="booking-form">

					<%if(message!=null)
						{
						%>
					<label for="date-in" style="color: red;"><%=message%></label>
					<%
						}
						%>

					<h3 style="align-self: center;">Login</h3>

					<form action="ActionController" method="post">
						<div class="check-date">
							<label for="date-in">Username</label> <input type="text"
								name="username">
						</div>
						<div class="check-date">
							<label for="date-out">Password</label><input type="text"
								name="password">
						</div>

						<button type="submit" name="action" value="Login">Login</button>
					</form>
					<a href="registration.jsp"
						style="color: orange; font-size: 14px; color: #707079; display: block; margin-bottom: 10px; margin-top: 10px;">Registration
						now</a>
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



