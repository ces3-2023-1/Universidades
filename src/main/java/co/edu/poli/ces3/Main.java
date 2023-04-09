package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Student;
import co.edu.poli.ces3.ppi.Pedido;
import co.edu.poli.ces3.ppi.Productos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Peidido.xml"));
            TypeReference<List<Pedido>> typeReference = new TypeReference<List<Pedido>>() {
            };
            List<Pedido> pedidos = mapper.readValue(inputStream, typeReference);
            System.out.println("!Todo Bien ☺ ¡");
            for (Pedido p: pedidos) {
                System.out.println("=============================================================================");
                System.out.println("El pedido #  "+p.getNumero_pedido() +" Para el cliente: "+p.getCliente());
                System.out.println("Fecha de creación del pedido: "+p.getFecha_creacion().toGMTString());
                System.out.println("Fecha de entrega: "+p.getFecha_entregaFormat());
                System.out.println("Entregar a la dirección: "+p.getDireccion());
                System.out.println("Trasportista encargado: "+p.getTransportista());
                if (p.getCometario() != null ){
                    System.out.println("Observación / Cometentarios ");
                    System.out.println(p.getCometario());
                }

                System.out.println("=======================Productos=======================");
                List<Productos> productos = p.getProductos();
                double total=0;
                for (int i = 0; i < productos.size(); i++) {
                    System.out.println((i+1)+"-- El producto: " + productos.get(i).getNombre() +" Código: "+productos.get(i).getCod_producto());
                    System.out.println("    Categoria: "+productos.get(i).getCategoria());
                    System.out.println("    Precio: "+productos.get(i).getPrecio());
                    System.out.println("    Cantidad: "+productos.get(i).getCantidad());
                    double subtotal= (productos.get(i).getPrecio()*productos.get(i).getCantidad());
                    System.out.println("    Subtotal = "+subtotal);
                    total= subtotal+total;
                }
                System.out.println("=======================================================");
                System.out.println("    Total = "+total);
                System.out.println("=============================================================================");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        /**
         *
         * Clase de XML hasta el 30/03/2023
         try {
         ObjectMapper mapper = new  XmlMapper();
         InputStream inputStream = new FileInputStream(new File("src\\resources\\Estudiantes.xml"));

         TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>() {};
         List<Student> students = mapper.readValue(inputStream, typeReference);
         System.out.println(students.toString());
         System.out.println("Cool");


         //for (Student s: students) {
         //    System.out.println("name is: " +s.getNombre()+" is: "+s.getEdad()+" about student:"+s.getComentario() );
         //}

         for (Student x: students) {
         System.out.println("**********************");
         System.out.println("Estudiante con documento: " + x.getDocumento());
         System.out.println("Tipo de documento: " + x.getTipoDocumento());
         System.out.println("**********************");
         }


         }catch(FileNotFoundException ex){

         System.out.println(ex.getMessage());
         System.out.println("1");
         ex.printStackTrace();
         }catch(Exception e){
         System.out.println(e.getMessage());
         e.printStackTrace();
         System.out.println("2");
         }
         */
    }
}
