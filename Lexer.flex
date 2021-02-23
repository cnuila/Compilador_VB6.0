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
DIM = Dim
AS = As
BOOLEANTYPE = Boolean
TRUE = True
FALSE = False
INTEGERTYPE = Integer
INTEGER = {digito}+
STRINGTYPE = String
delimitadorString = \"
OPREL = <>|<|>|<=|>=|=
OPARIT = "+"|-|"*"|"/"
IF = If
ELSE = Else
ELSEIF = ElseIf
THEN = Then
ENDIF = "End If"
AND = And
OR = Or
NOT = Not
MODULE = Module
ENDMODULE = "End Module"
SUB = Sub
ENDSUB = "End Sub"
inicioComentario = '
PARENTESISL = "("
PARENTESISR = ")"
EXTSTRING = " &_"{saltoLinea}
READ = Console"."ReadLine
WRITE = Console"."WriteLine

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
    {OPREL}                 {System.out.println("OPREL");}
    {OPARIT}                {System.out.println("OPARIT");}
    {ENDIF}                 {System.out.println("ENDIF");}
    {ELSEIF}                {System.out.println("ELSEIF");}
    {IF}                    {System.out.println("IF");}
    {ELSE}                  {System.out.println("ELSE");}
    {THEN}                  {System.out.println("THEN");}    
    {AND}                   {System.out.println("AND");}
    {OR}                    {System.out.println("OR");}
    {NOT}                   {System.out.println("NOT");}
    {MODULE}                {System.out.println("MODULE");}
    {ENDMODULE}             {System.out.println("ENDMODULE");}
    {SUB}                   {System.out.println("SUB");}
    {ENDSUB}                {System.out.println("ENDSUB");}
    {PARENTESISL}           {System.out.println("INICIO PARENTESIS");}
    {PARENTESISR}           {System.out.println("FIN PARENTESIS");}     
    {identificador}         {System.out.println("IDENTIFICADOR");}     
    {saltoLinea}            {}
    {espacio}               {}
    .                       {System.out.println("Token no reconocido en: " + yyline + " " + yycolumn);}    
}

<STRING> {
    {delimitadorString}     {yybegin(YYINITIAL);}
    .                       {}    
}

<COMENTARIO> {
    {saltoLinea}            {yybegin(YYINITIAL);}
    .                       {}
}