<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    

    
    
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

    <link rel="stylesheet" type="text/css" href="cssRegistro.css"/>
<script language= "JavaScript" type="text/javascript" src="javascriptFormulario.js">

 </script>

<!-- <style type="text/css"> -->
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div class="overlay">

<form action="/InnovaTeeth/ControllerUsuario" method="post">
   
   <div class="con">
   
   <header class="head-form">
      <h2>Login</h2>
      <!--     A welcome message or an explanation of the login form -->
   
   </header>
   <!--     End  header Content  -->
   <br>
   <div class="field-set">
   
   
   	
   
     
      <!--   user name -->
         <span class="input-item">
           <i class="fa fa-user-circle"></i>
         </span>
         <p>Nº socio</p>
        <!--   user name Input-->
         <input class="form-input" id="txt-input" type="text"  required name="nombreUsuario">
     
      <br>
     
           <!--   contraseña -->
     
      <span class="input-item">
        <i class="fa fa-key"></i>
       </span>
       <p>Contraseña</p>
      <!--   Password Input-->
      <input class="form-input" type="password"  id="pwd"  name="contrasenaLogin" required>
      <input  type="hidden"    name="opcion" value="consultar" required>
 
     
     
<!--      Show/hide password  -->
     <span>
        <i class="fa fa-eye" aria-hidden="true"  type="button" id="eye"></i>
     </span>
     
     
      <br>
<!--        buttons -->
<!--      button LogIn -->



   </div>
<%--       <p>  <%= request.getAttribute("errorLogin") %> <br><br></p> --%>
   <input type="submit" value="Login" class="btn btn-success">

   <div class="other">
   <p>No está registrado?<a href="FormularioRegistro.jsp" >Registrarse</a></p>

    
<!--         Sign Up font icon -->
      <i class="fa fa-user-plus" aria-hidden="true"></i>
   

   </div>
     

  </div>
  
  
</form>
</div>







</body>
</html>