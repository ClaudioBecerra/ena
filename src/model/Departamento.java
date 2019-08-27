package model;

public class Departamento {
    private int idDepartamento;
    private String descripcion;
    private int id;

    public Departamento() {
    }

    public Departamento(int idDepartamento, String descripcion, int id) {
        this.idDepartamento = idDepartamento;
        this.descripcion = descripcion;
        this.id = id;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
