package co.edu.elpoli.ces3;

import co.edu.elpoli.ces3.models.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (InputStream inputStream = Files.newInputStream(Paths.get("src", "main", "resources", "estudiantes.xml"))) {
            XmlMapper mapper = new XmlMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            List<Student> students = mapper.readValue(inputStream, new TypeReference<List<Student>>() { });
            System.out.println(students.toString());
        } catch (IOException e) {
            System.err.println("Exception while parsing XML file");
            e.printStackTrace();
        }
    }
}
