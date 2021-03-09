import java.io.*;

import javax.swing.text.html.parser.Parser;
/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        try {
            Lexer scanner = new Lexer(new FileReader(args[0]));
            parser miParser = new parser(scanner);
            miParser.parse();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}