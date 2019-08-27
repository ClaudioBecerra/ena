package dao;

import model.AsignarRequerimiento;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AsignarRequerimientoDaoImpl extends Conexion implements AsignarRequerimientoDAO {
    @Override
    public List<AsignarRequerimiento> listarTodos() {
        return null;
    }

    @Override
    public List<AsignarRequerimiento> listarPorId(int id) {
        return null;
    }

    @Override
    public AsignarRequerimiento leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(AsignarRequerimiento asignarRequerimiento) {

    }

    @Override
    public void actualizar(AsignarRequerimiento asignarRequerimiento) {

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void guardar(String descripcion, int estado, int rut, int idDepartamentoSolicita, int idDepartamentoAsigna, int idGerencia) throws SQLException {
        PreparedStatement ps = null;


        try {

            conectar();

            ps = this.conexion.prepareStatement("insert into  requerimiento (descripcion,estado,rut,idDepartamentoSolicita,idDepartamentoASignado,idGerencia) values (?,?,?,?,?,?)");
            ps.setString(1, descripcion);
            ps.setInt(2, estado);
            ps.setInt(3, rut);
            ps.setInt(4, idDepartamentoSolicita);
            ps.setInt(5, idDepartamentoAsigna);
            ps.setInt(6, idGerencia);
            if (ps.executeUpdate() == 1) {

            }
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }


        cerrarConexion();


    }

}

