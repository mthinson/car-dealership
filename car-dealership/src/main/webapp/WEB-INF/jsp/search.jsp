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
body{
height:100%;
}
main{
  display: flex;
  flex-direction: column;
}
footer{
flex-shrink:0;
}


</style>
</head>

<body class="d-flex h-100 text-center text-white bg-dark">
    
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
  <header class="mb-auto">
    <div>
      <nav class="nav nav-masthead justify-content-center float-md-end ">
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
    
    <form:form method="post" action="/search" modelAttribute="searchVehicle">
    <div class="form-group mx-auto w-25">
      <label for="inputAmount">Search by Make</label>
      <form:input type="text" class="form-control" id="inputAmount" path="make"/>
      <button type="submit" class="btn btn-primary">Search</button>
      
    </div>
    </form:form>
      </main>

    	<!-- origional search -->
    		<div class="d-flex flex-row justify-content-center m-3 flex-wrap ">
    	<c:forEach items="${searchList}" var="car">
	
					<div class="card mx-2 mt-2 mb-2 h-50 " style="width: 18rem;">
						<a  href="/inventory-data?info=${car.vin}">
							<img src="${car.image}" style="height: 250px;"class="card-img-top" alt="...">
					</a>
						<div class="card-body ">
							<h5 class="card-title text-dark lead">
								<c:out value="${car.make}" />
								<c:out value="${car.model}" />
							</h5>
							<p class=" card-text text-dark lead">
								Price:
								<c:out value="${car.price}" />
							</p>
							<p class="card-text text-dark lead">
								<c:out value="${car.description}" />
							</p>

						</div>
					</div>
					
			</c:forEach>
			
			</div>
    


  <footer class="mt-auto text-white-50">
  	<p class="lead text-white">Thank you for visiting</p>
  	<a class="nav-link text-white active" aria-current="page" href="#">Home</a>
        <a class="nav-link text-white" href="#">Inventory</a>
       
  </footer>
</div>

</body>
</html>