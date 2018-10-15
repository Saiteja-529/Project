<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="st" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<%@ include file="administrator.jsp" %>
<div class="container">

   <h2 class="text-center">Product</h2>
    <div class="row justify-content-center">
        <div class="col-12 col-md-8 col-lg-6 pb-5">


                   <!--Form with header-->

                   <st:form action="addproduct" method="post" commandName="prod" enctype="multipart/form-data" >
                       <div class="card border-primary rounded-0">
                           <div class="card-header p-1">
                               <div class="bg-info text-white text-center py-2">
                                   <h3 class="bg-secondary text-white"><i class="fa fa-cubes"></i>Product Details</h3>
                                   <p class="bg-primary text-blue">enter product details</p>
                               </div>
                           </div>
                           <div class="card-body p-3">

                               <!--Body-->
  
productName:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></i></div>
                                       </div>

                                       <st:input path="productName"   placeholder="productName" />
                                   </div>
                               </div>
productPrice:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></div>
                                       </div>

                                       <st:input path="productPrice"  placeholder="productPrice" />
                                   </div>
                               </div>

supplierName:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></div>
                                       </div>

                                       <st:input path="supplierName"  placeholder="supplierName" />
                                   </div>
                               </div>
productDescription:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></div>
                                       </div>

                                       <st:input path="productDescription"  placeholder="productDescription" />
                                   </div>
                               </div>   

stock:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></div>
                                       </div>

                                       <st:input path="stock"  placeholder="stock" />
                                   </div>
                               </div>   
                                                      
 category:<br> 
           <st:select path="category">
               <jstl:forEach items="${catinfo}" var="c">
               <option value="${c.catName }">${c.catName }
              </option>
              </jstl:forEach>jstl:forEach>
           
           </st:select>  
     <br>                                                                  
productImg:<br>
                               <div class="form-group">
                                   <div class="input-group mb-2">
                                       <div class="input-group-prepend">
                                           <div class="input-group-text"></div>
                                       </div>

                                       <st:input type="file"  path="productImg" />
                                   </div>
                               </div>


                  
                                      
 
                    <div class="text-center">
                                   <input type="submit"  value="save product"  class="bg-warning text-white">
                               </div>
                           </div>

                       </div>
                          
                   </st:form>
                   <!--Form with header-->


               </div>
    </div>
</div>


<div class="container">
<img src="resources/products12.jpg" alt="a" width="1800" height="120">

</div>

<div>
<table class="table">
 <thead>
   <tr>
     <th scope="col">Product Id</th>
     <th scope="col">Product Name</th>
     <th scope="col">Product Price</th>
     <th scope="col">Edit</th>
     <th scope="col">delete</th>
   </tr>
 </thead>
 <tbody>
   <jstl:forEach items="${proinfo}" var="p">
   <tr class="primary">
      <td>${p.productId}</td>
     <td>${p.productName}</td>
     <td>${p.productPrice}</td>
      <td><a href="editpro?proid=${p.productId}">edit</td>
     <td><a href="deletepro?proid=${p.productId}">delete</td>
   </tr>
   </jstl:forEach>
</tbody>
</table>

</div>

