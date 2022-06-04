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

<title>Upload Image</title>
</head>
<body>

	<div class="container">
		<h1>Upload Image</h1>
		<form action="uploadimage" class="container" method="POST" enctype="multipart/form-data">
			<div class="form-group">
				<label for="exampleFormControlFile1">Select your image</label> <input
					name="profile" type="file" class="form-control-file"
					id="exampleFormControlFile1">
			</div>
			<button class="btn btn-outline-success">Upload</button>
		</form>
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