package models;

public class Grua {
    private String nombres;

    private String apellido;

    private String cedula;

    private String vehiculo;

    private String direccion;

    private String descripcion;

    private String urgencia;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }


    public String getUrgencia() {
        return urgencia;
    }


    public void setUrgencia(String urgencia) {
        this.urgencia =  urgencia;
    }

}
