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
<title>Product page</title>
</head>
<body>
	<print:jsptable list="${products}" colunmName1="ProductID" colunmName2="ProductName"
		colunmName3="ProductBasePrice" colunmName4="Quantity" colunmName5="AvailableQuantity" />

</body>
</html>