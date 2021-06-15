package paquetePrincipal;

public class Simbolo {
    private String identificador;
    private String tipo;
    private int offset;
    private String ambito;
    private int size;

    public Simbolo(String _identificador, String _tipo, int _offset, String _ambito) {
        this.identificador = _identificador;
        this.tipo = _tipo;
        this.offset = _offset;
        this.ambito = _ambito;
        int sizeT = 0;
        //ojo revisar caso de STRING
        if (_tipo.equals("INTEGER")){
            sizeT = 4;
        }
        if (_tipo.equals("BOOLEAN")){
            sizeT = 1;
        }
        this.size = sizeT;
    }

    public boolean esIgual(String identificadorComparar) {
        if (this.identificador.equals(identificadorComparar)) {
            return true;
        }
        return false;
    }

    public void setAmbitoPrefijo(String _ambito){
        this.ambito = _ambito + this.ambito;
    }

    public int getSize(){
        return this.size;
    }

    public String toString() {
        return identificador + " " + tipo + " offset: " + offset + " ambito: " + ambito;
    }
}
