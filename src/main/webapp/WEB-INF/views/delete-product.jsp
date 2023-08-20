<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ecommer Webapp | Product Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>

	<jsp:include page="../../index.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col col-md-3"></div>
			<div class="col col-md-6">
				<h1>Delete Product</h1>
				<form:form action="/cbfsd-ecomorg-spring-mvc-19-08-2023/products/delete-product" method="post"
					modelAttribute="product">
					<div class="mb-3">
						<label for="productId" class="form-label">Enter Product Id:</label>
						<form:input type="input" path="productId" class="form-control"
							id="productId" aria-describedby="productId" />
					</div>
					<button type="submit" class="btn btn-dark">Delete Product</button>
				</form:form>
			</div>
			<div class="col col-md-3"></div>
		</div>
	</div>
</body>
</html>