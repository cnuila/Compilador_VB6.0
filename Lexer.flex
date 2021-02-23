%%

%class Lexer
%int
%column
%line
%unicode
%state STRING

saltoLinea = \n|\r|\n\r
letra = [a-zA-Z_]
digito = [0-9]
identificador = {letra}|({letra}|{digito})+
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
THEN = Then
ENDIF = "End If"
AND = And
OR = Or
NOT = Not

%%
<YYINITIAL> {
    {DIM}                   {System.out.println("DIM");}
    {AS}                    {System.out.println("AS");}
    {BOOLEANTYPE}           {System.out.println("BOOLEANTYPE");}
    {TRUE}                  {System.out.println("TRUE");}
    {FALSE}                 {System.out.println("FALSE");}
    {INTEGERTYPE}           {System.out.println("INTEGERTYPE");}
    {INTEGER}               {System.out.println("INTEGER");}
    {STRINGTYPE}            {System.out.println("STRINGTYPE");}
    {delimitadorString}     {System.out.println("STRING");yybegin(STRING);}   
    {OPREL}                 {System.out.println("OPREL");}
    {OPARIT}                {System.out.println("OPARIT");}
    {ENDIF}                 {System.out.println("ENDIF");}
    {IF}                    {System.out.println("IF");}
    {ELSE}                  {System.out.println("ELSE");}
    {THEN}                  {System.out.println("THEN");}    
    {AND}                   {System.out.println("AND");}
    {OR}                    {System.out.println("OR");}
    {NOT}                   {System.out.println("NOT");} 
    {identificador}         {System.out.println("IDENTIFICADOR");}
    {saltoLinea}            {}
    .                       {}    
}

<STRING> {
    {delimitadorString}     {yybegin(YYINITIAL);}
    .                       {}    
}