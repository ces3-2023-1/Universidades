package co.edu.poli.ces3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import co.edu.poli.ces3.models.Student;
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
            //System.out.println(System. getProperty("user.dir"));
        }catch(IOException e){
            System.out.println("mi error: "+e.getMessage());
            e.printStackTrace();
        }
    }

}
