package co.edu.poli.ces3.models.autofact;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Distribuidores {
    private String nombre;
    private String codigo;
    private List<Productos> productos;
    @JsonCreator
    public Distribuidores(@JsonProperty("nombre") String nombre,@JsonProperty("codigo")  String codigo,@JsonProperty("productos") List<Productos> productos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Productos> getProductos() {
        return productos;
    }
}
