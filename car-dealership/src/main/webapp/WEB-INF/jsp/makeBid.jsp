<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

   <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/cover/">

    <!-- Bootstrap core CSS -->
<link href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<title>Matts Car Dealership</title>

<style>
img{
max-width:580px;
border-radius:15px;

}
</style>
</head>

<body class="d-flex h-100 text-center text-white bg-dark">
    
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="mb-auto">
    <div>
      <nav class="nav nav-masthead justify-content-center float-md-end">
        <a class="nav-link text-white active" aria-current="page" href="/">Home</a>
        <a class="nav-link text-white" href="inventory">Inventory</a>
        <a class="nav-link text-white" href="about">About</a>
        <a class="nav-link text-white" href="report">Reports</a>
        <a class="nav-link text-white" href="search">Search</a>
      </nav>
    </div>
  </header>

  <main class="px-3">
    <h1 class="text-white display 2">Matts Car Dealership</h1>
    <p class="lead text-white">Where the deal is right, and the talk is cheap.</p>
   \
  </main>


 	<p>
				<img src="${carInfo.image }"><br><br> 
				 Model:
				<c:out value="${carInfo.model}" /><br>
				Make:
				<c:out value="${carInfo.make}" /><br>
				Price:
				<c:out value="${carInfo.price }" /><br>
				Description:
				<c:out value="${carInfo.description}" /><br>
				Year:
				<c:out value="${carInfo.year}" /><br>
				Color:
				<c:out value="${carInfo.color}" /><br>
				Milage:
				<c:out value="${carInfo.milage}" /><br>
				VIN:
			<c:out value="${carInfo.vin}" /><br>
			</p>
			

<form:form method="post" action="/thankYouBid" modelAttribute="buyer">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputFirstName">First Name</label>
      <form:input type="text" class="form-control" id="inputFirstName" path="firstName"/>
    </div>
    <div class="form-group col-md-6">
      <label for="inputLastName">Last Name</label>
      <form:input type="text" class="form-control" id="inputLastName" path="lastName"/>
    </div>
  </div>
  <div>
   <div class="form-group col-md-6">
      <label for="inputEmail">Email</label>
      <form:input type="email" class="form-control" id="inputEmail4" path="email"/>
    </div>
     <div class="form-group col-md-6">
      <label for="inputAmount">Bid Amount</label>
      <form:input type="text" class="form-control" id="inputAmount" path="amount"/>
    </div>
  </div>
          <form:input type="hidden" class="form-control" value="${carInfo.vin}" id="inputLastName" path="cars.vin"/>
  
  <button type="submit" class="btn btn-primary">Make Bid</button>
</form:form>
  <footer class="mt-auto text-white-50">
  	<p class="lead text-white">Thank you for visiting</p>
  	<a class="nav-link text-white active" aria-current="page" href="#">Home</a>
        <a class="nav-link text-white" href="#">Inventory</a>
       
  </footer>
</div>

</body>
</html>