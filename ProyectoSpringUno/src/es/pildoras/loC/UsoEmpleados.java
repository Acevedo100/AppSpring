package es.pildoras.loC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

    public static void main(String[] args) {


        /*
        // Creacion de objetos de tipo Empleado

        Empleados Empleado1 = new DirectorEmpleado();

        //Usamos los objetos creados

        System.out.println(Empleado1.getTareas());

         */

        //Paso  1) crear un contexto

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Paso 2) Pedir el bean al archivo xml

       // Empleados Juan = contexto.getBean("miEmpleado",Empleados.class);

        Empleados Maria = contexto.getBean("miSecretarioEmpleado",Empleados.class);

        //Paso 3) Utilizar el bean

      //  System.out.println(Juan.getTareas());

       // System.out.println(Juan.getInforme());

          System.out.println(Maria.getTareas());
          System.out.println(Maria.getInforme());

        // Paso 4) Cerrar el XML-

        contexto.close();
    }
}
