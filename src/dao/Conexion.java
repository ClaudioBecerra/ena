package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    private final String url = "jdbc:mysql://localhost:3306/requerimiento";
    protected Connection conexion;

    public void conectar() throws Exception {
        try {
            conexion = DriverManager.getConnection(url, "claudio", "admin");
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            throw e;
        }

    }


    public void cerrarConexion() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}
