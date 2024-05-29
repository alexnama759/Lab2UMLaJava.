package DiagramaDos;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void pagar(Pedido pedido) {
        System.out.println("El cliente " + nombre + " ha pagado " + pedido.getPrecio() + " En la fecha " + pedido.getFecha());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
