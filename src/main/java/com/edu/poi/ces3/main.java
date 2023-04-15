package com.edu.poi.ces3;

import models.Servicio;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Servicio.xml"));
            TypeReference<List<Servicio>> typeReference = new TypeReference<List<Servicio>>(){};
            List<Servicio> servicios = mapper.readValue(inputStream, typeReference);

            System.out.println("cool!!");

            for (Servicio x: servicios) {
                System.out.println("**********************");
                System.out.println("Nombre: " + x.getNombre());
                System.out.println("Apellido: " + x.getApellido());
                System.out.println("Documento: " + x.getCedula());
                System.out.println("Placa: " + x.getTipoVehiculo());
                System.out.println("Direccion: " + x.getDireccion());
                System.out.println("Descripción: " + x.getDescripcion());
                System.out.println("**********************");
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}

