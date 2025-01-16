/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcncuptracker;

/**
 *
 * @author grier
 */
public class Jugador {

    private String nombre;
    private int edad;
    private int dorsal;
    private int[] puntosAnotados;

    public Jugador() {
        this("Sin nombre", 0, 0, new int[5]);
    }

    public Jugador(String nombre, int edad, int dorsal, int[] puntosAnotados) {
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;

        this.puntosAnotados = new int[5];
        for (int i = 0; i < puntosAnotados.length; i++) {
            this.puntosAnotados[i] = puntosAnotados[i];
        }

    }

    public int[] getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int[] puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getPuntosTotales() {
        int total = 0;
        for (int i = 0; i < puntosAnotados.length; i++) {
            total += puntosAnotados[i];
        }
        return total;
    }

    public void setPuntos(int puntos, int pos) {
        puntosAnotados[pos] = puntos;
    }

    @Override
    public String toString() {
        return this.nombre + " con un total de " + this.getPuntosTotales() + " puntos";
    }
}
