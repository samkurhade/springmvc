<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">




	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mx-auto mt-3">
					<div class="card-body py-4">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*"/>
						</div>
						<form action="handleform" method="POST">

							<div class="form-group">
								<label for="exampleInputName">Your Name</label> <input
									name="name" type="text" class="form-control"
									id="exampleInputName" aria-describedby="nameHelp"
									placeholder="Enter name"> <small id="nameHelp"
									class="form-text text-muted">We'll never share your
									name with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Your id </label> <input
									name="id" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter id"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your id
									with anyone else.</small>
							</div>

							<div class="form-group">
								<label for="exampleInputDate">Your DOB</label> <input name="dob"
									type="text" class="form-control" id="exampleInputDate"
									aria-describedby="dateHelp" placeholder="dd/mm/yyyy"> <small
									id="dateHelp" class="form-text text-muted">We'll never
									share your dob with anyone else.</small>
							</div>


							<div class="form-group">
								<label for="exampleFormControlSelect2">Select Courses</label> <select
									multiple class="form-control" name="courses"
									id="exampleFormControlSelect2">
									<option>Java</option>
									<option>MySQL</option>
									<option>CN</option>
									<option>C++</option>
									<option>Spring</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>

								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>



							</div>

							<div class="card">
								<div class="card-body">
									<p>Your Address</p>

									<div class="form-group">
										<input name="address.street" type="text" class="form-control"
											placeholder="Enter Street" />
									</div>

									<div class="form-group">
										<input name="address.city" type="text" class="form-control"
											placeholder="Enter City" />
									</div>

								</div>
							</div>

							<div class="container  text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>

					</div>
				</div>
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