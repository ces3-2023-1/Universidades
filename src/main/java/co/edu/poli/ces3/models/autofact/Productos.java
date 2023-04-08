package co.edu.poli.ces3.models.autofact;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Productos extends  LogAudits {
    private String code;
    private String nombre;
    private int cantidad;
    private String unidad;
    private double totalNeto;
    private double iva;
    private String formapago;
    private String proceso;
    private String descripcion;

    @JsonCreator
    public Productos(@JsonProperty("code") String code,
                     @JsonProperty("nombre") String nombre,
                     @JsonProperty("cantidad") int cantidad,
                     @JsonProperty("unidad") String unidad,
                     @JsonProperty("totalNeto") double totalNeto,
                     @JsonProperty("iva") double iva,
                     @JsonProperty("formapago") String formapago,
                     @JsonProperty("proceso") String proceso,
                     @JsonProperty("descripcion") String descripcion) {
        this.code = code;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.totalNeto = totalNeto;
        this.iva = iva;
        this.formapago = formapago;
        this.proceso = proceso;
        this.descripcion = descripcion;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
}
