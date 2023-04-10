package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Item;
import co.edu.poli.ces3.models.Order;
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
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Pedidos.xml"));
            TypeReference<List<Order>> typeReference = new TypeReference<List<Order>>(){};
            List<Order> orders = mapper.readValue(inputStream, typeReference);


            for (Order x: orders) {
                System.out.println("**********************");
                System.out.println("Numero de orden: " + x.getOrden());
                System.out.println("Direccion: " + x.getDireccion().getStreet());
                System.out.println("Productos:");
                for (Item y: x.getItems()){
                    System.out.println("-"+ y.getNombreProducto());
                }
                System.out.println("**********************");
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}