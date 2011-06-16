<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
				$("#boton2").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-transaccion_bancaria/rest/Transaccion/validar/'+$("#validar_tarjeta").val()+'/'+$("#titular").val()+'/'+$("#pin").val()+'/'+$("#monto").val(),
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
/*
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
*/
</script>


</head>
<body>

<h1>Nodo: Transaccion Bancaria</h1>
<h2>Servicio: Transaccion</h2>
<hr width=100% align="left">

<br />

<h3>Proceso: Consultar Tarjeta</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Numero de tarjeta</td>
		<td><input id="validar_tarjeta" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Titular</td>
		<td><input id="titular" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>PIN</td>
		<td><input id="pin" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Monto</td>
		<td><input id="monto" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton2" value="Validar" width=10px />
<span id="span2"></span>

<br />

</body>
</html>

