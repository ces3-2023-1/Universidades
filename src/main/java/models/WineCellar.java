package models;
import java.util.List;
public class WineCellar {
    private String  id_bodega;

    private String departamento;

    private String ciudad;

    private String nombre;

    private String direccion;

    private String encargado;

    private String telefono;

    List<WineCellar> bodegas;

    public List<WineCellar> getBodegas(){
        return bodegas;
    }

    public String getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(String id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setBodegas(List<WineCellar> bodegas) {
        this.bodegas = bodegas;
    }
}
