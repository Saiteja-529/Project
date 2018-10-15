<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

 
<style>
.centered {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}
    </style>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
 <div class="row ">
  
  <div class>
  <a class="navbar-brand" href="user"><h1><p class="text-primary">PRODUCTS</p></h1></a>
</div>

  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
    <div class="col-sm-6">
      <a class="nav-link" href="Register"><img src="resources/register2.jpg" alt="a" width="120" height="70"></a>
   </div> </li>
   
    
      
    <li class="nav-item">
    <div class="col-sm-12">
      <a class="nav-link" href="ViewCart"> <img src="resources/cart.png" class="float-right" alt="a" width="120" height="80"></a>
    </div></li> 
    
    <li class="nav-item">
    <div class="col-sm-12">
      <h1><p class="text-danger">contact us: 7901277457  <br><t><t><t> <button type="button" class="btn btn-primary">fb</button> <t> <button type="button" class="btn btn-danger">In</button> <t> <button type="button" class="btn btn-warning">WA</button></p></h1>
    </div></li> 
    
 
                                                      
  </ul>
</nav>
<br>


<div class="container">
<img src="resources/lock.jpg" class="mx-auto d-block" alt="all" style="width:100%">
<div class="centered">
<form action="checklogin" method="post" >
<h1>USERNAME:<input type="text" name="username" ></h1>
<br>
<h1>PASSWORD:<input type="password" name="password"></h1>
<br>
<input type="submit" class="btn btn-primary btn-lg"" value="login"  />
</form>
</div>
</div>
</body>




</html>