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
       // Empleados Maria = contexto.getBean("miSecretarioEmpleado",Empleados.class);

        //SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
        DirectorEmpleado Juan = contexto.getBean("miEmpleado",DirectorEmpleado.class);

        //Paso 3) Utilizar el bean

      //  System.out.println(Juan.getTareas());
        // System.out.println(Juan.getInforme());

         /* System.out.println(Maria.getTareas());
          System.out.println(Maria.getInforme());
          System.out.println("Email:" + Maria.getEmail());
        System.out.println(Maria.getNombreEmpresa());
          */

        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        System.out.println("Email:" + Juan.getEmail());
        System.out.println(Juan.getNombreEmpresa());

        // Paso 4) Cerrar el XML-

        contexto.close();
    }
}
