package co.edu.elpoli.ces3.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Student {
    @JacksonXmlProperty(isAttribute = true, localName = "nombre")
    private String name;

    @JacksonXmlProperty(localName = "edad")
    private int age;

    @JacksonXmlProperty(localName = "materias")
    private List<Subject> subjects = Collections.emptyList();

    public Student() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "(", ")")
            .add("name='" + name + "'")
            .add("age=" + age)
            .add("subjects=" + subjects)
            .toString();
    }
}
