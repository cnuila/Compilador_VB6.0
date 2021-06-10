public class Tipo {
    private String identificador;
    private String tipo;
    private String offset;
    private String ambito;

    public Tipo(String _identificador, String _tipo, String _offset, String _ambito){
        this.identificador = _identificador;
        this.tipo = _tipo;
        this.offset = _offset;
        this.ambito = _ambito;
    }  
    
    public boolean esIgual(String identificadorComparar){
        if (this.identificador.equals(identificadorComparar)){
            return true;
        }
        return false;
    }

    public String toString(){
        return identificador + " " + tipo;
    }
}
