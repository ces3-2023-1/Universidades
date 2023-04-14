package co.edu.poli.ces3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import co.edu.poli.ces3.models.inventarioProductos;
import java.io.*;
import java.util.List;

public class Main {
    public  Main(){

    }

    public static void main(String[] args) {
    int contador = 1;
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\Resource\\inventarioProductos.xml"));
            TypeReference<List<inventarioProductos>> typeReference = new TypeReference<List<inventarioProductos>>(){};

            List<inventarioProductos> productos = mapper.readValue(inputStream, typeReference);
            System.out.println("cool");

            for (inventarioProductos producto: productos) {
                if (producto.isEstadoProducto()){
                    System.out.println("==========" +contador + "==========");
                    System.out.println("nombre del producto: " + producto.getNombreProducto()+
                            "\nEstado del producto:"+producto.isEstadoProducto()+
                            "\nCantidad de productos:"+producto.getCantidadProductos()+
                            "\nVendedor del producto:"+producto.getVendedorProducto()+
                            "\nEmpresa a la que pertenece el vendedor:"+producto.getEmpresa()

                    );
                    System.out.println("=====================");
                }else{
                    System.out.println("La transacción número: " + contador + " esta desactivada");
                }


            contador = contador + 1;
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
