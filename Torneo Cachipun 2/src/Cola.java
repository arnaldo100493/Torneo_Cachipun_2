/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Cola {

    private Nodo first;
    private Nodo last;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void push(Jugador dato) {
        Nodo nodo = new Nodo(dato);
        if (this.isEmpty()) {
            this.first = nodo;
            this.last = nodo;
        } else {
            this.last.setSiguiente(nodo);
            this.last = nodo;
        }
    }

    public Jugador pop() {
        if (!this.isEmpty()) {
            Nodo auxiliar = this.first;
            this.first = this.first.getSiguiente();
            return auxiliar.getDato();
        }
        return null;
    }

    public Jugador peek() {
        if (!this.isEmpty()) {
            Nodo auxiliar = this.first;
            return auxiliar.getDato();
        }
        return null;
    }

    public int contar() {
        int contador = 0;
        Cola auxiliar = new Cola();
        while (!this.isEmpty()) {
            auxiliar.push(this.pop());
            contador++;
        }
        while (!auxiliar.isEmpty()) {
            this.push(auxiliar.pop());
        }
        return contador;
    }

    public String imprimir() {
        String s = "";
        Cola auxiliar = new Cola();
        while (!this.isEmpty()) {
            Jugador jugador = this.pop();
            s += "\n" + jugador.getNombre();
            auxiliar.push(jugador);
        }
        while (!auxiliar.isEmpty()) {
            this.push(auxiliar.pop());
        }
        return s;
    }

}
