<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Book Product Item Page</title>
</head>
<body>
<c:out value="Product Item ID: ${item.productItemID}"/>
<c:out value="Product Name: ${item.name}"/>
<c:out value="Wear Rate: ${item.wearRate}"/>
<c:out value="Price per day: ${item.pricePerDay}"/>

<form action="Controller" method="get" name = "rent-product-item" >
<input type="hidden" name="command" value="rent-product-item" /> 
Rent Period:<br />
<input type="text" name="rentPeriod" value="" />
<br /> 
Client Name:<br />
<input type="text" name="clientName" value="" />
<br /> 
<input type="hidden" name="productItemID" value="${item.productItemID}" />
<input type="submit" value="Add to Card" /><br />   
</form>
</body>
</html>
