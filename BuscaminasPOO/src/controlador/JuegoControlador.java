package controlador;

import modelo.Juego;
import vista.ConsolaVista;

public class JuegoControlador {

    public static void main(String[] args) {

        Juego juego = new Juego();

        ConsolaVista vista = new ConsolaVista();

        vista.mostrar(juego.getTablero());

        System.out.println("Buscaminas iniciado");
    }
}