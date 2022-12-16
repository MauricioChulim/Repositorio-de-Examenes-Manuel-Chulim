<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Piloto</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
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
			<h2>Buscador de piloto</h2>
		</div>
	</div>

	<div id="container">
		<h3>Agregar piloto</h3>
	
		<form:form action="savePiloto" modelAttribute="piloto" method="POST">

			<!-- need to associate this data with piloto id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><form:input path="nombre" /></td>
					</tr>
					
					<tr>
						<td><label>Apellido paterno:</label></td>
						<td><form:input path="apellidoPaterno" /></td>
					</tr>
				
					<tr>
						<td><label>Apellido materno:</label></td>
						<td><form:input path="apellidoMaterno" /></td>
					</tr>
					
					<tr>
						<td><label>Escuderia:</label></td>
						<td><form:input path="escuderia" /></td>
					</tr>
					
					<tr>
						<td><label>Correo:</label></td>
						<td><form:input path="correo" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/piloto/list">Regresar a la lista principal</a>
		</p>
	
	</div>
</center>
</body>

</html>










