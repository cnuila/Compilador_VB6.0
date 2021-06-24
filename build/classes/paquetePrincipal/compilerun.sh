#!/bin/bash

javac -cp .:./java-cup-11b.jar:./jflex-1.8.2/lib/jflex-full-1.8.2.jar Main2.java Lexer.java sym.java parser.java Nodo.java GraphViz.java Simbolo.java TablaSimbolos.java Objeto.java Marcador.java parser2.java parser2Sym.java Cuadruplo.java FilaCuadruplo.java Objeto2.java Condiciones.java CodigoFinal.java TablaDescriptores.java
java -cp .:./java-cup-11b-runtime.jar Main2