 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<!--  
<link href="<c:url value='/resources/css/style.css'/>">
<script src="<c:url value='/resources/js/script.js'/>"></scrpit>
-->
<title>Hello, world!</title>
</head>
<body>
	
	<!--  
	<img alt="BGMI" src="<c:url value='resources/img/img.png'/>">
	-->
	<div  class="container">
		<div class="card mx-auto mt-3 bg-primary" style="width:50%;">
			<div class="card-body py-4">
			<h3 class="text-center text-white" style="text-transform:uppercase;">My Search</h3>
			<form action="search" class="mt-5">
				<div class="form-group">
					<input type="text" name="querrybox" placeholder="Enter your keyword" class="form-control">
				</div>
				<div class="container  text-center">
				<button class="btn btn-outline-light">Search</button>
				</div>
			</form>
				
			</div>
		</div>
	</div>







	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>