<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_usuarios/rest/Usuario/login/'+$("#login").val()+'/'+$("#password").val(),
				type: 'GET',
				success: function(data) {
					//$("#span1").html(data);
					if (data=="Login Satisfactorio"){
						document.location.href='prj_stock.jsp';
					}else{
						alert("Login/Password incorrecto o no registrado");
						document.location.href='prj_registro.jsp';
					}
						
				},
				error: function(data) {
					//$("#span1").html("Login/Password incorrecto o no registrado");
					document.location.href='prj_registro.jsp';
				}
			});
		});
	 });
		
</script>


</head>


<body>

<br />
<h3>Login</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Usuario</td>
		<td><input id="login" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input id="password" type="text" width=20px /></td>
	</tr>
</table>
<br />
<input type="button" id="boton1" value="Entrar" width=10px />
<span id="span1"></span>


</body>
</html>

