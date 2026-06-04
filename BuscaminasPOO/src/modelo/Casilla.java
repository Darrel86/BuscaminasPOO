package modelo;

import java.io.Serializable;
import interfaces.Descubrible;

public abstract class Casilla implements Descubrible, Serializable {

    protected boolean descubierta;
    protected boolean marcada;

    public boolean estaDescubierta() {
        return descubierta;
    }

    public boolean estaMarcada() {
        return marcada;
    }

    public void marcar() {
        marcada = !marcada;
    }

    @Override
    public void descubrir() {
        descubierta = true;
    }

    public abstract boolean esMina();
}