package dao;

import model.Gerencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GerenciaDaoImpl extends Conexion implements GerenciaDAO{
    @Override
    public List<Gerencia> listarTodos() throws SQLException {

        List<Gerencia> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conectar();

            ps = this.conexion.prepareStatement("select * from gerencia");
            rs = ps.executeQuery();


            while (rs.next()) {

                Gerencia ger = new Gerencia();
                ger.setId(rs.getInt("idGerencia"));
                ger.setTipo(rs.getString("descripcion"));

                list.add(ger);
            }

        } catch (Exception e) {

            System.err.println("error" + e.getMessage());

        }
        cerrarConexion();
            return list;



    }

    @Override
    public List<Gerencia> listarPorId(int id) {
        return null;
    }

    @Override
    public Gerencia leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Gerencia gerencia) {

    }

    @Override
    public void actualizar(Gerencia gerencia) {

    }

    @Override
    public void eliminar(int id) {

    }

}
