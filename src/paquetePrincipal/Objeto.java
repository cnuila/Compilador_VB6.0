package paquetePrincipal;

public class Objeto {

    private Nodo nodo;
    private String tipo;
    private String acumulada;

    public Objeto(Nodo _nodo, String _tipo){
        this.nodo = _nodo;
        this.tipo = _tipo;
        this.acumulada = "";
    }

    public Objeto(Nodo _nodo, String _tipo, String _acumulada){
        this.nodo = _nodo;
        this.tipo = _tipo;
        this.acumulada = _acumulada;
    }

    public Nodo getNodo(){
        return this.nodo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getAcumulada(){
        return this.acumulada;
    }
    
}
