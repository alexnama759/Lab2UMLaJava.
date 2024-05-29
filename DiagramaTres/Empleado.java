package DiagramaTres;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public boolean hacerTarea(Tarea tarea) {
        System.out.println("El empleado " + nombre + " está haciendo la tarea: " + tarea.getNombre());
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

