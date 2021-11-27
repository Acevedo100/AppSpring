package es.pildoras.pruebaannotations;


import org.springframework.stereotype.Component;

@Component
public class InformFinancieroTrim3 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "PRESENTACION DE INFORME FAVORABLE DEL TRIMESTRE 3";
    }
}
