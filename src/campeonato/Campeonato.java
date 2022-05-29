/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campeonato;

import control.Controlador;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista v = new Vista();
        v.setVisible(true);
        Controlador c = new Controlador(v);
    }
    
}
