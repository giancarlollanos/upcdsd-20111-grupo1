<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-control_recursos/rest/Disponibilidad/asignar/'+$("#asignar_codigorecurso").val()+'/'+$("#codigopedido").val(),
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
				url: 'http://localhost:8080/rs-control_recursos/rest/Disponibilidad/consultar/'+$("#consultar_codigorecurso").val()+'/'+$("#fecha").val()+'/'+$("#hora").val(),
				type: 'GET',
				success: function(data) {
					$("#span2").html(data);
				},
				error: function(data) {
					alert("Error");
				}
			});
		});
		$("#boton3").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-control_recursos/rest/Disponibilidad/listar/'+$("#tiporecurso").val(),
				type: 'GET',
				success: function(data) {
					
					arreglo=data.split(',');
					resultado="<table border=1>";
					resultado+="<tr>";
					resultado+="<th>Recursos Disponibles</th>";
					resultado+="</tr>";
					for(i=0;i< arreglo.length; i++)
						{
							resultado+="<tr>";
							resultado+="<td>";
							resultado+=arreglo[i];
							resultado+="<td>";
							resultado+="</tr>";
					}
					resultado+="</table>";
					
					$("#span3").html(resultado);
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

<h1>Nodo: Control de Recursos</h1>
<h2>Servicio: Disponibilidad</h2>
<hr width=100% align="left">

<br />
<h3>Proceso: Asignar Recurso</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Codigo de Recurso</td>
		<td><input id="asignar_codigorecurso" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Codigo de Pedido</td>
		<td><input id="codigopedido" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton1" value="Asignar" width=10px />
<span id="span1"></span>

<br />
<hr width=50% align="left">
<br />
<h3>Proceso: Consultar Recurso</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Codigo de Recurso</td>
		<td><input id="consultar_codigorecurso" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Fecha</td>
		<td><input id="fecha" type="text" width=20px /></td>
	</tr>
	<tr>
		<td>Hora</td>
		<td><input id="hora" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton2" value="Consultar" width=10px />
<span id="span2"></span>

<br />
<hr width=50% align="left">
<br />
<h3>Proceso: Listar Recursos</h3>
<table cellspacing="0" cellpadding="0" border="0">
	<tr>
		<td>Tipo de Recurso</td>
		<td><input id="tiporecurso" type="text" width=20px /></td>
	</tr>
</table>
<input type="button" id="boton3" value="Listar" width=10px />
<span id="span3"></span>
<br />

</body>
</html>

