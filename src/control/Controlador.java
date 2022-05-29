/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Equipo;
import modelo.Jugador;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {
    
    Vista vista = null;
    Equipo equipo = new Equipo();
    
    public Controlador(Vista v) {
        super();
        vista = v;
        actionListener(this);
    }
    
    private void actionListener(ActionListener evt) {
        System.out.println("workin'");
        vista.btnAgregar1.addActionListener(evt);
        vista.btnAgregar2.addActionListener(evt);
        vista.btnLimpiar1.addActionListener(evt);
        vista.btnLimpiar2.addActionListener(evt);
        vista.btnMostrar.addActionListener(evt);
        
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            
            if (evt.getActionCommand().contentEquals("AGREGAR JUGADOR")) {
                
                Jugador jug = new Jugador();
                Registrar reg = new Registrar();
                jug.setId(Integer.parseInt(vista.txtID.getText()));
                jug.setNombre(vista.txtNombre.getText());
                jug.setDorsal(Integer.parseInt(vista.txtDorsal.getText()));
                jug.setPosicion(vista.combo.getModel().getSelectedItem().toString());
                System.out.println(jug.toString());
                reg.RegistrarJug(jug);
                
            }
            
            else if (evt.getActionCommand().contentEquals("AGREGAR EQUIPO")) {
                
                Equipo equipo = new Equipo();
                Registrar reg = new Registrar();
                Jugador capitan =new Jugador();
                equipo.setCodigo(Integer.parseInt(vista.txtCodigo.getText()));
                equipo.setNombre(vista.txtNombreEquipo.getText());
                capitan.setNombre(vista.txtCapitan.getText());
                equipo.setCapitan(capitan);
                System.out.println(equipo.toString());
                reg.RegistrarEqu(equipo);
                
            }else if(evt.getActionCommand().contentEquals(vista.btnLimpiar2.getActionCommand())){
                vista.txtCodigo.setText("");
                vista.txtNombreEquipo.setText("");
                vista.txtCapitan.setText("");
                
//            }else if(evt.getActionCommand().contentEquals(vista.btnLimpiar1.getActionCommand())){
//                vista.txtID.setText("");
//                vista.txtDorsal.setText("");
//                vista.txtNombre.setText("");
//                vista.combo.setSelectedIndex(0);
                
            }else if(evt.getActionCommand().contentEquals("MOSTRAR")){
                Registrar r = new Registrar();
                vista.area.setText(r.mostrar());
                
            
            
            }
            
        } catch(Exception e){
            
        }
        
    }
    
}
