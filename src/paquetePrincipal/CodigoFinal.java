package paquetePrincipal;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodigoFinal {

    private Cuadruplo tablaCuadruplos;
    private TablaDescriptores tablaDescriptores;
    private TablaSimbolos tablaSimbolos;
    private File archivo;
    private FileWriter fw;

    CodigoFinal(Cuadruplo tablaCuadruplos, TablaSimbolos tablaSimbolos, String nombreArchivo) {
        this.tablaDescriptores = new TablaDescriptores();
        this.tablaCuadruplos = tablaCuadruplos;
        this.tablaSimbolos = tablaSimbolos;
        try {
            archivo = new File(nombreArchivo);
            fw = new FileWriter(nombreArchivo);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public void genArchivo() {

        try {
            genMips("   .data");
            buscarVarGlob(tablaSimbolos);
            buscarWrites(tablaCuadruplos);
            genMips("   .text");
            genMips("   .globl Main");
            for (FilaCuadruplo filaCu : tablaCuadruplos.getListaCuadruplo()) {
                String destino, operacion, arg1, arg2, linea;
                destino = filaCu.getDestino();
                operacion = filaCu.getOp();
                arg1 = filaCu.getArg1();
                arg2 = filaCu.getArg2();
                if (operacion.equals("ETIQ")) {
                    genMips(arg1+":");                    
                }else{
                    genMips("   blabla");
                }
            }
            fw.close();
        } catch (Exception e) {
        }
    }

    public void buscarWrites(Cuadruplo tablaCuadruplos) {
        int count = 1;
        for (FilaCuadruplo filaCu : this.tablaCuadruplos.getListaCuadruplo()) {
            String destino, operacion, arg1, arg2, linea, nuevoArg2;
            destino = filaCu.getDestino();
            operacion = filaCu.getOp();
            arg1 = filaCu.getArg1();
            arg2 = filaCu.getArg2();
            if (operacion.equals("write")) {
                linea = "_msg" + count + ": .asciiz " + "\"" + destino + "\"";
                nuevoArg2 = "_msg" + count;
                genMips(linea);
                filaCu.setArg2(nuevoArg2);
                count++;
            }
        }
    }

    public void buscarProxDisp(TablaDescriptores tablaDescriptores) {
        for (boolean des : this.tablaDescriptores.getDescriptores()) {
            System.out.println("descriptor: " + des);
        }
    }

    public void buscarVarGlob(TablaSimbolos tablaSimbolos) {
        for (Simbolo simbolo : this.tablaSimbolos.getTabla()) {
            String[] ambitoS;
            String id, tipo, ambito, linea;
            id = simbolo.getIdentificador();
            tipo = simbolo.getTipo();
            ambito = simbolo.getAmbito();
            ambitoS = ambito.split("[.]");
            if (ambitoS[0].equals("Main")) {
                linea = "_" + id + "    .word 0";
                genMips(linea);
            }
        }
    }

    public void genMips(String linea) {
        try {
            fw.write(linea + "\n");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}