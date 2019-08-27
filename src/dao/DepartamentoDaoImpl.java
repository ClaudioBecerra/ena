package dao;

import model.Departamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoDaoImpl extends Conexion implements DepartamentoDAO {
    @Override
    public List<Departamento> listarTodos() throws SQLException {

        List<Departamento> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.conectar();

            ps = this.conexion.prepareStatement("select * from departamento");
            rs = ps.executeQuery();

            while (rs.next()) {

                Departamento dep = new Departamento();
                dep.setIdDepartamento(rs.getInt("idDepartamento"));
                dep.setDescripcion(rs.getString("descripcion"));
                dep.setId(rs.getInt("idGerencia"));

                list.add(dep);
            }

        } catch (Exception e) {

            System.err.println("error" + e.getMessage());

            cerrarConexion();
        }
        return list;
    }

    @Override
    public Departamento leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Departamento departamento) {

    }

    @Override
    public void actualizar(Departamento departamento) {

    }

    @Override
    public void eliminar(int id) {

    }


    @Override
    public List<Departamento> listarPorId(int id) throws SQLException {
        List<Departamento> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.conectar();
            ps = this.conexion.prepareStatement("select * from departamento where idGerencia = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();


            while (rs.next()) {

                Departamento dep = new Departamento();
                dep.setIdDepartamento(rs.getInt("idDepartamento"));
                dep.setDescripcion(rs.getString("descripcion"));
                dep.setId(rs.getInt("idGerencia"));
                list.add(dep);

            }
        } catch (Exception e) {
            System.err.println("error " + e.getMessage());
        }
        this.cerrarConexion();
        return list;

    }
}