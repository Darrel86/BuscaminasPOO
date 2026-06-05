package controlador;

import java.util.Scanner;

import modelo.Juego;
import vista.ConsolaVista;

public class JuegoControlador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {

            System.out.println();
            System.out.println("=====================");
            System.out.println("     BUSCAMINAS");
            System.out.println("=====================");
            System.out.println("1. Nueva Partida");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opcion: ");

            String opcion = sc.nextLine();

            switch (opcion) {

            case "1":
                iniciarPartida(sc);
                break;

            case "2":
                salir = true;
                System.out.println("Gracias por jugar.");
                break;

            default:
                System.out.println("Opcion invalida.");
            }
        }

        sc.close();
    }

    private static void iniciarPartida(Scanner sc) {

        Juego juego = new Juego();

        ConsolaVista vista = new ConsolaVista();

        while (!juego.estaTerminado()) {

            vista.mostrar(juego.getTablero());

            System.out.println();
            System.out.print(
                "Ingrese coordenada (A5) o marque mina (M A5): ");

            String entrada = sc.nextLine().toUpperCase();

            try {

                if (entrada.startsWith("M ")) {

                    String coordenada = entrada.substring(2);

                    char letra = coordenada.charAt(0);

                    int fila = letra - 'A';

                    int columna =
                            Integer.parseInt(
                                    coordenada.substring(1)) - 1;

                    juego.getTablero()
                            .marcarCasilla(fila, columna);

                    continue;
                }

                char letra = entrada.charAt(0);

                int fila = letra - 'A';

                int columna =
                        Integer.parseInt(
                                entrada.substring(1)) - 1;

                juego.getTablero()
                        .descubrirCasilla(fila, columna);

                if (juego.getTablero()
                        .esMina(fila, columna)) {

                    vista.mostrar(juego.getTablero());

                    System.out.println();
                    System.out.println("GAME OVER");

                    juego.terminar();
                }

                if (juego.getTablero()
                        .verificarVictoria()) {

                    vista.mostrar(juego.getTablero());

                    System.out.println();
                    System.out.println("GANASTE");

                    juego.terminar();
                }

            } catch (Exception e) {

                System.out.println(
                        "Coordenada invalida");
            }
        }
    }
}