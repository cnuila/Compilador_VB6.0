import java_cup.runtime.Symbol;
%%

%class Lexer
%int
%column
%line
%unicode
%state STRING
%state COMENTARIO

saltoLinea = \n|\r|\n\r
espacio = (" ")+
letra = [a-zA-Z]
digito = [0-9]
identificador = {letra}({letra}|{digito}|_)*|_{letra}({letra}|{digito}|_)*
DIM = (D|d)(I|i)(M|m)
AS = (A|a)(S|s)
BOOLEANTYPE = (B|b)(O|o)(O|o)(L|l)(E|e)(A|a)(N|n)
TRUE = (T|t)(R|r)(U|u)(E|e)
FALSE = (F|f)(A|a)(L|l)(S|s)(E|e)
INTEGERTYPE = (I|i)(N|n)(T|t)(E|e)(G|g)(E|e)(R|r)
INTEGER = {digito}+
STRINGTYPE = (S|s)(T|t)(R|r)(I|i)(N|n)(G|g)
delimitadorString = \"
OPREL = <>|<|>|<=|>=|=
OPADICION = "+"|-
OPMULTI = "*"|"/"
END = (E|e)(N|n)(D|d)
IF = (I|i)(F|f)
ELSE = (E|e)(L|l)(S|s)(E|e)
ELSEIF = (E|e)(L|l)(S|s)(E|e)(I|i)(F|f)
THEN = (T|t)(H|h)(E|e)(N|n)
AND = (A|a)(N|n)(D|d)
OR = (O|o)(R|r)
NOT = (N|n)(O|o)(T|t)
MODULE = (M|m)(O|o)(D|d)(U|u)(L|l)(E|e)
SUB = (S|s)(U|u)(B|b)
inicioComentario = '
PARENTESISL = "("
PARENTESISR = ")"
EXTSTRING = " &_"{saltoLinea}
READ = Console"."ReadLine
WRITE = Console"."WriteLine
CONTINUE = (C|c)(O|o)(N|n)(T|t)(I|i)(N|n)(U|u)(E|e)
EXIT = (E|e)(X|x)(I|i)(T|t)
FOR = (F|f)(O|o)(R|r)
TO = (T|t)(O|o) 
NEXT = (N|n)(E|e)(X|x)(T|t) 
STEP = (S|s)(T|t)(E|e)(P|p)
STRUCTURE = (S|s)(T|t)(R|r)(U|u)(C|c)(T|t)(U|u)(R|r)(E|e)
WHILE = (W|w)(H|h)(I|i)(L|l)(E|e)
DO = (D|d)(O|o)
UNTIL = (U|u)(N|n)(T|t)(I|i)(L|l)
LOOP = (L|l)(O|o)(O|o)(P|p)
RETURN = (R|r)(E|e)(T|t)(U|u)(R|r)(N|n)
CONCATSTRING = &

%%
<YYINITIAL> {
    {inicioComentario}      {System.out.println("COMENTARIO");yybegin(COMENTARIO);}
    {READ}                  {System.out.println("READ CONSOLE");}
    {WRITE}                 {System.out.println("WRITE IN CONSOLE");}
    {DIM}                   {System.out.println("DIM");}
    {AS}                    {System.out.println("AS");}
    {BOOLEANTYPE}           {System.out.println("BOOLEANTYPE");}
    {TRUE}                  {System.out.println("TRUE");}
    {FALSE}                 {System.out.println("FALSE");}
    {INTEGERTYPE}           {System.out.println("INTEGERTYPE");}
    {INTEGER}               {System.out.println("INTEGER");}
    {STRINGTYPE}            {System.out.println("STRINGTYPE");}
    {delimitadorString}     {System.out.println("STRING");yybegin(STRING);}  
    {EXTSTRING}             {System.out.println("EXTENDER STRING");} 
    {CONCATSTRING}          {System.out.println("CONCAT STRING");}
    {OPREL}                 {System.out.println("OP REL");}
    {OPADICION}             {System.out.println("OP ADICION");}    
    {OPMULTI}               {System.out.println("OP MULTIPLICACION");}    
    {END}                   {System.out.println("END");}
    {EXIT}                  {System.out.println("EXIT");}
    {CONTINUE}              {System.out.println("CONTINUE");}
    {ELSEIF}                {System.out.println("ELSE IF");}
    {IF}                    {System.out.println("IF");}
    {ELSE}                  {System.out.println("ELSE");}
    {THEN}                  {System.out.println("THEN");}    
    {AND}                   {System.out.println("AND");}
    {OR}                    {System.out.println("OR");}
    {NOT}                   {System.out.println("NOT");}
    {FOR}                   {System.out.println("FOR");}
    {TO}                    {System.out.println("TO");}
    {NEXT}                  {System.out.println("NEXT");}
    {STEP}                  {System.out.println("STEP");}
    {WHILE}                 {System.out.println("WHILE");}
    {DO}                    {System.out.println("DO");}
    {UNTIL}                 {System.out.println("UNTIL");}
    {LOOP}                  {System.out.println("LOOP");}
    {RETURN}                {System.out.println("RETURN");}
    {MODULE}                {System.out.println("MODULE");}
    {SUB}                   {System.out.println("SUB");}
    {STRUCTURE}             {System.out.println("STRUCTURE");}
    {PARENTESISL}           {System.out.println("INICIO PARENTESIS");}
    {PARENTESISR}           {System.out.println("FIN PARENTESIS");}     
    {identificador}         {System.out.println(yytext());}     
    {saltoLinea}            {System.out.println("ENTER");}
    {espacio}               {}
    .                       {System.out.println("Token no reconocido en: " + yyline + " " + yycolumn);}    
}

<STRING> {
    {delimitadorString}     {System.out.println();yybegin(YYINITIAL);}
    .                       {System.out.print(yytext());}    
}

<COMENTARIO> {
    {saltoLinea}            {yybegin(YYINITIAL);}
    .                       {}
}