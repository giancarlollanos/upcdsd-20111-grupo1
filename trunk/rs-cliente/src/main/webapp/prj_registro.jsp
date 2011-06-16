<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_usuarios/rest/Usuario/registrar/'+$("#codigo").val()+'/'+$("#nombre").val()+'/'+$("#login").val()+'/'+$("#password").val()+'/'+$("#direccion").val()+'/'+$("#telefono").val(),
				type: 'GET',
				success: function(data) {
					//$("#span1").html(data);
					if (data=="Registro de Usuario Satisfactorio" || data==""){
						document.location.href='prj_stock.jsp?login='+$("#login").val();
					} else {
						alert(data);
					}
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

<br />
<h3>Registro</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Código de Usuario</td>
		<td><input id="codigo" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Nombre de Usuario</td>
		<td><input id="nombre" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>ID Login</td>
		<td><input id="login" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input id="password" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Dirección</td>
		<td><input id="direccion" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Teléfono</td>
		<td><input id="telefono" type="text" width=20px /></td>
	</tr>
</table>
<br />
<input type="button" id="boton1" value="Registrar" width=10px />
<span id="span1"></span>


</body>
</html>

