<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cart</title>
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
     <th scope="col">Cart Id</th>
     <th scope="col">Product Name</th>
     <th scope="col">Product Price</th>
     <th scope="col">Total Price</th>
     <th scope="col">Quantity</th>
     <th scope="col">Cart User</th>

</tr>
 </thead>
 <tbody>
   <jstl:forEach items="${cartinfo}" var="cr">
   <tr class="primary">
      <td>${cr.cartId}</td>
     <td>${cr.productName}</td>
     <td>${cr.productPrice}</td>
     <td>${cr.totalPrice}</td>
     <td>${cr.quantity}</td>
     <td>${cr.cartUser}</td>  
    
      
   </tr>
   </jstl:forEach>
</tbody>
</table>


</body>
</html>