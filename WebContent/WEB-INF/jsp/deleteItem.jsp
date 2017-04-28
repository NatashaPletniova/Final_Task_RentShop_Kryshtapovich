<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="print"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product Item For Deletion Page</title>

</head>
<body>


	<jsp:useBean id="items"
		class="by.epam.rentshopweb.bean.listbean.JSPListBean" scope="request" />

	<c:out
		value="Product Name: ${productName} Product Base Price: ${basePrice}"></c:out>
	<print:productDetailsTableForDeletion items="${items}"
		productItemID="Product Item ID" manufacturingYear="Manufacturing Year"
		itemNote="Item Note" wearRate="Wear Rate" />


</body>
</html>