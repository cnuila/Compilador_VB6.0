public class Objeto2 {

    private String tipo;
    private String valor;

    public Objeto2(String _tipo, String _valor) {
        this.tipo = _tipo;
        this.valor = _valor;
    }

    public Nodo getValor() {
        return this.valor;
    }

    public String getTipo() {
        return this.tipo;
    }

}
