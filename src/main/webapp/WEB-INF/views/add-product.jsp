<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add Product</h1>
	
		<jsp:include page="../../index.jsp"></jsp:include>
		
		<form:form action="add-product" method="post" modelAttribute="product">
			<table border="0">

				<tr>
					<td>Product Code:</td>
					<td><form:input path="productCode" /></td>
				</tr>
				
				<tr>
					<td>Product Name:</td>
					<td><form:input path="productTitle" /></td>
				</tr>

				<tr>
					<td>Product Price:</td>
					<td><form:input path="price" /></td>
				</tr>
				
				<tr>
					<td>Product Rating:</td>
					<td><form:input path="rating" /></td>
				</tr>
				
				<tr>
					<td>Product Desc:</td>
					<td><form:textarea path="productDescription" /></td>
				</tr>

				<tr>
					<td>Submit</td>
					<td><input type="submit" value="Add Product" /></td>
				</tr>

			</table>

		</form:form>
</body>
</html>