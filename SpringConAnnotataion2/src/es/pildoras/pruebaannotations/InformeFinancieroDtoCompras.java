package es.pildoras.pruebaannotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Informe Financiero del departamento de compras año 2018";
    }
}
