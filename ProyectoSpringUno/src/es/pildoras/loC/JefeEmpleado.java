package es.pildoras.loC;

public class JefeEmpleado  implements Empleados{

    private CreacionInformes informeNuevo;

    public JefeEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas(){

        return "Gestiono las cuestiones relativas a m is empleados de seccion";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el jefe con arreglos " + informeNuevo.getInforme();
    }
}
