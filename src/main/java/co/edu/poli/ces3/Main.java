package co.edu.poli.ces3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import models.Students;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {

            ObjectMapper mapper = new XmlMapper();

            InputStream inputStream = new FileInputStream( new File("src\\resources\\Estudiantes.xml"));

            TypeReference <List<Students>> typeReference = new TypeReference<List <Students>>(){};
            List<Students> students = mapper.readValue(inputStream,typeReference);

            System.out.println("Cool");

            String sCarpAct = System.getProperty("user.dir");

            System.out.println(sCarpAct);

        }catch (IOException e){


            System.out.println(e.getMessage());
        }

    }
}
