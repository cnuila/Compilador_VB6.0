package paquetePrincipal;
import java.util.ArrayList;

public class Condiciones {
    
    private ArrayList<Integer> listaVerdadera;
    private ArrayList<Integer> listaFalsa;
    private String valor;

    public Condiciones(){
        this.listaVerdadera = new ArrayList<>();
        this.listaFalsa = new ArrayList<>();
        this.valor = "";
    }

    public Condiciones(ArrayList<Integer> _listaVerdadera,ArrayList<Integer> _listaFalsa){
        this.listaVerdadera = _listaVerdadera;
        this.listaFalsa = _listaFalsa;
        this.valor = "";
    }

    public Condiciones(ArrayList<Integer> _listaVerdadera,ArrayList<Integer> _listaFalsa, String _valor){
        this.listaVerdadera = _listaVerdadera;
        this.listaFalsa = _listaFalsa;
        this.valor = _valor;
    }

    public ArrayList<Integer> getListaVerdadera(){
        return this.listaVerdadera;
    }

    public String getValor(){
        return this.valor;
    }

    public ArrayList<Integer> getListaFalsa(){
        return this.listaFalsa;
    }
}
