import java.util.ArrayList;

public class TablaSimbolos {
    
    private ArrayList<Tipo> tabla;

    public TablaSimbolos(){
        tabla = new ArrayList<>();
    }

    public void agregarID(String identificador, String tipo, String offset, String ambito){
        tabla.add(new Tipo(identificador,tipo,offset,ambito));
    }

    public boolean existeId(String identificador){
        for (Tipo t: this.tabla){
            if (t.esIgual(identificador)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Tipo> getTabla(){
        return this.tabla;
    }

}
