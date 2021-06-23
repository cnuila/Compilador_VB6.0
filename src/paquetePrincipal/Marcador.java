package paquetePrincipal;
public class Marcador {
    private int numGuardar;
    private int numGuardar2;

    Marcador(int _numGuardar, int _numGuardar2){
        this.numGuardar = _numGuardar;
        this.numGuardar2 = _numGuardar2;
    }

    public int getNum(){
        return this.numGuardar;
    }

    public int getNum2(){
        return this.numGuardar2;
    }
}
