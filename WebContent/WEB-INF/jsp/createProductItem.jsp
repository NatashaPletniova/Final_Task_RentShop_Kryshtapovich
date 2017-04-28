<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Add Product Item Page</title>
</head>
      <body>
      <p>Could you please populate the following fields?</p>
      
       <form action="Controller" method="post" name="add-product-item">
               <input type="hidden" name="command" value="add-product-item" />Product ID:<br />
               <input type="text" name="productID" value="" /> 
               <br />
               Product Name:<br />
               <input type="text" name="productName" value="" />
               <br /> 
               Product Category ID:<br />
               <input type="text" name="productCategoryID" value="" /> 
               <br />
               Product Base Price :<br />
               <input type="text" name="productBasePrice" value="" /> 
                <br /> 
                Manufacturing Year:<br /> 
                <input type="text" name="manufacturingYear" value="" /> <br />
                <br /> 
                Wear Rate:<br /> 
               <input type="text" name="wearRate" value="" /> 
                <br />Item Note:
                <br /> 
               <input type="text" name="itemNote" value="" /> 
               <br /> 
               Status:<br />
               <input type="text" name="status" value="" />  
		
		<input type="submit" value="Add Product" /> <br />
	</form>
</body>
</html>
