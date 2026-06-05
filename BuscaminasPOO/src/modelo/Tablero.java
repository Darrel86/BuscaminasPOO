package modelo;

import java.io.Serializable;
import java.util.Random;

public class Tablero implements Serializable {

    private static final long serialVersionUID = 1L;

    private Casilla[][] tablero;
    private final int TAMANO = 10;
    private final int MINAS = 10;

    public Tablero() {
        tablero = new Casilla[TAMANO][TAMANO];

        inicializar();
        colocarMinas();
        calcularNumeros();
    }

    private void inicializar() {

        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                tablero[i][j] = new CasillaNormal();
            }
        }
    }

    private void colocarMinas() {

        Random random = new Random();

        int minas = 0;

        while (minas < MINAS) {

            int fila = random.nextInt(TAMANO);
            int columna = random.nextInt(TAMANO);

            if (!tablero[fila][columna].esMina()) {

                tablero[fila][columna] = new CasillaMina();
                minas++;
            }
        }
    }

    private void calcularNumeros() {

        for (int fila = 0; fila < TAMANO; fila++) {

            for (int col = 0; col < TAMANO; col++) {

                if (!tablero[fila][col].esMina()) {

                    int contador = contarMinasAdyacentes(fila, col);

                    ((CasillaNormal) tablero[fila][col])
                            .setMinasAdyacentes(contador);
                }
            }
        }
    }

    private int contarMinasAdyacentes(int fila, int col) {

        int contador = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {

            for (int j = col - 1; j <= col + 1; j++) {

                if (i >= 0 && i < TAMANO &&
                    j >= 0 && j < TAMANO &&
                    tablero[i][j].esMina()) {

                    contador++;
                }
            }
        }

        return contador;
    }

    public void descubrirCasilla(int fila, int columna) {
        tablero[fila][columna].descubrir();
    }

    public boolean esMina(int fila, int columna) {
        return tablero[fila][columna].esMina();
    }
    public void marcarCasilla(int fila, int columna) {
        tablero[fila][columna].marcar();
    }
    public boolean verificarVictoria() {

        for (int i = 0; i < TAMANO; i++) {

            for (int j = 0; j < TAMANO; j++) {

                Casilla c = tablero[i][j];

                if (!c.esMina() && !c.estaDescubierta()) {
                    return false;
                }
            }
        }

        return true;
    }

    public Casilla[][] getTablero() {
        return tablero;
    }
}