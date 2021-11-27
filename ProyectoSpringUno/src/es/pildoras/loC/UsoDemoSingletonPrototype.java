package es.pildoras.loC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

    public static void main(String[] args) {

        // Cargamos el Archivo de configuraciones XML

        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pedimos los beans al contenedor

        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        SecretarioEmpleado PEDRO= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        SecretarioEmpleado JUAN= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        SecretarioEmpleado JOSE= contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);

        System.out.println(Maria);

        System.out.println(PEDRO);

        System.out.println(JUAN);

        System.out.println(JOSE);

       /* if (Maria == Pedro) System.out.println("Apuntan al mismo objeto");
        else System.out.println("No se trata del mismo objeto ");

        */

    }

}
