/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Jugador {

    private String nombre;
    private String pais;
    private int puntaje;

    public Jugador() {
        this.nombre = "";
        this.pais = "";
        this.puntaje = 0;
    }

    public Jugador(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.puntaje = 0;
    }

    public Jugador(String nombre, String pais, int puntaje) {
        this.nombre = nombre;
        this.pais = pais;
        this.puntaje = puntaje;
    }

    public Jugador(Jugador jugador) {
        this.nombre = jugador.getNombre();
        this.pais = jugador.getPais();
        this.puntaje = jugador.getPuntaje();
    }

    public int cachipun() {
        return (int) (Math.random() * 3) + 1;
    }

    public void sumarPuntaje() {
        this.puntaje++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

}
