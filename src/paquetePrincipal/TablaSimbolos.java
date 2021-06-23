package paquetePrincipal;
import java.util.ArrayList;
import java.util.Arrays;

public class TablaSimbolos {

    private ArrayList<Simbolo> tabla;

    public TablaSimbolos() {
        tabla = new ArrayList<>();
    }

    public ArrayList<Simbolo> getTabla() {
        return this.tabla;
    }

    public void agregarID(String identificador, String tipo, int offset, String ambito) {
        tabla.add(new Simbolo(identificador, tipo, offset, ambito));
    }

    public void agregarAmbito(String ambito, int cantidadVars) {
        for (int i = 0; i < cantidadVars; i++) {
            this.tabla.get(this.tabla.size() - i - 1).setAmbitoPrefijo(ambito);
        }
    }

    public int sizeUltimo() {
        return this.tabla.get(this.tabla.size() - 1).getSize();
    }

    public String getTipoID(int posSimbolo) {
        return this.tabla.get(posSimbolo).getTipo();
    }

    public String getTipoRetorno(int posSimbolo) {
        return this.tabla.get(posSimbolo).extraerRetorno();
    }

    public int buscarSimbolo(String identificador, String tipo) {
        int i = 0;
        for (Simbolo simbolo : this.tabla) {
            if (simbolo.esIgual(identificador, tipo)) {
                simbolo.estaVerificada(true);
                return i;
            }
            i++;
        }
        return -1;
    }

    public int buscarID(String identificador, int posIniciar) {
        // busca hasta que encuentra una función
        for (int i = posIniciar - 1; i >= 0; i--) {
            // System.out.println("i="+i);
            if (tabla.get(i).getIdentificador().equals(identificador)) {
                return i;
            }
            if (tabla.get(i).getTipo().contains("->")) {
                i = 0;
            }
        }

        // si no encontró busca en las globales
        int i = 0;
        for (Simbolo simbolo : this.tabla) {
            if (simbolo.extraerAmbito().get(0).equals("")) {
                if (identificador.equals(simbolo.getIdentificador()) && !simbolo.getTipo().contains("->")) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public int buscarFUNC(String identificador, String paramsComprobar) {
        int i = 0;
        ArrayList<String> paramBuscar = new ArrayList<>(Arrays.asList(paramsComprobar.split("x")));

        for (Simbolo simbolo : this.tabla) {

            // se encuentra en ambito global
            if (simbolo.extraerAmbito().get(0).equals("")) {
                // y es una función
                if (simbolo.esIgual(identificador) && simbolo.getTipo().contains("->")) {

                    ArrayList<String> parametrosReales = simbolo.extraerParams();

                    if (parametrosReales.size() == paramBuscar.size()) {
                        for (int j = 0; j < parametrosReales.size(); j++) {
                            if (!parametrosReales.get(j).equals(paramBuscar.get(j))) {
                                // este parametro es de diferente tipo
                                return -1;
                            }
                        }
                    } else {
                        // sí encontró pero con más número de parametros o menos
                        return -1;
                    }

                    return i;
                }
            }
            i++;
        }
        // si no la encontró
        return -1;
    }

    // false error, true correcto
    public boolean comprobarAmbito(int posSimboloComprobar) {
        Simbolo simboloComprobar = this.tabla.get(posSimboloComprobar);
        ArrayList<String> ambitoComprobar = simboloComprobar.extraerAmbito();

        for (int i = 0; i < posSimboloComprobar; i++) {
            Simbolo simboloIteracion = this.tabla.get(i);
            if (simboloComprobar.esIgual(simboloIteracion)) {
                ArrayList<String> ambitoIteracion = simboloIteracion.extraerAmbito();

                if (ambitoIteracion.get(0).equals("")) {
                    return false;
                }

                // 0 todos iguales, 1 hay uno diferente
                int comprobar = 0;
                if (ambitoComprobar.size() == ambitoIteracion.size()) {
                    for (int j = 0; j < ambitoComprobar.size(); j++) {
                        if (!ambitoComprobar.get(j).equals(ambitoIteracion.get(j))) {
                            comprobar = 1;
                        }
                    }
                }

                if (ambitoComprobar.size() > ambitoIteracion.size()) {
                    int diferencia = ambitoComprobar.size() - ambitoIteracion.size();
                    for (int j = 0; j < ambitoComprobar.size() - diferencia; j++) {
                        if (!ambitoComprobar.get(j).equals(ambitoIteracion.get(j))) {
                            comprobar = 1;
                        }
                    }
                }

                if (ambitoComprobar.size() < ambitoIteracion.size()) {
                    comprobar = 1;
                }

                if (comprobar == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int disminuirOffset(int cantidadVars) {
        int cantRestar = 0;
        for (int i = 0; i < cantidadVars; i++) {
            cantRestar += this.tabla.get(this.tabla.size() - i - 1).getSize();
        }
        return cantRestar;
    }

}
