<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ecommer Webapp  | Product Management </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 </head>
<body>

	<jsp:include page="../../navbar.jsp"></jsp:include>
	<div class="container">
	<div class="row">
	<h1>List all products</h1>
	<div class="col">
	<a type="button" class="btn btn-dark end mt-2 mb-2 me-2" href="/cbfsd-ecomorg-spring-mvc-19-08-2023/products/add-product" style=" float: right; ">Add Product</a>
	<a type="button" class="btn btn-dark end mt-2 mb-2" href="/cbfsd-ecomorg-spring-mvc-19-08-2023/products/delete-product" style=" float: right; ">Delete Product</a>
	
	<table class="table">
  		<thead class="table-dark">
			<tr>
				<th>Product ID</th>
				<th>Product Code</th>
				<th>Product Name</th>
				<th>Product Desc</th>
				<th>Product Price</th>
				<th>Product Rating</th>
				<th>Product AddedOn</th>
				<th>Action</th>
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
				<td>
				<a type="button" class="btn btn-dark me-1 mt-1" href="/cbfsd-ecomorg-spring-mvc-19-08-2023/products/delete/${prd.getProductId()}" >Delete</a>
				<a type="button" class="btn btn-dark me-1 mt-1" href="/cbfsd-ecomorg-spring-mvc-19-08-2023/products/update/${prd.getProductId()}" >Update</a>
				<td>
			</tr>
			</core:forEach>		
		</tbody>
	</table>
	</div>
	</div>
	</div>
</body>
</html>