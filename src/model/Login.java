package model;

import dao.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends Conexion {

    public boolean autentificacion(String nombreUsuario,String contraseña){

        PreparedStatement ps = null;
        ResultSet rs= null ;

        try {

            String consulta ="select * from usuario where nombreUsuario = ? and password = ?";

            ps = getConexion().prepareStatement(consulta);
            ps.setString(1,nombreUsuario);
            ps.setString(2,contraseña);

           rs = ps.executeQuery();
            if (rs.absolute(1)){
                return true;
            }
        }catch (Exception e){
            System.err.println("error"+e);
        }
        finally {

                try {
                    if (getConexion()!=null) { getConexion().close();}
                    if (ps != null){ps.close();}
                    if (rs != null){rs.close();}
                } catch (SQLException e) {
                    System.err.println("error"+e);
                }

        }

        return false;
    }

//    public static void main(String[] args) {
//
//        Login l = new Login();
//
//        System.out.println(l.autentificacion("mfuentes","mfuentes"));
//    }

}
