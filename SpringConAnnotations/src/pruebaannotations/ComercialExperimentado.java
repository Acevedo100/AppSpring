package pruebaannotations;


import org.springframework.stereotype.Component;

@Component("ComercialExperiemntado")
public class ComercialExperimentado implements Empleados{


    @Override
    public String getTareas() {
        return "Vender vender y mas verder!!";
    }

    @Override
    public String getInformes() {
        return "Es un informe entregado por el empleado" ;
    }
}
