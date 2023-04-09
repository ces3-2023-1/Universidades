package co.edu.poli.ces3.ppi;

public class Productos {
    private String cod_producto;
    private String categoria;
    private Double precio;

    private int cantidad;

    private String nombre;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "cod_producto='" + cod_producto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
