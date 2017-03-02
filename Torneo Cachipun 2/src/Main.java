/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("TORNEO CACHIPUN 2");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola listado = new Cola();
        c.println("Ingrese la cantidad de jugadores:");
        int cantidadJugadores = c.readInt();
        for (int i = 1; i <= cantidadJugadores; i++) {
            String nombre = "J" + i;
            String pais = "Colombia";

            Jugador jugador = new Jugador(nombre, pais);
            listado.push(jugador);
        }

        // EMPEZAR EL TORNEO
        Jugador ganador = null;
        while (!listado.isEmpty()) {
            Jugador j1 = listado.pop();
            if (listado.isEmpty()) {
                ganador = j1;
            } else {
                Jugador j2 = listado.pop();
                c.print(j1.getNombre() + " VS " + j2.getNombre());

                int c1 = j1.cachipun();
                int c2 = j2.cachipun();

                // 1: Piedra 2: Papel 3: Tijera
                while (c1 == c2) {
                    c1 = j1.cachipun();
                    c2 = j2.cachipun();
                }

                int gano = 1;
                if (c1 == 1 && c2 == 2) {
                    gano = 2;
                }
                if (c1 == 2 && c2 == 3) {
                    gano = 2;
                }
                if (c1 == 3 && c2 == 1) {
                    gano = 2;
                }

                if (gano == 1) {
                    j1.sumarPuntaje();
                    listado.push(j1);
                    c.println(" " + j1.getNombre() + " WIN ");
                } else {
                    j2.sumarPuntaje();
                    listado.push(j2);
                    c.println(" " + j2.getNombre() + " WIN ");
                }
            }

        }

        c.println("El Campeón es: " + ganador.getNombre() + " [" + ganador.getPuntaje() + " puntos]");

    }

}
