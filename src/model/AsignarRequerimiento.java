package model;

public class AsignarRequerimiento {
private int idRequerimiento;
private String descripcion;
private int estado;
private int rut;
private int idDepartamento;
private int idDepartamentoAsigna;
private int idGerencia;

    public AsignarRequerimiento() {
    }

    public AsignarRequerimiento(int idRequerimiento, String descripcion, int estado, int rut, int idDepartamento, int idDepartamentoAsigna, int idGerencia) {
        this.idRequerimiento = idRequerimiento;
        this.descripcion = descripcion;
        this.estado = estado;
        this.rut = rut;
        this.idDepartamento = idDepartamento;
        this.idDepartamentoAsigna = idDepartamentoAsigna;
        this.idGerencia = idGerencia;
    }

    public int getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(int idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdDepartamentoAsigna() {
        return idDepartamentoAsigna;
    }

    public void setIdDepartamentoAsigna(int idDepartamentoAsigna) {
        this.idDepartamentoAsigna = idDepartamentoAsigna;
    }

    public int getIdGerencia() {
        return idGerencia;
    }

    public void setIdGerencia(int idGerencia) {
        this.idGerencia = idGerencia;
    }
}
