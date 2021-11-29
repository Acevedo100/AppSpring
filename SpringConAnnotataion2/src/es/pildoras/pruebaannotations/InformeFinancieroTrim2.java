package es.pildoras.pruebaannotations;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component()
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "PRESENTACION DE INFORME CATASTOFRICO DEL TRIMESTRE 2 ";
    }
}
