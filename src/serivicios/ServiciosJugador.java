/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serivicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Jugador;
/**
 *
 * @author Usuario
 */
public class ServiciosJugador {
    
    public static void registrarJugador(Connection conexion, Jugador jugador) throws SQLException{
        
        try{
            PreparedStatement consulta;
            consulta=conexion.prepareStatement("Insert into jugador (id,posicion,dorsal, nombre) Values(?,?,?,?)");
            
            consulta.setInt(1, jugador.getId());
            consulta.setString(2, jugador.getPosicion());
            consulta.setInt(3, jugador.getDorsal());
            consulta.setString(4, jugador.getNombre());
            consulta.execute();
            System.out.println("Jugador Guardado");
        
        }catch(SQLException ex){
            System.err.println("No se ha guardado el jugador");
            throw  new SQLException(ex.getMessage());
        
        }
    
    
    
    }
    
}
