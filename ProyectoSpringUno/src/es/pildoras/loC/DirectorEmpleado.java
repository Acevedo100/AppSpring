package es.pildoras.loC;

public class DirectorEmpleado implements Empleados {


    // Creamos el objeto de la intefaz
    private CreacionInformes informeNuevo;


    // Creamos el constructor que inyecta la dependencia.
    public DirectorEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado por el director: " + informeNuevo.getInforme();
    }


}
