package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Category;
import co.edu.poli.ces3.models.Product;
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
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Productos.xml"));
            TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>(){};
            List<Product> Products = mapper.readValue(inputStream, typeReference);


            System.out.println("Productos:");
            for (Product pr : Products){

                System.out.println("------------------------------");
                System.out.println("nombre= "+pr.getNombre());
                System.out.println("precio compra= "+pr.getPreciocompra());
                System.out.println("precio venta= "+pr.getPrecioventa());
                System.out.println("stock= "+pr.getStock());
                System.out.println("ventas= "+pr.getVentas());
                System.out.println("fecha actualizacion= "+pr.getFechaactualizacion());
                System.out.println("categoria:");
                System.out.println("        * id categoria= "+pr.getCategoria().getIdcategoria());
                System.out.println("        * nombre categoria= "+pr.getCategoria().getNombrecategoria());
                System.out.println("        * fecha creacion= "+pr.getCategoria().getFechacreacion());
                System.out.println("------------------------------");
            }

            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}