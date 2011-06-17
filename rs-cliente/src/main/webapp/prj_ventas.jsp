<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#btnRegistrar").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-registro_ventas/rest/Ventas/registrar/'+$("#codigolibro").val()+'/'+$("#codigousuario").val()+'/'+$("#cantidad").val(),
				type: 'GET',
				success: function(data) {
					//$("#span1").html(data);
					alert(data);
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

<h1>Nodo: Registro de Ventas</h1>
<h2>Servicio: Ventas</h2>
<hr width=100% align="left">

<br />
<h3>Proceso: Registrar Venta</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Codigo de Libro</td>
		<td><input id="codigolibro" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Codigo de Usuario</td>
		<td><input id="codigousuario" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Cantidad</td>
		<td><input id="cantidad" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="btnRegistrar" value="Registrar Venta" width=10px />
<span id="span1"></span>

<br />


</body>
</html>

