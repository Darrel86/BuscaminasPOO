package vista;

import modelo.Casilla;
import modelo.CasillaNormal;
import modelo.Tablero;

public class ConsolaVista {

    public void mostrar(Tablero tablero) {

        Casilla[][] matriz = tablero.getTablero();

        System.out.println();

        System.out.print("   ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            char letra = (char) ('A' + i);

            System.out.print(letra + "  ");

            for (int j = 0; j < 10; j++) {

                Casilla c = matriz[i][j];

                if (!c.estaDescubierta()) {

                    System.out.print("? ");

                } else if (c.esMina()) {

                    System.out.print("X ");

                } else {

                    int num =
                            ((CasillaNormal) c)
                            .getMinasAdyacentes();

                    System.out.print(num + " ");
                }
            }

            System.out.println();
        }
    }
}