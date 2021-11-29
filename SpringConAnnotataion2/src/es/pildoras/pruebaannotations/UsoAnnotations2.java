package es.pildoras.pruebaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

    public static void main(String[] args) {

    //leer el class de configuracion

        AnnotationConfigApplicationContext contexto  = new AnnotationConfigApplicationContext(EmpleadosConfig.class);


        //Pedir bean al contenedor con @Bean

        DirectorFinanciero empleado = contexto.getBean("directorFinanciero",DirectorFinanciero.class);

        System.out.println(empleado.getNombreEmpresa());
        System.out.println(empleado.getEmail());




      /*  Empleados empleados = contexto.getBean("directorFinanciero",Empleados.class);



        System.out.println(empleados.getTareas());
        System.out.println(empleados.getInformes());

       */







      /*  Empleados Jose = contexto.getBean("comercialExperimentado",Empleados.class);

        Empleados David = contexto.getBean("comercialExperimentado",Empleados.class);

        if (Jose == David) {
            System.out.println("Apuntan al mismo lado : \n" + " Jose : " +  Jose +
                "\n David : " + David );
        }  else {
            System.out.println("No apuntan al mismo lado : \n" + " Jose : " + Jose +
                    "\n David : " + David);
        }

       */


        contexto.close();

    }
}
