<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-piloto-style.css">	
</head>

<body>

<center>
	
<div class = "figure">
  	<img src="images/logo.png"
  	width = "250"
  	height = "100"
  	>
</div>	


	<div id="wrapper">
		<div id="header">
			<h2>Buscador de pilotos</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Actualizar informaci�n de Piloto</h3>
		
		<form action="PilotoControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="pilotoId" value="${THE_PILOTO.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Apellido Paterno:</label></td>
						<td><input type="text" name="apPaterno" 
								   value="${THE_PILOTO.apPaterno}" /></td>
					</tr>

					<tr>
						<td><label>Apellido Materno:</label></td>
						<td><input type="text" name="apMaterno" 
								   value="${THE_PILOTO.apMaterno}" /></td>
					</tr>

					<tr>
						<td><label>Correo:</label></td>
						<td><input type="text" name="correo" 
								   value="${THE_PILOTO.correo}" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Guardar" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="PilotoControllerServlet">Regresar a la lista</a>
		</p>
	</div>
	
</center>	
	
</body>

</html>











