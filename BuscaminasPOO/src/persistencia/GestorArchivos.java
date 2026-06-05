package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelo.Juego;

public class GestorArchivos {

    private static final String ARCHIVO = "partida.dat";

    public static void guardar(Juego juego) throws IOException {

        ObjectOutputStream salida =
                new ObjectOutputStream(
                        new FileOutputStream(ARCHIVO));

        salida.writeObject(juego);

        salida.close();

        System.out.println("Partida guardada correctamente.");
    }

    public static Juego cargar()
            throws IOException, ClassNotFoundException {

        ObjectInputStream entrada =
                new ObjectInputStream(
                        new FileInputStream(ARCHIVO));

        Juego juego = (Juego) entrada.readObject();

        entrada.close();

        System.out.println("Partida cargada correctamente.");

        return juego;
    }
}