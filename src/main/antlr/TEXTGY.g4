grammar TEXTGY;

programm
    :   (lause ';')*
    ;

lause
    :   omistamine
    |   iflause
    |   whilelause
    |   avaldis
    |   
    ;

omistamine
    :   'var' ':' tuup MUUTUJANIMI '=' avaldis
    ;

tuup
    :   'Boolean'
    |   'Integer'
    |   'Double'
    |   'String'
    ;

avaldis
    :   avaldis '+' avaldis2
    |   avaldis '-' avaldis2
    |   avaldis ('<'|'>'|'<='|'>='|'=='|'!='|'AND'|'OR'|'NOT') avaldis
    |   avaldis2
    ;

avaldis2
    :   avaldis2 '*' avaldis3
    |   avaldis2 '/' avaldis3
    |   avaldis3
    ;

avaldis3
    :   '-'* atom
    ;

atom
    :   SONE
    |   MUUTUJANIMI
    |   ARV
//    |   funktsioon
    |   '('avaldis')'
    ;

iflause
    :   'IF' '(' avaldis ')' 'THEN' programm ('ELSE IF' '(' avaldis ')' 'THEN' programm)* ('ELSE' programm)* 'END'
    ;

whilelause
    :   'WHILE' '(' avaldis ')' 'DO' programm 'END'
    ;

MUUTUJANIMI
    :   [A-Z\u00c4\u00d6\u00dc\u00D5][a-õ0-9_]*
    ;

SONE
    :   '"' [A-Z\u00c4\u00d6\u00dc\u00D5a-z\u00e4\u00f6\u00fc\u00F5 .,;:!?0-9\n\t]* '"'
    ;

ARV
    :   [1-9]+
    |   [1-9][0-9]*
    ;

WS
    :   [ \t\n]+ -> skip
    ;

KOMMENTAAR
    :   '/*' .? '*/' -> skip
    ;