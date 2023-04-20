package co.edu.poli.ces3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.WineCellar;


import java.util.List;
import java.io.*;


public class Main {
    public static void main(String[] args)  {
        try{

            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Bodega.xml"));
            // InputStream inputStream = new FileInputStream(new File("C:\\Users\\PM Andrés Henao\\IdeaProjects\\HELP_TECHNOLOGY\\src\\main\\resources\\Bodega.xml"));


            TypeReference<List<WineCellar>> typeReference = new TypeReference<List<WineCellar>>(){};
            List<WineCellar> wineCellar = mapper.readValue(inputStream, typeReference);

            //System.out.println( "OK");

            for (WineCellar x:  wineCellar){
                System.out.println("**************************");
                System.out.println("Bodega con id: " + x.getId_bodega().toUpperCase());
                System.out.println("Bodega ubicada en el departamento: " + x.getDepartamento().toUpperCase());
                System.out.println("Bodega en la ciudad de: " + x.getCiudad().toUpperCase());
                System.out.println("Bodega con el nombre: " + x.getNombre().toUpperCase());
                System.out.println("Bodega en la dirección: " + x.getDireccion().toUpperCase());
                System.out.println("Bodega donde el encargado es: " + x.getEncargado().toUpperCase());
                System.out.println("Bodega con el siguiente telefono: " + x.getTelefono().toUpperCase());
            }
            System.out.println(System.getProperty("user.dir"));//validar donde compila el programa y asi crear una ruta relativa
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}