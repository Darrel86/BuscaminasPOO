package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import modelo.Tablero;

public class TableroTest {

    @Test
    void tableroTiene10Filas() {

        Tablero tablero = new Tablero();

        assertEquals(10, tablero.getTablero().length);
    }

    @Test
    void tableroTiene10Columnas() {

        Tablero tablero = new Tablero();

        assertEquals(10, tablero.getTablero()[0].length);
    }

    @Test
    void tableroNoEsNulo() {

        Tablero tablero = new Tablero();

        assertNotNull(tablero.getTablero());
    }
}