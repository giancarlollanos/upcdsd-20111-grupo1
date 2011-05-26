<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_stock/rest/Stock/consultar/'+$("#consultar_codigolibro").val(),
				type: 'GET',
				success: function(data) {
					$("#span1").html(data);
				},
				error: function(data) {
					alert("Error");
				}
			});
		});
		$("#boton2").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_stock/rest/Stock/actualizar/'+$("#actualizar_codigolibro").val()+'/'+$("#cantidad").val(),
				type: 'GET',
				success: function(data) {
					$("#span2").html(data);
				},
				error: function(data) {
					alert("Error");
				}
			});
		});
		
	 });
	
	
	
</script>


</head>
<body>

<h1>Nodo: Gestión de Stock</h1>
<h2>Servicio: Stock</h2>
<hr width=100% align="left">

<br />
<h3>Proceso: Consultar Libro</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Código de Libro</td>
		<td><input id="consultar_codigolibro" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton1" value="Consultar" width=10px />
<span id="span1"></span>

<br />
<hr width=50% align="left">
<br />
<h3>Proceso: Actualizar Libro</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Código de Libro</td>
		<td><input id="actualizar_codigolibro" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Cantidad</td>
		<td><input id="cantidad" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton2" value="Consultar" width=10px />
<span id="span2"></span>

<br />

</body>
</html>

