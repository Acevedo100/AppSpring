package es.pildoras.loC;

public class SecretarioEmpleado implements Empleados {


    //Declaracion de campos
    private CreacionInformes informeNuevo;

    private String email;

    private String nombreEmpresa;

    // Metodos gt / st

    public CreacionInformes getInformeNuevo() {
        return informeNuevo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }


    //Metodos de la interfaz
    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }

    @Override
    public String getInforme() {
        return "Informe generado por el secretario "+ informeNuevo.getInforme();
    }
}
