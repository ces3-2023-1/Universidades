package co.edu.poli.ces3.models;

public class Materias {
    private String codeRegistro;
    private String codigo;
    private String nombreMat;
    private boolean estado;

    public String getCodeRegistro() {
        return codeRegistro;
    }

    public void setCodeRegistro(String codeRegistro) {
        this.codeRegistro = codeRegistro;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public boolean isEstado() {
        return estado;
    }
}
