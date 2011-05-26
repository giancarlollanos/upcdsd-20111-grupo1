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
	public void registrar() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-gestion_usuarios/rest/Usuario/registrar/codigo/nombre/idlogin/password/direccion/telefono");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("Registro de Usuario Satisfactorio", reader.readLine());
	}

/*	@Test
	public void actualizar() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-gestion_usuarios/rest/Usuario/actualizar/codigo/nombre/idlogin/password/direccion/telefono");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("Actualizacion de Usuario Satisfactoria", reader.readLine());
	}*/
	
	@Test
	public void login() throws Exception {
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpget = new HttpGet(
				"http://localhost:8080/rs-gestion_usuarios/rest/Usuario/login/rhumire/1234");
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();
		BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
		Assert.assertEquals("Login Satisfactorio", reader.readLine());
	}

}
