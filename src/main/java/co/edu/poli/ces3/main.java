package co.edu.poli.ces3;

import co.edu.poli.ces3.models.autofact.Distribuidores;
import co.edu.poli.ces3.models.autofact.Prefacturas;
import co.edu.poli.ces3.models.autofact.Productos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        try
        {
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Prefacturas.xml"));
            TypeReference<List<Prefacturas>> typeReference = new TypeReference<List<Prefacturas>>(){};
            List<Prefacturas> prefacturas = mapper.readValue(inputStream, typeReference);
            ArrayList<Prefacturas> listPrefactura = new ArrayList<Prefacturas>();
            for (Prefacturas x:prefacturas) {
                Prefacturas pre = new Prefacturas(x.getNombre(),x.getFechaSubida(),x.isEstado(),x.getDistribuidores());
                listPrefactura.add(pre);
            }

            System.out.println("                                            Reportes Prefacturas Don Churro S.A.S                       ");
            for (Prefacturas p:listPrefactura){
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-20s %-15s %-15s\n", "Nom. Prefactura", "Fec. Subida", "Estado");
                String fecha = String.format("%tF", p.getFechaSubida());
                System.out.printf("%-20s %-15s %-15s\n", p.getNombre(), fecha.toString(), p.isEstado());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("                                        Distribuidores y Productos  "+  p.getNombre()                                                   );
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.printf("%-20s %-15s %-30s %-15s %-15s %-10s %-20s %-15s\n",
                        "Distribuidores",
                        "Codigo",
                        "Producto",
                        "Cantidad",
                        "Unidad",
                        "Valor",
                        "IVA",
                        "Valor Total",
                        "Estado");
                for (Distribuidores dist:p.getDistribuidores()){
                    for(Productos prod:dist.getProductos()){
                        System.out.printf("%-20s %-15s %-30s %-15s %-15s %-15s %-10s %-20s %-15s\n",
                                dist.getNombre(),
                                prod.getCode(),
                                prod.getNombre(),
                                prod.getCantidad(),
                                prod.getUnidad(),
                                "$"+ prod.getTotalNeto() + " COP",
                                prod.getIva() * 100 + "%",
                                "$"+ (prod.getTotalNeto() * prod.getCantidad()) + " COP",
                                prod.getProceso());
                    }
                }
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
