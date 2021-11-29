package es.pildoras.pruebaannotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class ComercialExperimentado implements Empleados{

    // Ejecucion de codigo despues de crear el beans

    @PostConstruct
    public void ejecutaDespuesCreacion(){
        System.out.println("Ejecutando tras creacion de Bean");
    }


    // Ejecuacion de codigo despues de apagado el beans

    @PreDestroy
    public void ejecutaAntesDestruccion(){
        System.out.println("Ejecutando antes de la destruccion");
    }



    private  CreacionInformeFinanciero nuevoInforme;

   /* @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
        }
    */

    @Autowired
    @Qualifier("informeFinancieroTrim4")
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }

    // Metodos de la interfaz Empleados

    @Override
    public String getTareas() {
        return "Vender vender y mas vender";
    }

    @Override
    public String getInformes() {
       // return "Este es el informe entregado por el vendedor ";

        return nuevoInforme.getInformeFinanciero();
    }
}
