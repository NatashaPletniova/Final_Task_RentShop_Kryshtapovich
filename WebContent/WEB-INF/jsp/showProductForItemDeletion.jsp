<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="print"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product for item deletion page</title>
</head>
<body>


	<jsp:useBean id="products"
		class="by.epam.rentshopweb.bean.listbean.JSPListBean"
		scope="request" />


	<form action='Controller' method='get' name='delete-productitem-by-id'>
		<input type="hidden" name="command" value="delete-productitem-by-id" />

			<label>Products for item deletion:</label>
			<print:dropdownAvailableProduct list="${products}" />
		<input type='submit'  value='Search Product'>

	</form>


</body>
</html>