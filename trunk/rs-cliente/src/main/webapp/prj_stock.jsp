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

<br/><h3>Usuario:<%String strLogin = request.getParameter("login");out.print(" "+strLogin);%></h3>

<h3>Stock</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Libro A</td>
		<td><input id="cantidadA" type="text" /></td>
		<td><input type="checkbox" name="checkA" value=""></td>
	</tr>
	<tr>
		<td>Libro B</td>
		<td><input id="cantidadB" type="text" /></td>
		<td><input type="checkbox" name="checkB" value=""></td>
	</tr>
	<tr>
		<td>Libro C</td>
		<td><input id="cantidadC" type="text" /></td>
		<td><input type="checkbox" name="checkC" value=""></td>
	</tr>
</table>
<br />
<input type="button" id="boton1" value="Consultar" width=10px />
<span id="span1"></span>


</body>
</html>

