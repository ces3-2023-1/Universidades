package co.edu.poli.ces3.models.autofact;

public class Productos extends  LogAudits {
    private String nombre;
    private  int cantidad;
    private String unidad;
    private double totalNeto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setTotalNeto(double totalNeto) {
        this.totalNeto = totalNeto;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public double getTotalNeto() {
        return totalNeto;
    }

    public double getIva() {
        return iva;
    }

    public String getFormapago() {
        return formapago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private double iva;
    private String formapago;
    private String descripcion;
}
