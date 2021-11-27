package es.pildoras.loC;

public class SecretarioEmpleado implements Empleados {

    private CreacionInformes informeNuevo;

    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario "+ informeNuevo.getInforme();
    }
}
