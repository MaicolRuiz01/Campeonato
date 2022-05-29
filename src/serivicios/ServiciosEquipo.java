/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serivicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Equipo;

/**
 *
 * @author Usuario
 */
public class ServiciosEquipo {
    
     public static void registrarEquipo(Connection conexion, Equipo equipo) throws SQLException{
        
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Insert into equipo(codigo, nombre, capitan) Values(?,?,?)");
            
            consulta.setInt(1, equipo.getCodigo());
            consulta.setString(2, equipo.getNombre());
            consulta.setString(3, equipo.getCapitan().getNombre());
            consulta.execute();
            System.out.println("Equipo guardado Guardado");
        
        }catch(SQLException ex){
            System.err.println("No se ha guardado el equipo");
            throw  new SQLException(ex.getMessage());
        
        }
    }
    
}
