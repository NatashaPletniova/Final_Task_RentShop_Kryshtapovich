<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Controller" method="get">

		<input type="hidden" name="command" value="show-available-products" />
		<input type="submit" value="rent product item" />
	</form>
	
	<form action="Controller" method="get">
		<input type="hidden" name="command" value="go-to-add-product-item" /> <input
			type="submit" value="add product item" />
	</form>
	
	<form action="Controller" method="get">
		<input type="hidden" name="command" value="show-products-for-deletion" /> <input
			type="submit" value="delete product item" />
	</form>
	
</body>
</html>