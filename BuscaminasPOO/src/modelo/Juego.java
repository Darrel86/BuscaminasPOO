package modelo;

import java.io.Serializable;

public class Juego implements Serializable {

    private Tablero tablero;

    public Juego() {
        tablero = new Tablero();
    }

    public Tablero getTablero() {
        return tablero;
    }
}