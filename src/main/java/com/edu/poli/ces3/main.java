package com.edu.poli.ces3;

import com.edu.poli.ces3.models.Servicios;
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
            InputStream inputStream = new FileInputStream(new File("src\\resourses\\Servicio.xml"));
            TypeReference<List<Servicios>> typeReference = new TypeReference<List<Servicios>>() {};
            List<Servicios> students = mapper.readValue(inputStream, typeReference);

            for (Servicios s: students) {
                System.out.println("----- Informacion del Servicio -----");
                System.out.println(" ");
                if(s.getActivo() == false ){
                    System.out.println("El servicio: " +s.getNombre() +", con un valor de: $"+s.getValor() +" pesos, No esta activo.");
                }else{
                    System.out.println("El servicio: " + s.getNombre() +", con un valor de: $" + s.getValor() + " pesos, Si esta activo.");
                }
                if(s.getValor() >= 30000){
                    System.out.println("Servicio con costo superior a 30 mil pesos: " + s.getNombre());
                    System.out.println(" ");

                }else{
                    System.out.println("Servicio con costo inferior a 30 mil pesos: " + s.getNombre());
                    System.out.println(" ");

                }
            }


        }catch (Exception e){
            System.out.println(e.getMessage());

        }

    }
}
