import java_cup.runtime.Symbol;
%%

%class Lexer
%int
%column
%line
%unicode
%state STRING
%state COMENTARIO
%ignorecase

saltoLinea = \n|\r|\n\r
espacio = (" ")+
letra = [a-zA-Z]
digito = [0-9]
identificador = {letra}({letra}|{digito}|_)*|_{letra}({letra}|{digito}|_)*
DIM = dim
AS = as
BOOLEANTYPE = boolean
TRUE = true
FALSE = false
INTEGERTYPE = integer
INTEGER = {digito}+
STRINGTYPE = string
delimitadorString = \"
OPREL = <>|<|>|<=|>=|=
OPADICION = "+"|-
OPMULTI = "*"|"/"
END = end
IF = if
ELSE = else
ELSEIF = elseif
THEN = then
AND = and
OR = or
NOT = not
MODULE = module
SUB = sub
inicioComentario = '
PARENTESISL = "("
PARENTESISR = ")"
EXTSTRING = " &_"{saltoLinea}
READ = console"."readline
WRITE = console"."writeline
CONTINUE = continue
EXIT = exit
FOR = for
TO = to
NEXT = next
STEP = step
STRUCTURE = structure
WHILE = while
DO = do
UNTIL = until
LOOP = loop
RETURN = return
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