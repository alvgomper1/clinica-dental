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

				<li class="superior"><img src="imagenes/ejemploCara.jpg"
					width="70%" height="70%">


					<div class="nombreGris">
						<p>ALVARO</p>
					</div></li>




				<li id="li1" class="seleccionable" onclick="changeInfo('id1','li1')"><img
					class="imagenesLista" src="imagenes/iconoPerfil.png">
					<p>DATOS DEL USUARIO</p></li>
				<li id="li2" class="seleccionable"
					onclick="javascript:changeInfo('id2','li2')"><img
					class="imagenesLista" src="imagenes/iconoDatosClinicos.png">
					<p>DATOS CLINICOS</p></li>
				<li id="li3" class="seleccionable"
					onclick="javascript:changeInfo('id3','li3')"><img
					class="imagenesLista" src="imagenes/iconoResumenVisitas.png">
					<p>RESUMEN VISITAS</p></li>


			</ul>


		</div>

		<div class="contenedorDerecha">
			<div id="id1" class="contenedor1">
				<h1>Aqui van los datos del perfil</h1>

			</div>
			<div id="id2" class="contenedor2">
				<h1>Aqui van los datos clinicos</h1>
			</div>
			<div id="id3" class="contenedor3">
				<h1>Aqui va el resumen de visitas</h1>
			</div>





		</div>


	</div>

	<script type="text/javascript">
		function changeInfo(id, id2) {
			var element = document.getElementById(id);
			var element2 = document.getElementById(id2);

			var div1 = document.getElementById("id1");
			var div2 = document.getElementById("id2");
			var div3 = document.getElementById("id3");

			var li1 = document.getElementById("li1");
			var li2 = document.getElementById("li2");
			var li3 = document.getElementById("li3");

			div1.setAttribute("style", "z-index: 1;");
			div2.setAttribute("style", "z-index: 1;");
			div3.setAttribute("style", "z-index: 1;");

			li1.setAttribute("style", "background-color: white;");
			li2.setAttribute("style", "background-color: white;");
			li3.setAttribute("style", "background-color: white;");

			element.setAttribute("style", "z-index: 3;");

			element2.setAttribute("style", "background-color:  #ffd11a;");

		}
	</script>
</body>
</html>