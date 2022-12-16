<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Pilotos</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
<center>
	
<div class = "figure">
	<img src="${pageContext.request.contextPath}/resources/images/logo.png"
	width = "250"
	height = "100"
	>
</div>	
	

	<div id="wrapper">
		<div id="header">
			<h2>Buscador Pilotos</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Agregar piloto"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Nombre</th>
					<th>Apellido Paterno</th>
					<th>Apellido Materno</th>
					<th>Escuderia</th>
					<th>Correo</th>
					<th>Opciones</th>
				</tr>
				
				<!-- loop over and print our pilotos -->
				<c:forEach var="tempPiloto" items="${pilotos}">
				
					<!-- construct an "update" link with piloto id -->
					<c:url var="updateLink" value="/piloto/showFormForUpdate">
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>					

					<!-- construct an "delete" link with piloto id -->
					<c:url var="deleteLink" value="/piloto/delete">
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempPiloto.nombre} </td>
						<td> ${tempPiloto.apellidoPaterno} </td>
						<td> ${tempPiloto.apellidoMaterno} </td>
						<td> ${tempPiloto.escuderia} </td>
						<td> ${tempPiloto.correo} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Actualizar</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Esta seguro que desea eliminar este piloto?'))) return false">Eliminar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
</center>
</body>

</html>









