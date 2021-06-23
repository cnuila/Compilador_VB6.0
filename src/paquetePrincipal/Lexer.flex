import java_cup.runtime.Symbol;
%%

%cup
%class Lexer
%int
%column
%line
%unicode
%state STRING
%state COMENTARIO
%ignorecase

%{
    String cadena = "";
%}

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
OPREL = <>|<|>|<=|>=
IGUAL = "="
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
EXTSTRING = \""&_"{saltoLinea}{espacio}\"
READ = console"."readline{PARENTESISL}{PARENTESISR}
WRITE = console"."writeline
EXIT = exit
FOR = for
TO = to
NEXT = next
STRUCTURE = structure
WHILE = while
DO = do
LOOP = loop
RETURN = return
CONCATSTRING = "&"
COMA = ,
FUNCTION = function
PUNTO = "."
NEW = new 

%%
<YYINITIAL> {
    {inicioComentario}      {yybegin(COMENTARIO);}
    {READ}                  {return new Symbol(sym.READ,yyline,yycolumn,yytext());}
    {WRITE}                 {return new Symbol(sym.WRITE,yyline,yycolumn);}
    {DIM}                   {return new Symbol(sym.DIM,yyline,yycolumn);}
    {COMA}                  {return new Symbol(sym.COMA,yyline,yycolumn,yytext());}
    {AS}                    {return new Symbol(sym.AS,yyline,yycolumn,yytext());}
    {BOOLEANTYPE}           {return new Symbol(sym.BOOLEANTYPE,yyline,yycolumn);}
    {TRUE}                  {return new Symbol(sym.TRUE,yyline,yycolumn);}
    {FALSE}                 {return new Symbol(sym.FALSE,yyline,yycolumn);}
    {INTEGERTYPE}           {return new Symbol(sym.INTEGERTYPE,yyline,yycolumn);}
    {INTEGER}               {return new Symbol(sym.INTEGER,yyline,yycolumn,yytext());}
    {STRINGTYPE}            {return new Symbol(sym.STRINGTYPE,yyline,yycolumn);}
    {delimitadorString}     {cadena+="\"";yybegin(STRING);} 
    {CONCATSTRING}          {return new Symbol(sym.CONCATSTRING,yyline,yycolumn,yytext());} 
    {OPREL}                 {return new Symbol(sym.OPREL,yyline,yycolumn,yytext());}
    {IGUAL}                 {return new Symbol(sym.IGUAL,yyline,yycolumn);}
    {OPADICION}             {return new Symbol(sym.OPADICION,yyline,yycolumn,yytext());}    
    {OPMULTI}               {return new Symbol(sym.OPMULTI,yyline,yycolumn,yytext());}    
    {END}                   {return new Symbol(sym.END,yyline,yycolumn,yytext());}
    {EXIT}                  {return new Symbol(sym.EXIT,yyline,yycolumn,yytext());}    
    {ELSEIF}                {return new Symbol(sym.ELSEIF,yyline,yycolumn,yytext());}
    {IF}                    {return new Symbol(sym.IF,yyline,yycolumn,yytext());}
    {ELSE}                  {return new Symbol(sym.ELSE,yyline,yycolumn,yytext());}
    {THEN}                  {return new Symbol(sym.THEN,yyline,yycolumn,yytext());}    
    {AND}                   {return new Symbol(sym.AND,yyline,yycolumn,yytext());}
    {OR}                    {return new Symbol(sym.OR,yyline,yycolumn,yytext());}
    {NOT}                   {return new Symbol(sym.NOT,yyline,yycolumn,yytext());}
    {FOR}                   {return new Symbol(sym.FOR,yyline,yycolumn,yytext());}
    {TO}                    {return new Symbol(sym.TO,yyline,yycolumn,yytext());}
    {NEW}                   {return new Symbol(sym.NEW,yyline,yycolumn,yytext());}
    {NEXT}                  {return new Symbol(sym.NEXT,yyline,yycolumn,yytext());}    
    {WHILE}                 {return new Symbol(sym.WHILE,yyline,yycolumn,yytext());}
    {DO}                    {return new Symbol(sym.DO,yyline,yycolumn,yytext());}    
    {LOOP}                  {return new Symbol(sym.LOOP,yyline,yycolumn,yytext());}
    {RETURN}                {return new Symbol(sym.RETURN,yyline,yycolumn,yytext());}
    {MODULE}                {return new Symbol(sym.MODULE,yyline,yycolumn,yytext());}
    {FUNCTION}              {return new Symbol(sym.FUNCTION,yyline,yycolumn,yytext());}
    {SUB}                   {return new Symbol(sym.SUB,yyline,yycolumn,yytext());}
    {STRUCTURE}             {return new Symbol(sym.STRUCTURE,yyline,yycolumn,yytext());}
    {PARENTESISL}           {return new Symbol(sym.PARENTESISL,yyline,yycolumn,yytext());}
    {PARENTESISR}           {return new Symbol(sym.PARENTESISR,yyline,yycolumn,yytext());} 
    {PUNTO}                 {return new Symbol(sym.PUNTO,yyline,yycolumn,yytext());}    
    {identificador}         {return new Symbol(sym.identificador,yyline,yycolumn,yytext());}     
    {saltoLinea}            {return new Symbol(sym.saltoLinea,yyline,yycolumn,yytext());}
    {espacio}               {}
    .                       {System.out.println("Error léxico en: " + (yyline + 1) + " " + (yycolumn + 1));}    
}

<STRING> {
    {EXTSTRING}             {}
    {delimitadorString}     {String temp = cadena + "\""; cadena="";yybegin(YYINITIAL);return new Symbol(sym.STRING,yyline,yycolumn,temp);}    
    .                       {cadena+=yytext();}    
}

<COMENTARIO> {
    {saltoLinea}            {yybegin(YYINITIAL);}
    .                       {}
}