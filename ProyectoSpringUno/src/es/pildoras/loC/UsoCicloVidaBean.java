package es.pildoras.loC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {
    public static void main(String[] args) {

        // Cargamos el xml de configuracuiones
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

        // Obtenemos del bean
        Empleados Jose = contexto.getBean("miEmpleado",DirectorEmpleado.class);


        //
        System.out.println(Jose.getInforme());

        // Cerrar el contexto

        contexto.close();

    }
}
