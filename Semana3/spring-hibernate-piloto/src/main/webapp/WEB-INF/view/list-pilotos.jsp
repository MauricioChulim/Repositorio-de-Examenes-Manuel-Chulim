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
			<h2>Buscador de pilotos 2.0</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Piloto -->
		
			<input type="button" value="Agregar piloto"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Apellido Paterno</th>
					<th>Apellido Materno</th>
					<th>Correo</th>
					<th>Opciones</th>
				</tr>
				
				<!-- loop over and print our Pilotos -->
				<c:forEach var="tempPiloto" items="${pilotos}">
				
					<!-- construct an "update" link with Pilotos id -->
					<c:url var="updateLink" value="/piloto/showFormForUpdate">
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>					

					<!-- construct an "delete" link with Piloto id -->
					<c:url var="deleteLink" value="/piloto/delete">
						<c:param name="pilotoId" value="${tempPiloto.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempPiloto.apPaterno} </td>
						<td> ${tempPiloto.apMaterno} </td>
						<td> ${tempPiloto.correo} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Actualizar</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('¿Esta seguro que desea borrar a este piloto?'))) return false">Borrar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
</center>				
		</div>
	
	</div>
	

</body>

</html>









