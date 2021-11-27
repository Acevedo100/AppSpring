package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

    public static void main(String[] args) {


        // Llamamos al xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Pedimos un bean al contenedor
        Empleados Jose = contexto.getBean("comercialExperimentado",Empleados.class);

        //Usamos el bean que pedimos

        System.out.println(Jose.getInformes());
        System.out.println(Jose.getTareas());

        //Cerramos el contex
        contexto.close();

    }
}
