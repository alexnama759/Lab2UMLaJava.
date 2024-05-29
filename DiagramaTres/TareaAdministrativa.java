package DiagramaTres;

public class TareaAdministrativa extends Tarea {

    public TareaAdministrativa(String nombre) {
        super(nombre);
    }

    public void TareaAdministrativa() {
        System.out.println("Ejecutando tarea administrativa: " + getNombre());
    }
}

