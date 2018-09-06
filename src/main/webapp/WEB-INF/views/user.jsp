<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>












  
<table class="table">
 <thead>
   <tr>
     <th scope="col">Product Id</th>
     <th scope="col">Product Name</th>
     <th scope="col">Product Price</th>
        
        <th scope="col">Product Image</th>
    
   </tr>
 </thead>
 <tbody>
   <jstl:forEach items="${proinfo}" var="p">
   <tr class="primary">
      <td>${p.productId}</td>
     <td>${p.productName}</td>
     <td>${p.productPrice}</td>
      
    
      <td><a href="viewdetails?proid=${p.productId}"><img src="resources/${p.productId}.jpg" /></a></td>
    
   </tr>
   </jstl:forEach>
</tbody>
</table>



