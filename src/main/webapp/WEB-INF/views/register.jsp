<!DOCTYPE html>
<html lang="en">
<head>
  <title>REGISTRATION</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
</head>
<body>

<div class="container bg-secondary text-white ">
  
  

 

<sptags:form action="addregister" method="post" commandName="reg">
userName <sptags:input path="userName" /><br>
passWord<sptags:input type="password" path="passWord" /><br>
mobileNum<sptags:input path="mobileNum" /><br>
DOb <sptags:input path="Dob"/><br>
email <sptags:input path="email" /><br>
address <sptags:input path="address" /><br>
<input type="submit"  value="REGISTER"  />

</sptags:form>

</div>

</body>
</html>









