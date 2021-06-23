import java.util.ArrayList;
import java.util.Arrays;

public class Simbolo {
    private String identificador;
    private String tipo;
    private int offset;
    private String ambito;
    private int size;
    private boolean verficada;

    public Simbolo(String _identificador, String _tipo, int _offset, String _ambito) {
        this.identificador = _identificador;
        this.tipo = _tipo;
        this.offset = _offset;
        this.ambito = _ambito;
        int sizeT = 0;
        // ojo revisar caso de STRING
        if (_tipo.equals("INTEGER")) {
            sizeT = 4;
        }
        if (_tipo.equals("BOOLEAN")) {
            sizeT = 1;
        }
        this.size = sizeT;
        this.verficada = false;
    }

    public boolean esIgual(String identificadorComparar, String tipoComparar) {
        if (this.identificador.equals(identificadorComparar) && this.tipo.equals(tipoComparar) && !this.verficada) {
            return true;
        }
        return false;
    }

    public boolean esIgual(String identificador) {
        if (this.identificador.equals(identificador)) {
            return true;
        }
        return false;
    }

    public boolean esIgual(Simbolo simboloComparar) {
        if (this.identificador.equals(simboloComparar.getIdentificador())) {
            return true;
        }
        return false;
    }

    public ArrayList<String> extraerAmbito() {
        return new ArrayList<>(Arrays.asList(this.ambito.split("[.]")));
    }

    public ArrayList<String> extraerParams() {
        ArrayList<String> tipos = extraerTipoFuncion();
        return new ArrayList<>(Arrays.asList(tipos.get(0).split("x")));
    }

    public String extraerRetorno() {
        ArrayList<String> tipos = extraerTipoFuncion();
        return tipos.get(tipos.size() - 1);
    }

    public ArrayList<String> extraerTipoFuncion() {
        return new ArrayList<>(Arrays.asList(this.tipo.split("->")));
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getSize() {
        return this.size;
    }

    public void setAmbitoPrefijo(String _ambito) {
        this.ambito = _ambito + this.ambito;
    }

    public void estaVerificada(boolean _verificada) {
        this.verficada = _verificada;
    }

    public String toString() {
        return identificador + " " + tipo + " offset: " + offset + " ambito: " + ambito + " verificada:" + verficada;
    }
}
