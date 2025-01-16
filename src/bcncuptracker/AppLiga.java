/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bcncuptracker;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author grier
 */
public class AppLiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores.add(new Jugador("LeBron James", 38, 6, new int[]{25, 30, 28, 35, 32}));
        jugadores.add(new Jugador("Stephen Curry", 35, 30, new int[]{40, 45, 38, 50, 42}));
        jugadores.add(new Jugador("Giannis Antetokounmpo", 29, 34, new int[]{30, 33, 28, 36, 31}));

        int opcion;
        do {
            System.out.println("[1] Consultar jugador");
            System.out.println("[2] Total de puntos");
            System.out.println("[3] Agregar puntos de jugador");
            System.out.println("[4] Maximo anotador");
            System.out.println("[0] Salir del programa");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consultarJugador(jugadores);
                    break;
                case 2:
                    totalDePuntos(jugadores);
                    break;
                case 3:
                    agregarPuntosPorPosicion(jugadores);
                    break;
                case 4:
                    maximoAnotador(jugadores);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
                    System.out.println("");
                    System.out.println("");
                    break;
            }
        } while (opcion != 0);

    }

    public static void consultarJugador(ArrayList<Jugador> jugadores) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre del jugador: ");
        String player = sc.nextLine();
        boolean jugadorEncontrado = false;

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                jugadorEncontrado = true;
                String userplayer = jugador.getNombre();
                int userage = jugador.getEdad();
                int userdorsal = jugador.getDorsal();
                int userpoints = jugador.getPuntosTotales();
                System.out.println("Nombre completo: " + userplayer);
                System.out.println("Edad: " + userage);
                System.out.println("Dorsal: " + userdorsal);
                System.out.println("Puntos totales: " + userpoints);
            }
        }

        if (!jugadorEncontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }

    public static void totalDePuntos(ArrayList<Jugador> jugadores) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre del jugador: ");
        String player = sc.nextLine();
        boolean jugadorEncontrado = false;

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                jugadorEncontrado = true;
                int userpoint = jugador.getPuntosTotales();
                System.out.println("Total de puntos anotados en los ultimos 5 partidos: " + userpoint);
            }
        }
        if (!jugadorEncontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }

    public static void agregarPuntosPorPosicion(ArrayList<Jugador> jugadores) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre del jugador: ");
        String player = sc.nextLine();
        boolean jugadorEncontrado = false;

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                jugadorEncontrado = true;

                System.out.print("Introduzca la posicion (0-4): ");
                int pos = sc.nextInt();
                if (pos < 0 || pos >= 5) {
                    System.out.println("Posición inválida. Debe estar entre 0 y 4.");
                    return;
                }

                System.out.print("Introduzca los puntos anotados: ");
                int puntos = sc.nextInt();
                if (puntos < 0) {
                    System.out.println("Los puntos no pueden ser negativos.");
                    return;
                }

                jugador.setPuntos(puntos, pos);
                System.out.println("Puntos actualizados correctamente.");
                return;
            }
        }

        if (!jugadorEncontrado) {
            System.out.println("Jugador no encontrado.");
        }
    }

    public static void maximoAnotador(ArrayList<Jugador> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en la lista.");
            return;
        }

        Jugador maximo = jugadores.get(0);

        for (int i = 1; i < jugadores.size(); i++) {
            if (jugadores.get(i).getPuntosTotales() > maximo.getPuntosTotales()) {
                maximo = jugadores.get(i);
            }
        }

        System.out.println("El jugador con mas puntos es: " + maximo);
    }
}
