package co.edu.poli.ces3.models;

import java.util.List;

public class Student {
    private String nombre;
    private int edad;
    private String comentario;

    private String documento;

    private String Nacionalidad;

    private String tipoDocumento;

    List<Subject> materias;

    public List<Subject> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Subject> materias) {
        this.materias = materias;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
