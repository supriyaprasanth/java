<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<br>
	<br>
	<br>
	<hr>
	<br>
	<br>
	<br>
	<div align="center">
		<form action="Home.jsp" method="post">
			<fieldset style="width: 300px; height: 180px">
				<legend>Login Here</legend>
				<br /> <br />
				<div class="input-group">
					<span class="input-group-addon"><i
						class="glyphicon glyphicon-user"></i></span> <input id="email"
						type="text" class="form-control" name="email" placeholder="Email">
				</div>
				<br>
				<div class="input-group">
					<span class="input-group-addon"><i
						class="glyphicon glyphicon-lock"></i></span> <input id="password"
						type="password" class="form-control" name="password"
						placeholder="Password">
				</div>
				<div class="checkbox">
					<label><input type="checkbox" value="">Remember me</label>
				</div>
				<br />
				<button type="submit" class="btn btn-success">Login</button>
			</fieldset>
		</form>
	</div>
	</form>
</body>
</html>