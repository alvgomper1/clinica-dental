<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/miPerfil.css" />
<title>Mi perfil</title>
</head>
<body>
	<header>
		<a href="/InnovaTeeth/paginaPrincipal.jsp"> <img
			class="logoPrincipal" src="/InnovaTeeth/imagenes/logoPrincipal.png"></a>

		<ul class="listaMenu">
			<li><a href="/InnovaTeeth/notificaciones.jsp">
					Notificaciones </a></li>
			<li><a href="/InnovaTeeth/ventajasClub.jsp"> Ventajas Club </a></li>
			<li><a href="/InnovaTeeth/tratamientos.jsp"> Tratamientos </a></li>
			<li><a href="/InnovaTeeth/nosotros.jsp"> Nosotros </a></li>
			<li><a href="/InnovaTeeth/instalaciones.jsp"> Instalaciones
			</a></li>

		</ul>

	</header>


	<div class="contenedorPrincipal">
		<div class="contenedorMenuLateral">

			<ul class="lateral">

				<li class="superior">
						<img src="imagenes/ejemploCara.jpg" width="70%" height="70%">
					

					<div class="nombreGris">
						<p>ALVARO</p>
					</div></li>




				<li class="seleccionable"><img class="imagenesLista" src="imagenes/iconoPerfil.png">
				<p>DATOS DEL USUARIO</p></li>
				<li class="seleccionable">><img class="imagenesLista"
					src="imagenes/iconoDatosClinicos.png">
				<p>DATOS CLINICOS</p></li>
				<li class="seleccionable">><img class="imagenesLista"
					src="imagenes/iconoResumenVisitas.png">
				<p>RESUMEN VISITAS</p></li>


			</ul>


		</div>

		<div class="contenedorDerecha"></div>


	</div>


</body>
</html>