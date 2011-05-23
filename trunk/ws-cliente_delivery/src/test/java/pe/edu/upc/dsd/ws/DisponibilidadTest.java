package pe.edu.upc.dsd.ws;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisponibilidadTest {

	private Disponibilidad disponibilidad;

    public DisponibilidadTest() {
            ApplicationContext context = new ClassPathXmlApplicationContext(
                            "/applicationContext.xml");
            this.disponibilidad = context.getBean("disponibilidadClient", Disponibilidad.class);
    }

    @Test
    public void testDisponibilidad() {
    		String strRec="RD001";
    		int cont=0;
    		//consultar recurso
    		System.out.println("CONSULTAR RECURSO");
    		System.out.println("Recurso " + strRec + ": " + disponibilidad.consultarRecurso(strRec, "23/05/11", "12:33"));
    		//asignar recurso
    		System.out.println("ASIGNAR RECURSO");
    		System.out.println("Recurso " + strRec + ": " + disponibilidad.asignarRecurso(strRec, "SD001"));
    		// listar recursos
    		System.out.println("LISTAR RECURSOS");
    		List<String> lista = new ArrayList<String>();
    		lista=disponibilidad.listarRecursos(0);
    		while(cont < lista.size())
    		{
    			System.out.println("Recurso N°" + (cont+1) + ": " + lista.get(cont));
    			cont++;
    		}    		
    }
}
