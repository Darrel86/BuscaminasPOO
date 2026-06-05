package modelo;

import java.io.Serializable;

public class Juego implements Serializable {

    private static final long serialVersionUID = 1L;

    private Tablero tablero;
    private boolean terminado;

    public Juego() {
        tablero = new Tablero();
        terminado = false;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public boolean estaTerminado() {
        return terminado;
    }

    public void terminar() {
        terminado = true;
    }

    public void reiniciar() {
        tablero = new Tablero();
        terminado = false;
    }
}