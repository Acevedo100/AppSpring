package es.pildoras.loC;

public class DirectorEmpleado implements Empleados {

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


    // Metodo init. Ejecuta las tareas antes de que el bean este disponible

    public void metodoInicial(){

        System.out.println("Dentro del metodo init aqui irian las tareas a ejecutar antes de que el bean este liesto");
    }


    // Metodo  destroy. Ejecuta las tareas despues de que el bean este disponible
    public void metodoFinal(){

        System.out.println("Dentro del metodo destroy aqui irian las tareas a ejecutar despues  de que el bean sea usado. ");
    }
}
