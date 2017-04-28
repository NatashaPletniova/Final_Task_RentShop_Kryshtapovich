<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="print"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product Item Details Page</title>

</head>
<body>


	<jsp:useBean id="items"
		class="by.epam.rentshopweb.bean.listbean.JSPListBean" scope="request" />

	<c:out
		value="Product Name: ${productName} Product Base Price: ${basePrice}"></c:out>
	<print:productDetailsTable items="${items}"
		productItemID="Product Item ID" manufacturingYear="Manufacturing Year"
		itemNote="Item Note" wearRate="Wear Rate" />

	<form action="Controller" method="post"
		name="show_product_item_availability">

		<input type="hidden" name="command"
			value="show_product_item_availability" /> <input type="hidden"
			name="productItemID" value="${productItemID}" />


	</form>

</body>
</html>