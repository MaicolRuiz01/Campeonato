/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Jugador;
import serivicios.ServiciosJugador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Equipo;
import serivicios.ServiciosEquipo;

/**
 *
 * @author Usuario
 */
public class Registrar {

    public void RegistrarJug(Jugador jugador) {
        try {
            ServiciosJugador rj = new ServiciosJugador();
            rj.registrarJugador(Conexion.obtener(), jugador);
        } catch (Exception e) {

        }
    }

    public void RegistrarEqu(Equipo equipo) {
        try {
            ServiciosEquipo re = new ServiciosEquipo();
            re.registrarEquipo(Conexion.obtener(), equipo);
        } catch (Exception e) {

        }
    }

    public void Eliminar() throws ClassNotFoundException {
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM visitante");
            consulta.executeUpdate();

        } catch (SQLException ex) {

        }

    }

    public void actualizar(Jugador jug) throws ClassNotFoundException {

        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("UPDATE visitante SET municipio_origen=?");
            consulta.setInt(1, jug.getId());
            consulta.setString(2, jug.getPosicion());
            consulta.setInt(3, jug.getDorsal());
            consulta.setString(2, jug.getNombre());
            consulta.execute();

        } catch (SQLException ex) {

        }

    }

    public static String mostrar() {
        StringBuffer sb = new StringBuffer();
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("Select  id as Id,posicion as Posicion,dorsal as Dorsal, nombre as Nombre from jugador");
            ResultSet rs = consulta.executeQuery();
            int cont = 0;
            while (rs.next()) {
                sb.append(" ID " + rs.getString("Id") + "\n Posicion: " + rs.getString("Posicion") + " \n Dorsal:   " + rs.getString("Dorsal") + "\n Nombre: " + rs.getString("Nombre"));

                sb.append("--------------------------------------\n");

            }

        } catch (SQLException ex) {
            System.out.println("E1");
        } catch (ClassNotFoundException ex) {
            System.out.println("E2");
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sb.toString();

    }

}
