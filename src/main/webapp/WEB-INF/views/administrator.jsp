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

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
 <!-- Brand -->
 <a class="navbar-brand" href="index.jsp">cosmetics</a>

 <!-- Links -->
 <ul class="navbar-nav">
   <li class="nav-item">
     <a class="nav-link" href="home">Home</a>
   
  <!-- Dropdown -->
   <li class="nav-item dropdown">
     <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
       Go to
     </a>
     <div class="dropdown-menu">
       <a class="dropdown-item" href="product.html">Products</a>
       <a class="dropdown-item" href="category.html">Category</a>
       <a class="dropdown-item" href="supplier.html">Supplier</a>
     </div>
   </li>
 </ul>
</nav>
<br>

<div class="container">
 <h3></h3>
 <p></p>
</div>


<div class="container mt-3">


<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="1000" data-keyboard="true">

 <!-- Indicators -->
 <ul class="carousel-indicators">
   <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
   <li data-target="#myCarousel" data-slide-to="1"></li>
   <li data-target="#myCarousel" data-slide-to="2"></li>
 </ul>

 <!-- The slideshow -->
 <div class="carousel-inner">
   <div class="carousel-item active">
     <img src="resources/down.jpg" alt="e" width="800" height="400">
   </div>
   <div class="carousel-item">
     <img src="resources/download.jpg" alt="a" width="800" height="400">
   </div>
   <div class="carousel-item">
     <img src="resources/images.jpg" alt="q" width="800" height="400">
   </div>
 </div>

 <!-- Left and right controls -->
 <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
   <span class="carousel-control-prev-icon"></span>
 </a>
 <a class="carousel-control-next" href="#myCarousel" data-slide="next">
   <span class="carousel-control-next-icon"></span>
 </a>
</div>

</div>
</body>
</html>