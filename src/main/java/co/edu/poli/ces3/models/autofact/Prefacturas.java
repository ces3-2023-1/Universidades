package co.edu.poli.ces3.models.autofact;

import java.util.Date;
import java.util.List;

public class Prefacturas extends LogAudits{
    private String nombre;
    private Date fechaSubida;
    private boolean estado;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDistribuidores(List<Distribuidores> distribuidores) {
        this.distribuidores = distribuidores;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaSubida(){
        return fechaSubida;
    }

    public boolean isEstado() {
        return estado;
    }

    public List<Distribuidores> getDistribuidores() {
        return distribuidores;
    }

    private List<Distribuidores> distribuidores;
}
