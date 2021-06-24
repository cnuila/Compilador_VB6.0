public class FilaCuadruplo {

    private String operacion;
    private String arg1;
    private String arg2;
    private String destino;

    FilaCuadruplo(String _operacion, String _arg1, String _arg2, String _destino) {
        this.operacion = _operacion;
        this.arg1 = _arg1;
        this.arg2 = _arg2;
        this.destino = _destino;
    }

    FilaCuadruplo(String _operacion, String _arg1, String _destino) {
        this.operacion = _operacion;
        this.arg1 = _arg1;
        this.arg2 = "";
        this.destino = _destino;
    }

    FilaCuadruplo(String _operacion, String _arg1) {
        this.operacion = _operacion;
        this.arg1 = _arg1;
        this.arg2 = "";
        this.destino = "";
    }

    public void setArg1(String _arg1){
        this.arg1 = _arg1;
    }

    public String getArg1(){
        return this.arg1;
    }

    public String getArg2(){
        return this.arg2;
    }

    public void setArg2(String _arg2){
        this.arg2 = _arg2;
    }

    public String getOp(){
        return this.operacion;
    }

    public void setOp(String _operacion){
        this.operacion = _operacion;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String _destino){
        this.destino = _destino;
    }

    public boolean hayArg1(){
        if (arg1.equals("")){
            return false;
        } else {
            return true;
        }
    }


    public String toString() {
        if (this.arg2.equals("") && this.destino.equals("")){
            return this.operacion + " " + this.arg1;
        }
        if (this.arg2.equals("")) {
            return this.operacion + " " + this.arg1 + " " + this.destino;
        }        
        return this.operacion + " " + this.arg1 + " " + this.arg2 + " " + this.destino;
    }
}
