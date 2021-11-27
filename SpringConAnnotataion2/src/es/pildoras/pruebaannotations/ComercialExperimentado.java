package es.pildoras.pruebaannotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class ComercialExperimentado implements Empleados{

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
