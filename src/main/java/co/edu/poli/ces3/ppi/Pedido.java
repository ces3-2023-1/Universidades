package co.edu.poli.ces3.ppi;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.List;

public class Pedido {
    private String numero_pedido;
    private Date fecha_entrega;

    private Date fecha_creacion;
    private String transportista;
    private String cliente;

    private String direccion;

    private List<Productos> productos;

    private String cometario;


    //Métodos


    public String getCometario() {
        return cometario;
    }

    public void setCometario(String cometario) {
        this.cometario = cometario;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getNumero_pedido() {
        return numero_pedido;
    }


    public void setNumero_pedido(String numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public String getFecha_entregaFormat() {
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");

        return dt1.format(fecha_entrega) ;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero_pedido='" + numero_pedido + '\'' +
                ", fecha_entrega=" + getFecha_entregaFormat()+" \n"  +
                ", fecha_creacion=" + fecha_creacion +
                ", transportista='" + transportista + '\'' +
                ", cliente='" + cliente + '\'' +
                ", direccion='" + direccion + '\'' +
                ", productos=" + productos.toString() +
                ", cometario='" + cometario + '\'' +
                '}';
    }
}
