import java.util.ArrayList;

public class TablaSimbolos {
    
    private ArrayList<Simbolo> tabla;

    public TablaSimbolos(){
        tabla = new ArrayList<>();
    }

    public ArrayList<Simbolo> getTabla(){
        return this.tabla;
    }

    public void agregarID(String identificador, String tipo, int offset, String ambito){
        tabla.add(new Simbolo(identificador,tipo,offset,ambito));
    }    

    public void agregarAmbito(String ambito, int cantidadVars){
        for (int i = 0; i < cantidadVars; i++){
            this.tabla.get(this.tabla.size() - i - 1).setAmbitoPrefijo(ambito);
        }
    }

    public int sizeUltimo(){        
        return this.tabla.get(this.tabla.size() - 1).getSize();
    }    

    public int buscarSimbolo(String identificador, String tipo){
        int i = 0;
        for (Simbolo simbolo: this.tabla){
            if (simbolo.esIgual(identificador, tipo)){
                simbolo.estaVerificada(true);
                return i;
            }
            i++;
        }
        return -1;
    }

    // false error, true correcto
    public boolean comprobarAmbito(int posSimboloComprobar){
        Simbolo simboloComprobar = this.tabla.get(posSimboloComprobar);
        ArrayList<String> ambitoComprobar = simboloComprobar.extraerAmbito();

        for (int i = 0; i < posSimboloComprobar;i++){
            Simbolo simboloIteracion = this.tabla.get(i);            
            if (simboloComprobar.esIgual(simboloIteracion)){
                ArrayList<String> ambitoIteracion = simboloIteracion.extraerAmbito();

                // 0 todos iguales, 1 hay uno diferente                    
                int comprobar = 0;
                if (ambitoComprobar.size() == ambitoIteracion.size()){                    
                    for(int j = 0; j < ambitoComprobar.size();j++){
                        if (!ambitoComprobar.get(j).equals(ambitoIteracion.get(j))){                            
                            comprobar = 1;
                        }
                    }
                }

                if (ambitoComprobar.size() > ambitoIteracion.size()){
                    int diferencia = ambitoComprobar.size() - ambitoIteracion.size();
                    for (int j = 0; j < ambitoComprobar.size() - diferencia;j++){
                        if (!ambitoComprobar.get(j).equals(ambitoIteracion.get(j))){                            
                            comprobar = 1;
                        }
                    }
                }

                if (ambitoComprobar.size() < ambitoIteracion.size()){
                    comprobar = 1;
                }

                if (comprobar == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public int disminuirOffset(int cantidadVars){
        int cantRestar = 0;
        for (int i = 0; i < cantidadVars;i++){
            cantRestar += this.tabla.get(this.tabla.size() - i - 1).getSize();
        }
        return cantRestar;
    }

}
