<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#products {
	  font-family: Arial, Helvetica, sans-serif;
	  border-collapse: collapse;
	  width: 100%;
	}
	
	#products td, #products th {
	  border: 1px solid #ddd;
	  padding: 8px;
	}
	
	#products tr:nth-child(even){background-color: #f2f2f2;}
	
	#products tr:hover {background-color: #ddd;}
	
	#products th {
	  padding-top: 12px;
	  padding-bottom: 12px;
	  text-align: left;
	  background-color: #04AA6D;
	  color: white;
	}

</style>
</head>
<body>

	<jsp:include page="../../index.jsp"></jsp:include>

	<h1>List all products</h1>
	<table id="products">
		<thead>
			<tr>
				<th>Product ID</th>
				<th>Product Code</th>
				<th>Product Name</th>
				<th>Product Desc</th>
				<th>Product Price</th>
				<th>Product Rating</th>
				<th>Product AddedOn</th>
			</tr>
		</thead>
		<tbody>
			<core:forEach var="prd" items="${products}">
			<tr >
				<td>${prd.getProductId()}</td>
				<td>${prd.getProductCode()}</td>
				<td>${prd.getProductTitle()}</td>
				<td>${prd.getProductDescription()}</td>
				<td>${prd.getPrice()}</td>
				<td>${prd.getRating()}</td>
				<td>${prd.getAddedOn()}</td>
			</tr>
			</core:forEach>		
		</tbody>
	</table>
</body>
</html>