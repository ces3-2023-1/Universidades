package com.edu.poli.ces3.models;

import java.util.List;

public class Student {
    String nombre;
    int edad;
    String comentario;

    public List<Matter> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Matter> materias) {
        this.materias = materias;
    }

    List<Matter> materias;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
