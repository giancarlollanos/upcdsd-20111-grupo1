package pe.edu.upc.dsd.rs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import junit.framework.Assert;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;

public class RestClientTestUsuarios {

	@Test
	public void asignar() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-control_recursos/rest/Disponibilidad/asignar/RD001/PD001");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("Asignado", reader.readLine());
	}

	@Test
	public void consultar() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-control_recursos/rest/Disponibilidad/consultar/RD001/fecha/hora");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("Disponible", reader.readLine());
	}

	@Test
	public void listar() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-control_recursos/rest/Disponibilidad/listar/0");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("RD001,RD002,RD003,RD004", reader.readLine());
	}

}
