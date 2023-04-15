package com.edu.poi.ces3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import models.Grua;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("C:\\Users\\Esteban\\Universidades\\src\\main\\resources\\Grua.xml"));
            TypeReference<List<Grua>> typeReference = new TypeReference<List<Grua>>(){};
            List<Grua> gruas = mapper.readValue(inputStream, typeReference);

            System.out.println("cool!!");

            for (Grua x: gruas) {
                System.out.println("**********************");
             /* System.out.println("Estudiante con documento: " + x.getDocumento());
                System.out.println("Tipo de documento: " + x.getTipoDocumento());  */
                System.out.println("Nombre: " + x.getNombres());
                System.out.println("Apellido: " + x.getApellido());
                System.out.println("Numero de cedula: " + x.getCedula());
                System.out.println("Tipo de vehiculo: " + x.getTipoVehiculo());
                System.out.println("Direccion: " + x.getDireccion());
                System.out.println("Descripción: " + x.getDescripcion());
                System.out.println("Urgencia: " + x.getUrgencia());
                System.out.println("**********************");
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
