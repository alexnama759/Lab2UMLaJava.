package DiagramaDos;

public class Pedido {
    private int precio;
    private String fecha;

    public Pedido(int precio, String fecha) {
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    // Getters and Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

