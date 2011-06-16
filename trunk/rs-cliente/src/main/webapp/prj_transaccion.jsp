<html>
<head>

</head>
<body>

<br/><h3>Usuario:<%String strLogin = request.getParameter("login");out.print(" "+strLogin);%></h3>

<h3>Transacción</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Tarjeta</td>
		<td><input id="login" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Titular</td>
		<td><input id="password" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>PIN</td>
		<td><input id="password" type="text" width=20px /></td>
	</tr>
</table>
<br />
<input type="button" id="boton1" value="Entrar" width=10px />
<span id="span1"></span>


</body>
</html>

