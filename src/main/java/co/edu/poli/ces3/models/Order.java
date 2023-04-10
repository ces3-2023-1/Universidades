package co.edu.poli.ces3.models;

import java.util.List;

public class Order {

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(String fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Direction getDireccion() {
        return direccion;
    }

    public void setDireccion(Direction direccion) {
        this.direccion = direccion;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private String orden;
    private String fechaOrden;

    private Direction direccion;
    List<Item> items;
}
