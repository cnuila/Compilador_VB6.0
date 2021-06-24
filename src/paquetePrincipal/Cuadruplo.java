
import java.util.ArrayList;

public class Cuadruplo {

    private ArrayList<FilaCuadruplo> tablaCuadruplos;

    Cuadruplo() {
        this.tablaCuadruplos = new ArrayList<>();
    }

    public ArrayList<FilaCuadruplo> getListaCuadruplo(){
        return tablaCuadruplos;
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

    public void addCuadruplo(String operacion, String arg1, int lugar) {
        tablaCuadruplos.add(lugar,new FilaCuadruplo(operacion, arg1));
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

    public void completa(ArrayList<Integer> lista, int indice){
        if (lista != null){
            for(int i = 0; i < lista.size(); i++){
                System.out.println((tablaCuadruplos.get(lista.get(i))));
                if (tablaCuadruplos.get(lista.get(i)).hayArg1()){
                    if (!tablaCuadruplos.get(lista.get(i)).getArg1().equals(Integer.toString(indice))){
                        tablaCuadruplos.get(lista.get(i)).setDestino(Integer.toString(indice));
                    }                    
                } else {
                    tablaCuadruplos.get(lista.get(i)).setArg1(Integer.toString(indice));
                }                
            }
        }        
    }

    public void eliminarUltimo(){
        tablaCuadruplos.remove(tablaCuadruplos.size() - 1);
    }
}