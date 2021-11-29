package es.pildoras.pruebaannotations;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration()
@ComponentScan("es.pildoras.pruebaannotations")
@PropertySource("Classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

    //Definir el bean para informe financiero deptoCompras
    @Bean
    public  CreacionInformeFinanciero informeFinancieroDtoCompras(){ //Id del bean inyectado

        return new InformeFinancieroDtoCompras();
    }

    // Definir el bean para director financiero e inyectar dependencias.

    @Bean
    public Empleados directorFinanciero(){

        return new DirectorFinanciero(informeFinancieroDtoCompras());

    }

}
