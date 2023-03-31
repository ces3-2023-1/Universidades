package co.edu.poli.ces3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.Students;

import java.io.*;
import java.util.List;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
    try {
        ObjectMapper mapper = new XmlMapper();
        InputStream inputStream = new FileInputStream(new File("src\\resources\\Estudiantes.xml"));/*permite leer todo tipo de lectura de datos para poder procesarlos*/
        TypeReference<List<Students>> typeReference = new TypeReference<List<Students>>(){};
        List<Students> students = mapper.readValue(inputStream, typeReference);

        System.out.println( "OK");

        for (Students x: students){
            System.out.println("**************************");
            System.out.println("Estudiantes con documento " + x.getDocumento().toUpperCase());
            System.out.println("Estudiantes con documento " + x.getTipoDocumento().toUpperCase());
        }
        System.out.println(System.getProperty("user.dir"));//validar donde compila el programa y asi crear una ruta relativa
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    }
}
