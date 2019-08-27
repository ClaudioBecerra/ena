package dao;

import java.sql.SQLException;

public interface AsignarRequerimientoDAO extends CRUD<model.AsignarRequerimiento> {
    void guardar(String descripcion,int estado, int rut, int idDepartamentoSolicita,int idDepartamentoAsigna, int idGerencia ) throws SQLException;

    }
