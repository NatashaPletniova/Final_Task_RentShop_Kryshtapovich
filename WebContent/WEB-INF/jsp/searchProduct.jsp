<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="print"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product page</title>
</head>
<body>


	<jsp:useBean id="products"
		class="by.epam.rentshopweb.bean.listbean.JSPListBean"
		scope="request" />


	<form action='Controller' method='get' name='show-available-products'>
		<input type="hidden" name="command" value="show-product-item-availability" />
			<label>Products for rent:</label>
			<print:dropdownAvailableProduct list="${products}" />
		<input type='submit'  value='Search Product'>

	</form>


</body>
</html>