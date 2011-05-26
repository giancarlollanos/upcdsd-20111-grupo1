<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_usuarios/rest/Usuario/registrar/'+$("#registrar_codigo").val()+'/'+$("#registrar_nombre").val()+'/'+$("#registrar_idlogin").val()+'/'+$("#registrar_password").val()+'/'+$("#registrar_direccion").val()+'/'+$("#registrar_telefono").val(),
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
				url: 'http://localhost:8080/rs-gestion_usuarios/rest/Usuario/login/'+$("#validar_idlogin").val()+'/'+$("#validar_password").val(),
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

<script language="javascript">
function tabla(data)
{
	alert(data);
	var arreglo=data.split(",");
	int i=0;
	String resultado="<table border=1>";
	while(i<ubound(arreglo))
	{
			resultado+="<tr>";
			resultado+="<td>";
			resultado+=arreglo[i];
			resultado+="<td>";
			resultado+="</tr>";
			i++;
	}
	resultado+="</table>";
	alert(resultado);
	return resultado;
}

</script>


</head>
<body>

<h1>Nodo: Gestión de Usuarios</h1>
<h2>Servicio: Usuario</h2>
<hr width=100% align="left">

<br />
<h3>Proceso: Registrar Usuario</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Codigo de Usuario</td>
		<td><input id="registrar_codigo" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Nombre de Usuario</td>
		<td><input id="registrar_nombre" type="text" width=20px /></td>
	</tr>
		<tr>
		<td>IdLogin</td>
		<td><input id="registrar_idlogin" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input id="registrar_password" type="text" width=20px /></td>
	</tr>
		<tr>
		<td>Direccion</td>
		<td><input id="registrar_direccion" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Telefono</td>
		<td><input id="registrar_telefono" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton1" value="Registrar" width=10px />
<span id="span1"></span>

<br />
<hr width=50% align="left">
<br />
<h3>Proceso: Login de Usuario</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>ID Login</td>
		<td><input id="validar_login" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input id="validar_password" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton2" value="Log In" width=10px />
<span id="span2"></span>

<br />
<hr width=50% align="left">
<br />

</body>
</html>

