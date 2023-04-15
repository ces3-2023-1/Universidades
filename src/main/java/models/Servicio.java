package models;

public class Servicio {

    private String nombre;

    private String apellido;

    private String cedula;

    private String vehiculo;

    private String direccion;

    private String descripcion;



    public Servicio() {
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


}


