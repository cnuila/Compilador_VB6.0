import java.util.ArrayList;

public class Cuadruplo {

    private ArrayList<FilaCuadruplo> tablaCuadruplos;

    Cuadruplo() {
        this.tablaCuadruplos = new ArrayList<>();
    }

    public void addCuadruplo(String operacion, String arg1, String arg2, String destino) {
        tablaCuadruplos.add(new FilaCuadruplo(operacion, arg1, arg2, destino));
    }

    public void addCuadruplo(String operacion, String arg1, String destino) {
        tablaCuadruplos.add(new FilaCuadruplo(operacion, arg1, destino));
    }

    public void addCuadruplo(String operacion, String arg1) {
        tablaCuadruplos.add(new FilaCuadruplo(operacion, arg1));
    }

    public void imprimirCuadruplos() {
        int i = 0;
        for (FilaCuadruplo fila : this.tablaCuadruplos) {
            System.out.println(i + ": " + fila.toString());
            i++;
        }
    }

    public int siguienteCuad(){
        return this.tablaCuadruplos.size();
    }
}