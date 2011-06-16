<html>
<head>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(document).ready(function() {
		$("#boton1").click(function() {
			$.ajax({
				url: 'http://localhost:8080/rs-gestion_stock/rest/Stock/consultar/'+$("#cod").val(),
				type: 'GET',
				success: function(data) {
					if(data!="" && data!="Libro "+$("#cod").val()+" no Encontrado"){
						if (parseInt(data)>0){
							//aca se ejecutaria la llamada al segundo webservice del nodo gestion-stock
							document.location.href='prj_transaccion.jsp?login='+strLogin+'&codlib='+$("#cod").val();
						} else {
							alert("No disponible");
						}
					} else {
						alert("No disponible");
					}
				},
				error: function(data) {
					alert("No disponible");
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
		<td><input type="radio" id="cod" name="codigo" value="L001"></td>
		<td>L001 - Libro 01</td>
	</tr>
	<tr>
		<td><input type="radio" id="cod" name="codigo" value="L002"></td>
		<td>L002 - Libro 02</td>
	</tr>
	<tr>
		<td><input type="radio" id="cod" name="codigo" value="L003"></td>
		<td>L003 - Libro 03</td>
	</tr>
	<tr>
		<td><input type="radio" id="cod" name="codigo" value="L004"></td>
		<td>L004 - Libro 04</td>
	</tr>
	<tr>
		<td><input type="radio" id="cod" name="codigo" value="L005"></td>
		<td>L005 - Libro 05</td>
	</tr>
</table>
<br />
<input type="button" id="boton1" value="Consultar" width=10px />
<span id="span1"></span>


</body>
</html>

