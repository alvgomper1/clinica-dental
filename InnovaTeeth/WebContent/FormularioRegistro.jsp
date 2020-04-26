<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

<link rel="stylesheet" type="text/css" href="css/cssRegistro.css" />
<script language="JavaScript" type="text/javascript"
	src="javascriptFormulario.js">
	
</script>

<!-- <style type="text/css"> -->
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

	<div class="overlay">

		<form action="ControllerUsuario" method="post">

			<div class="con">

				<header class="head-form">
					<h2>Registrarse</h2>
					<!--     A welcome message or an explanation of the login form -->
					<p>crea una cuenta, solo te llevar� un minuto</p>
				</header>
				<!--     End  header Content  -->
				<br>
				<div class="field-set">


					<!--   Nombre -->
					<span class="input-item"> <i class="fa fa-user-circle"></i>
					</span>
					<!--   user name Input-->
					<p>Nombre</p>
					<input class="form-input" id="txt-input" type="text" required
						name="nombre">

					<!--   Apellidos -->
					<span class="input-item"> <i class="fa fa-user-circle"></i>
					</span>
					<p>Apellidos</p>
					<!--   user name Input-->
					<input class="form-input" id="txt-input" type="text" required
						name="apellidos">




					<!--   user name -->
					<span class="input-item"> <i class="fa fa-user-circle"></i>
					</span>
					<p>N� socio</p>
					<!--   user name Input-->
					<input class="form-input" id="txt-input" type="text" required
						name="usuario"> <br>

					<!--   user name -->
					<span class="input-item"> <i class="fa fa-user-circle"></i>
					</span>
					<p>Email</p>
					<!--   user name Input-->
					<input class="form-input" id="txt-input" type="email" required
						name="email"> <br>

					<!--   contrase�a -->

					<span class="input-item"> <i class="fa fa-key"></i>
					</span>
					<p>Contrase�a</p>
					<!--   Password Input-->
					<input class="form-input" type="password" id="pwd"
						name="contrasena" required>

					<!--  Repeat Password Input-->
					<p>Repetir contrase�a</p>
					<input class="form-input" type="password" id="pwdRepeat"
						name="contrasenaRepeat" required>

					<!--      Show/hide password  -->
					<span> <i class="fa fa-eye" aria-hidden="true" type="button"
						id="eye"></i>
					</span> <br> <input type="hidden" name="opcion" value="registrar">
					<br>


				</div>


				<div class="other">
					<input type="submit" value="Registrarse" class="btn btn-success">


					<!--         Sign Up font icon -->
					<i class="fa fa-user-plus" aria-hidden="true"></i>
					</button>

				</div>

				<p>
					Ya est� registrado? <a href="FormularioLogin.jsp">Iniciar
						sesi�n</a>
				</p>



			</div>


		</form>
	</div>







</body>
</html>