package pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
    public static void main(String[] args) {

        // Leer xml de configuracion
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Pedir un beans con annotations
        Empleados Antonio = contexto.getBean("ComercialExperiemntado",Empleados.class);

        // Usar el beans que solicitamos
        System.out.println(Antonio.getInformes());
        System.out.printf(Antonio.getTareas());

        // Cerramos el contexto
        contexto.close();
    }
}
