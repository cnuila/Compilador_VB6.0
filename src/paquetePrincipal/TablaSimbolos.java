package paquetePrincipal;

import java.util.ArrayList;

public class TablaSimbolos {
    
    private ArrayList<Simbolo> tabla;

    public TablaSimbolos(){
        tabla = new ArrayList<>();
    }

    public void agregarID(String identificador, String tipo, int offset, String ambito){
        tabla.add(new Simbolo(identificador,tipo,offset,ambito));
    }

    public boolean existeId(String identificador){
        for (Simbolo s: this.tabla){
            if (s.esIgual(identificador)){
                return true;
            }
        }
        return false;
    }

    public void agregarAmbito(String ambito, int cantidadVars){
        for (int i = 0; i < cantidadVars; i++){
            this.tabla.get(this.tabla.size() - i - 1).setAmbitoPrefijo(ambito);
        }
    }

    public int sizeUltimo(){        
        return this.tabla.get(this.tabla.size() - 1).getSize();
    }

    public ArrayList<Simbolo> getTabla(){
        return this.tabla;
    }

    public int disminuirOffset(int cantidadVars){
        int cantRestar = 0;
        for (int i = 0; i < cantidadVars;i++){
            cantRestar += this.tabla.get(this.tabla.size() - i - 1).getSize();
        }
        return cantRestar;
    }

}
