package co.edu.elpoli.ces3.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.StringJoiner;

public class Subject {
    @JacksonXmlProperty(isAttribute = true, localName = "codigo")
    private String code;

    @JacksonXmlProperty(localName = "nombre")
    private String name;

    @JacksonXmlProperty(localName = "activo")
    private boolean active;

    public Subject() { }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Subject.class.getSimpleName() + "(", ")")
            .add("code='" + code + "'")
            .add("name='" + name + "'")
            .add("active=" + active)
            .toString();
    }
}
