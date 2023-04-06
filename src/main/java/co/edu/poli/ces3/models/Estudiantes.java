package co.edu.poli.ces3.models;

import java.util.List;

public class Estudiantes {
    private String nombre;

    private int edad;
    private String comentario;

    List<Materias> materias;

    public List<Materias> getMaterias(){
        return materias;
    }

    public void setMaterias(List<Materias> materias){
        this.materias = materias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
