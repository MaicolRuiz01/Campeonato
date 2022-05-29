/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Jugador {
    
    private String nombre;
    private Integer  id;
    private String posicion;
    private Integer dorsal;
    private Integer codequipo;

    public Jugador() {
    }

    public Jugador(String nombre, Integer id, String posicion, Integer dorsal, Integer codequipo) {
        this.nombre = nombre;
        this.id = id;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.codequipo = codequipo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Integer getCodequipo() {
        return codequipo;
    }

    public void setCodequipo(Integer codequipo) {
        this.codequipo = codequipo;
    }

    

   

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", posicion=" + posicion + ", dorsal=" + dorsal + ", codequipo=" + codequipo + '}';
    }
    
    
    
}
