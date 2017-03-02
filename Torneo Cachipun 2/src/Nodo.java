/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Nodo {

    private Jugador dato;
    private Nodo siguiente;

    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public Nodo(Jugador dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Jugador dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Jugador getDato() {
        return dato;
    }

    public void setDato(Jugador dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
