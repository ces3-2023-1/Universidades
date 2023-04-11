package co.edu.poli.ces3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import co.edu.poli.ces3.models.Student;
import co.edu.poli.ces3.models.Order;
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
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Estudiantes.xml"));
            TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>(){};
            List<Student> students = mapper.readValue(inputStream, typeReference);

            System.out.println("cool!!");

            for (Student x: students) {
                System.out.println("**********************");
                System.out.println("Estudiante con documento: " + x.getDocumento());
                System.out.println("Tipo de documento: " + x.getTipoDocumento());
                System.out.println("**********************");
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Pedidos.xml"));
            TypeReference<List<Order>> typeReference = new TypeReference<List<Order>>(){};
            List<Order> orders = mapper.readValue(inputStream, typeReference);


            for (Order x: orders) {
                System.out.println("**********************");
                System.out.println("Codigo pedido: " + x.getCodigo()+
                        "\nEstado:"+x.getEstado()+"\nDirección pedido:"+x.getDireccionPedido()+"\nTotal:"+x.getTotal());
                x.getClientes().forEach(row -> {System.out.println(row.getNombreCliente());});
                System.out.println("**********************");/*+x.getClientes().forEach(row -> {System.out.print(row.getNombreCliente())})+*/
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
