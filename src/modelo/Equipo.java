/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Equipo {

    private Integer codigo;
    private String nombre;
    private Jugador Capitan;
    private Integer gol;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(Integer codigo, String nombre, Jugador Capitan, Integer gol, ArrayList<Jugador> jugadores) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Capitan = Capitan;
        this.gol = gol;
        this.jugadores = jugadores;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getCapitan() {

        return Capitan;
    }

    public void setCapitan(Jugador Capitan) {
        this.Capitan = Capitan;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Integer getGol() {
        return gol;
    }

    public void setGol(Integer gol) {
        this.gol = gol;
    }

    public void agregarJugador(Jugador jugador) {

        jugadores.add(jugador);
        System.out.println("Se ha agregado el jugador" + jugador.getNombre() + " al equipo" + nombre);

    }

    @Override
    public String toString() {
        return "Equipo{" + "codigo=" + codigo + ", nombre=" + nombre + ", Capitan=" + Capitan + ", gol=" + gol + ", jugadores=" + jugadores + '}';
    }

}
