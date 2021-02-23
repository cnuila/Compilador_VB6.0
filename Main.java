import java.io.*;
/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        try {
            Lexer scanner = new Lexer(new FileReader(args[0]));
            scanner.yylex();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}