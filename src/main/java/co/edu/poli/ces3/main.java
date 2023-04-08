package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Estudiantes;
import co.edu.poli.ces3.models.Materias;
import co.edu.poli.ces3.models.autofact.Distribuidores;
import co.edu.poli.ces3.models.autofact.Prefacturas;
import co.edu.poli.ces3.models.autofact.Productos;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.lang.reflect.Type;
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

            System.out.println("                Reportes Prefacturas Don Churro S.A.S                                    ");
            for (Prefacturas x:prefacturas) {
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Nombre: "+ x.getNombre());
                System.out.println("Fecha Subida: "+ x.getFechaSubida());
                System.out.println("Resposable De: "+ x.getAudit_createBy());

                System.out.println("                Distribuidores          ");
                for(Distribuidores dist:x.getDistribuidores()) {
                    System.out.println("Nom. Distribuidor: "+ dist.getNombre());
                    System.out.println("Codigo Distribuidor: "+ dist.getCodigo());
                    System.out.println("                Productos           ");

                    for (Productos prod:dist.getProductos()) {
                        System.out.println("Cod. Producto: "+ prod.getCode());
                        System.out.println("Nombre Producto: "+prod.getNombre());
                        System.out.println("Cantidad: "+ prod.getCantidad());
                        System.out.println("Valor: $"+ prod.getTotalNeto());
                        System.out.println("IVA: "+ prod.getIva() * 100 + "%");
                        System.out.println("Valor Total: $" + (prod.getTotalNeto() * prod.getCantidad()) * prod.getIva());
                        System.out.println("Descripcion: "+ prod.getDescripcion());
                        System.out.println("Estado: "+ prod.getProceso());
                    }
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
