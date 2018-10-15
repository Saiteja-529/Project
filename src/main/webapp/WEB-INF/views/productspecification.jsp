<!DOCTYPE html>
<html lang="en">
<head>
 <title>op</title>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
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
     <div class="col-sm-6">
      <a class="nav-link" href="Login"><img src="resources/login.jpg" class="rounded-circle" alt="a" width="120" height="80"></a>
    </div></li>
     </li>
     
    
    <li class="nav-item">
    <div class="col-sm-12">
      <a class="nav-link" href="perform_logout"><img src="resources/logout.jpg" class="rounded-circle" alt="a" width="120" height="80"></a>
    </div></li>  
      
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
<div class>
<p class="bg-dark"><img src="resources/Products13.jpg" class="mx-auto d-block" alt="all" width="1000" height="120"></p>
</div>

 <div class="p-3 mb-2 bg-secondary text-white">
<img src="resources/50.jpg"  class="float-right" alt="all" width="800" height="600"/>

<h2><p class="text-dark">PRODUCTID=${proinfo.productId}</p></h2>

<br>
<h2><p class="text-dark">PRODUCTNAME=${proinfo.productName}</p></h2>
<br>
<h2><p class="text-dark">PRODUCTPRICE=${proinfo.productPrice}</p></h2>
<br>
<h2><p class="text-dark">SUPPLIERNAME=${proinfo.supplierName}</p></h2>
<br>
<h2><p class="text-dark">PRODUCT DESCRIPTION=${proinfo.productDescription}</p></h2>
<br>
<h2><p class="text-dark">STOCK=${proinfo.stock}</p></h2>
<br>
 <h2><p class="text-dark">CATEGORY=${proinfo.category}</p></h2>
 
 <br>
 <img src="resources/${proinfo.productId}.jpg" alt="e" width="600" height="400" />
 <br>
 <form action="Addtocart">
  <input type="text" name="quantity">
  <input type="hidden" name="id" value=${proinfo.productId}>
  <input type="submit"  value="Add to cart"> 
</form>
</div>
</body>
</html>