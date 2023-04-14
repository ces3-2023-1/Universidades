package co.edu.poli.ces3.models;

public class inventarioProductos {


     String nombreProducto;
     int cantidadProductos;
     String vendedorProducto;
     String empresa;
     int idProducto;
     boolean estadoProducto;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getVendedorProducto() {
        return vendedorProducto;
    }

    public void setVendedorProducto(String vendedorProducto) {
        this.vendedorProducto = vendedorProducto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public boolean isEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
}
