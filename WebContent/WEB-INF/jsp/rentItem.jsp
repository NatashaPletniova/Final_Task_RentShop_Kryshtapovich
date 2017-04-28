<%@ page language="java" contentType="text/html; charset=utf-8"
	import="by.epam.rentshopweb.bean.entity.Product,java.util.List"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="print"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Product rent page</title>
</head>
<body>


	<jsp:useBean id="item"
		class="by.epam.rentshopweb.bean.entity.ProductItem" scope="request" />


	<print:ProductItemRentDetailTag item="${item}"
		productItemID="Product Item ID" productName="Product Name"
		clientName="Client Name" rentPeriod="Rent Period"
		pricePerDay="Price Per Day" rentAmount="Rent Amount" />




</body>
</html>