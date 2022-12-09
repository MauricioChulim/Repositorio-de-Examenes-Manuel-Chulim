<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Buscador pilotos</title>
	

	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>
		<!-- Esto es para evitar que al actualizar se repita una accion -->
		<script type="text/javascript">
			// cambio la URL:
			var str = window.location.href;
			var separado = str.split('?');
			if(separado.length > 1){
				var result = str.replace(str.split('PilotoControllerServlet').pop(),'');
			location.replace(result);
		}	
		</script>
<center>
	
<div class = "figure">
  	<img src="images/logo.png"
  	width = "250"
  	height = "100"
  	>
</div>	
	<div id="wrapper">
		<div id="header">			
			<h1>Buscador de pilotos</h1>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Agregar piloto" 
				   onclick="window.location.href='add-piloto-form.html'; return false;"
				   class="add-piloto-button"
			/>
		
			<table>
			
				<tr>
					<th>Apellido Paterno</th>
					<th>Apellido Materno</th>
					<th>Correo</th>
					<th>Opciones</th>
				</tr>
				
				<c:forEach var="tempPiloto" items="${LISTA_PILOTOS}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="PilotoControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="PilotoControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>
																		
					<tr>
						<td> ${tempPiloto.apPaterno} </td>
						<td> ${tempPiloto.apMaterno} </td>
						<td> ${tempPiloto.correo} </td>
						<td> 
							<a href="${tempLink}">Actualizar</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Esta seguro que desea eliminar la información de este piloto?'))) return false">
							Borrar</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
</center>			
		</div>
	
	</div>
</body>


</html>








