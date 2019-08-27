package dao;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl extends Conexion implements UsuarioDAO {
    @Override
    public List<Usuario> listarTodos() {
        return null;
    }

    @Override
    public List<Usuario> listarPorId(int id) throws SQLException {

        List<Usuario> list = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            this.conectar();
            ps = this.conexion.prepareStatement("select * from usuario where idDepartamento = ? ");
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setRut(rs.getInt("rut"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellidos(rs.getString("apellidos"));
                usuario.setNombreUsuario(rs.getString("nombreUsuario"));
                usuario.setPassword(rs.getString("password"));
                usuario.setIdDepartamento(rs.getInt("idDepartamento"));

                list.add(usuario);
            }
        } catch (Exception e) {
            System.err.println("error" + e.getMessage());
        }
        cerrarConexion();
            return list;



    }

    @Override
    public Usuario leerPorId(int id) {
        return null;
    }

    @Override
    public void registrar(Usuario usuario) {

    }

    @Override
    public void actualizar(Usuario usuario) {

    }

    @Override
    public void eliminar(int id) {

    }
}
