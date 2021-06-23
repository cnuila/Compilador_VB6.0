package paquetePrincipal;
import java.util.ArrayList;

public class Condiciones {
    
    private ArrayList<Integer> listaVerdadera;
    private ArrayList<Integer> listaFalsa;

    public Condiciones(){
        this.listaVerdadera = new ArrayList<>();
        this.listaFalsa = new ArrayList<>();
    }

    public Condiciones(ArrayList<Integer> _listaVerdadera,ArrayList<Integer> _listaFalsa){
        this.listaVerdadera = _listaVerdadera;
        this.listaFalsa = _listaFalsa;
    }

    public ArrayList<Integer> getListaVerdadera(){
        return this.listaVerdadera;
    }

    public ArrayList<Integer> getListaFalsa(){
        return this.listaFalsa;
    }
}
