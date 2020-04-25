<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="stylesheet" type="text/css" href="paginaPrincipal.css" />
<title>Pagina de inicio</title>
</head>
<body>

	<header>
		<a href="/InnovaTeeth/paginaPrincipal.jsp"> <img
			class="logoPrincipal" src="/InnovaTeeth/imagenes/logoPrincipal.png"></a>

		<ul class="listaMenu">
			<li><a href="/InnovaTeeth/notificaciones.jsp">
					Notificaciones </a></li>
			<li><a href="/InnovaTeeth/ventajasClub.jsp"> Ventajas Club
			</a></li>
			<li><a href="/InnovaTeeth/tratamientos.jsp"> Tratamientos
			</a></li>
			<li><a href="/InnovaTeeth/nosotros.jsp"> Nosotros </a></li>
			<li><a href="/InnovaTeeth/instalaciones.jsp">
					Instalaciones </a></li>

		</ul>

	</header>

	<img class="fotoPortada2" src="/InnovaTeeth/imagenes/sillon.png">


	<div class="tarjetaInicio">
		<img class="fotoTarjetaInicio"
			src="/InnovaTeeth/imagenes/tarjetaVisita.png">

		<div class="camposTarjeta">
			<form action="/InnovaTeeth/ControllerUsuario" method="post">
				<p1 style="color: white;">Nº &nbsp&nbspS O C I O:&nbsp&nbsp <input
					placeholder="XXXX-XXXXXX" class="form-input" id="txt-input"
					type="text" required name="nombreUsuario" maxlength="10"
					pattern="[0-9]{10}">
				<br>
				CONTRASEÑA: <input placeholder="***********" class="form-input"
					type="password" id="pwd" name="contrasenaLogin" required
					maxlength="32">
				</p>
		</div>

		<%
			Object error = request.getAttribute("errorLogin");
		%>
		<%
			if (error != null) {
		%>
		<p class="errorLogin"><%=error%></p>

		<%
			}
		%>

























		<div class="botonFormulario">
			<input type="hidden" name="opcion" value="consultar" required>
			<input class="botonAceptar" type="image" name="submit"
				src="/InnovaTeeth/imagenes/botonDiente.png" border="0"
				alt="Aceptar" style="width: 50px;" />


			</form>
		</div>
	</div>









</body>
</html>