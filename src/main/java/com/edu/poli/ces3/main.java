package com.edu.poli.ces3;

import com.edu.poli.ces3.models.Matter;
import com.edu.poli.ces3.models.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resourses\\Estudiante.xml"));
            //System.out.println(System.getProperty("user.dir"));
            TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>() {};
            List<Student> students = mapper.readValue(inputStream, typeReference);

            for (Student s: students) {
                System.out.println("----- Informacion estudiante -----");
                System.out.println("Nombre: " + s.getNombre() +", edad: " + s.getEdad() + ", comentario: " + s.getComentario() + ".");
                System.out.println("----- Listado de materias -----");
                for (Matter m: s.getMaterias()){
                    System.out.println("Cod. Registro: " + m.getCodReg() +", codigo: " + m.getCodigo() + ", nombre de la materia: " + m.getNombreMat() + ", estado: " + m.getEstado() + ".");

                }

            }

            System.out.println("cool!!");

        }catch (Exception e){
            System.out.println("mi error: " + e.getMessage());

        }

    }
}
