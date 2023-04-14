package co.edu.poli.ces3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.Students;
import models.Producto;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new XmlMapper();

            InputStream inputStream = new FileInputStream( new File("src\\resources\\Producto.xml"));

            TypeReference <List<Producto>> typeReference = new TypeReference<List <Producto>>(){};
            List<Producto> listaProductos = mapper.readValue(inputStream,typeReference);

            System.out.println( "OK");

            for (Producto x:  listaProductos){
                System.out.println("******************************************************************************");
                System.out.println("Producto con id de producto: " + x.getIdProducto());
                System.out.println("Id de categoria: " + x.getIdCategoria());
                System.out.println("Código: " + x.getCodigoProd());
                System.out.println("Nombre: " + x.getNombreProd());
                System.out.println("Descripción: " + x.getDescripcionProd());
                System.out.println("");
                System.out.println("******************************************************************************");
                System.out.println("");
            }
            System.out.println("GRACIAS");
            //System.out.println(System.getProperty("user.dir"));

        }catch (IOException e){


            System.out.println(e.getMessage());
        }

    }
}
