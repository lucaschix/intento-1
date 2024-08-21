public class Contador {
    private int contador = 0;

    public void incrementar() {
        contador++;
    }

    public void decrementar() {
        contador--;
    }

    public int getValor() {
        return contador;
    }

    public void resetear() {
        contador = 0;
    }
}