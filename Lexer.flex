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
END = End
IF = If
ELSE = Else
ELSEIF = ElseIf
THEN = Then
ENDIF = {END}{espacio}{IF}
AND = And
OR = Or
NOT = Not
MODULE = Module
ENDMODULE = {END}{espacio}{MODULE}
SUB = Sub
ENDSUB = {END}{espacio}{SUB}
inicioComentario = '
PARENTESISL = "("
PARENTESISR = ")"
EXTSTRING = " &_"{saltoLinea}
READ = Console"."ReadLine
WRITE = Console"."WriteLine
CONTINUE = Continue
EXIT = Exit
FOR = For
TO = To 
NEXT = Next 
STEP = Step 
CONTINUEFOR = {CONTINUE}{espacio}{FOR}
EXITFOR = {EXIT}{espacio}{FOR}
PRIVATE = Private
PUBLIC = Public
STRUCTURE = Structure
ENDSTRUCTURE = {END}{espacio}{STRUCTURE}
WHILE = While
CONTINUEWHILE = {CONTINUE}{espacio}{WHILE}
EXITWHILE = {EXIT}{espacio}{WHILE}
ENDWHILE = {END}{espacio}{WHILE}
DO = Do
UNTIL = Until
CONTINUEDO = {CONTINUE}{espacio}{DO}
EXITDO = {EXIT}{espacio}{DO}
LOOP = Loop
RETURN = Return
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
    {OPARIT}                {System.out.println("OP ARIT");}    
    {ENDMODULE}             {System.out.println("END MODULE");}
    {CONTINUEWHILE}         {System.out.println("CONTINUE WHILE");}    
    {CONTINUEDO}            {System.out.println("CONTINUE DO");}
    {EXITDO}                {System.out.println("EXIT DO");}
    {ENDIF}                 {System.out.println("END IF");}
    {CONTINUEFOR}           {System.out.println("CONTINUE FOR");}
    {EXITFOR}               {System.out.println("EXIT FOR");}
    {ENDSUB}                {System.out.println("END SUB");}
    {ENDWHILE}              {System.out.println("ENDW HILE");}
    {EXITWHILE}             {System.out.println("EXIT WHILE");}
    {ENDSTRUCTURE}          {System.out.println("END STRUCTURE");}
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
    {PUBLIC}                {System.out.println("PUBLIC");}
    {PRIVATE}               {System.out.println("PRIVATE");}
    {PARENTESISL}           {System.out.println("INICIO PARENTESIS");}
    {PARENTESISR}           {System.out.println("FIN PARENTESIS");}     
    {identificador}         {System.out.println("IDENTIFICADOR");}     
    {saltoLinea}            {System.out.println("ENTER");}
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