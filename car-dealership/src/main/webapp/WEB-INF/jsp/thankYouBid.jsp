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
    <p class="lead">
      <a href="inventory" class="btn btn-lg btn-secondary fw-bold border-white bg-muted">Show me Cars!</a>
    </p>
  </main>
	<div>
		<h1 class="display 1 text-white">Thank You for your Bid!</h1>
		<p class="lead text-white">We will notify you if you win!</p>
		
	</div>
  <footer class="mt-auto text-white-50">
  	<p class="lead text-white">Thank you for visiting</p>
  	<a class="nav-link text-white active" aria-current="page" href="#">Home</a>
        <a class="nav-link text-white" href="#">Inventory</a>
       
  </footer>
</div>

</body>
</html>