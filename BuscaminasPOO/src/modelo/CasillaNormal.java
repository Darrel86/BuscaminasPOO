package modelo;

public class CasillaNormal extends Casilla {

    private int minasAdyacentes;

    public int getMinasAdyacentes() {
        return minasAdyacentes;
    }

    public void setMinasAdyacentes(int minasAdyacentes) {
        this.minasAdyacentes = minasAdyacentes;
    }

    @Override
    public boolean esMina() {
        return false;
    }
}