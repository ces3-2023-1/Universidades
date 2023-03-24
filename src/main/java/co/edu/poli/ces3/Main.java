package co.edu.poli.ces3;

import co.edu.poli.ces3.models.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new XmlMapper();
            InputStream inputStream = new FileInputStream( new File("C:\\Users\\miguel sosa\\Downloads\\ces3\\projects\\Universidades\\src\\eresources\\Estudiantes.xml"));
            TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>(){

            };
            System.out.println("Cool!!");
            System.out.println(System.getProperty("user.dir"));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}