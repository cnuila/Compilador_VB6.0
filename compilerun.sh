#!/bin/bash

javac -cp .:./java-cup-bin-11b/java-cup-11b.jar:./jflex-1.8.2/lib/jflex-full-1.8.2.jar Main.java Lexer.java sym.java parser.java
java -cp .:./java-cup-bin-11b/java-cup-11b-runtime.jar Main entrada.txt