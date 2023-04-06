package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Estudiantes;
import co.edu.poli.ces3.models.Materias;
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
            //InputStream--> Permite parte nativa java, captura de datos. Entradas y salidas de datos
            //FileInputStream --> declara un parametro que es un archivo, una imagen y una cadena string
            InputStream inputStream = new FileInputStream(new File("src\\resources\\Estudiantes.xml"));
            TypeReference<List<Estudiantes>> typeReference = new TypeReference<List<Estudiantes>>(){};
            List<Estudiantes> estudiantes = mapper.readValue(inputStream, typeReference);
            //Funcion identifica la rama del proyecto
            //System.out.println(System.getProperty("user.dir"));

            for (Estudiantes x:estudiantes) {
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Estudiante: "+ x.getNombre());
                System.out.println("Comentario: "+ x.getComentario());
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Materias");
                for (Materias mat:x.getMaterias()) {
                    System.out.println("Nom Materia: "+ mat.getNombreMat());
                    System.out.println("Codigo Registro: "+ mat.getCodeRegistro());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            }
            
            //System.out.println("Gonorrea");
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
