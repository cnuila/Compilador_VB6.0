#!/bin/bash

javac -cp .:../../java-cup-11b.jar:../../jflex-full-1.8.2.jar Main2.java Lexer.java sym.java parser.java Nodo.java GraphViz.java
java -cp .:../../java-cup-11b-runtime.jar Main2 entrada.txt