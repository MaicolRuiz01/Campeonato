/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 57310
 */
public class Conexion {

    private static Connection cn;

    public static Connection obtener() throws ClassNotFoundException, SQLException {
        if (cn == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost/campeonato", "root", "");
                System.out.println("Conecta");
            } catch (SQLException ex) {
                System.out.println("E1");
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                System.out.println("E2");
                throw new ClassNotFoundException(ex.getMessage());
            }
        }
        return cn;

    }
    public static void cerrar() throws SQLException{
        if(cn!=null){
            cn.close();
        }
    }
}
