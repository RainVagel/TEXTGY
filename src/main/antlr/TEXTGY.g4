grammar TEXTGY;

programm
    :   lausetejada
    ;

lausetejada
    :   (lause ';')*
    ;

lause
    :   omistamine
    |   iflause
    |   whilelause
    |   avaldis
//    |   objektiloomine
    |   funktsiooniloomine
    |   alterlause
    |   muutujadeklaratsioon
    |   tagastuslause
    ;

tagastuslause
    :   'return' avaldis
    ;

omistamine
    :   MUUTUJANIMI '=' avaldis
    ;

muutujadeklaratsioon
    :   'var' ':' tuup MUUTUJANIMI ('=' avaldis)?
    |   'var' MUUTUJANIMI '=' avaldis
    |   'var' ':' tuup MUUTUJANIMI '=' objektiloomine
    ;

tuup
    :   'Boolean'
    |   'Integer'
    |   'Double'
    |   'String'
    |   'Object'
    ;

iflause
    :   'IF' '(' avaldis ')' 'THEN' programm ('ELSE IF' '(' avaldis ')' 'THEN' programm)* ('ELSE' programm)? 'END'
    ;

whilelause
    :   'WHILE' '(' avaldis ')' 'DO' programm 'END'
    ;

//alterlause
//    :   'ALTER' MUUTUJANIMI altertegevus
//    ;

alterlause
    :   'ALTER' MUUTUJANIMI FUNKTSIOONINIMI '(' (avaldis (',' avaldis )*)? ')'
    ;

//altertegevus
//    :   FUNKTSIOONINIMI '(' MUUTUJANIMI ':' ARV (',' MUUTUJANIMI ':' ARV)* ')'          # SkillAlter
//    |   FUNKTSIOONINIMI '(' MUUTUJANIMI (',' MUUTUJANIMI )* ')'                         # UlejaanudAlter
//    ;

//altertegevus
//    :   hastegevus
//    |   addtegevus
//    |   removetegevus
//    |   changetegevus
//    ;
//
//hastegevus
//    :   'HAS' 'ITEM' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                         # HasItem
//    |   'HAS' 'SKILL' '(' MUUTUJANIMI (',' MUUTUJANIMI)*')'                         # HasSkill
//    |   'HAS' 'ATTRIBUTE' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                    # HasAttribute
//    ;
//
//addtegevus
//    :   'ADD' 'ITEM' '(' MUUTUJANIMI  (',' MUUTUJANIMI)* ')'                        # AddItem
//    |   'ADD' 'SKILL' '(' MUUTUJANIMI ':' ARV (',' MUUTUJANIMI ':' ARV)* ')'        # AddSkill
//    |   'ADD' 'ATTRIBUTE' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                    # AddAttribute
//    ;
//
//removetegevus
//    :   'REMOVE' 'ITEM' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                      # RemoveItem
//    |   'REMOVE' 'SKILL' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                     # RemoveSkill
//    |   'REMOVE' 'ATTRIBUTE' '(' MUUTUJANIMI (',' MUUTUJANIMI)* ')'                 # RemoveAttribute
//    ;
//
//changetegevus
//    :   'CHANGE' 'SKILL' '(' MUUTUJANIMI ':' ('+'|'-') ARV ')'                      # ChangeSkillPlusMinus
//    |   'CHANGE' 'SKILL' '(' MUUTUJANIMI ':' ARV ')'                                # ChangeSkillRegular
//    |   'CHANGE' 'DESCRIPTION' '(' SONE ')'                                         # ChangeDescription
//    ;

//objektiloomine
//    :   'CREATE' 'NEW' 'OBJECT' MUUTUJANIMI 'AS' 'TYPE' objektituup 'WITH' objektiparameeter (',' objektiparameeter)* 'END'
//    ;

objektiloomine
    :   'CREATE' 'NEW' 'OBJECT' MUUTUJANIMI 'AS' 'TYPE' objektituup 'WITH' funktsioonivaljakutseobjekt (',' funktsioonivaljakutseobjekt)* 'END'
    ;

funktsiooniloomine
    :   'CREATE' 'NEW' 'FUNCTION' FUNKTSIOONINIMI '(' ((tuup ':' MUUTUJANIMI ',')* tuup ':' MUUTUJANIMI)? ')' ':' programm 'END'
    |   'CREATE' 'NEW' 'FUNCTION' FUNKTSIOONINIMI '(' ((tuup ':' MUUTUJANIMI ',')* tuup ':' MUUTUJANIMI)? ')' '->' tuup ':' programm 'END'
    ;

objektituup
    :   'Creature'
    |   'Item'
    |   'Room'
    ;

//objektiparameetrid
//    :   objektiparameeter (',' objektiparameeter)*
//    ;

objektiparameeter
    :   'DESCRIPTION' '(' SONE ')'                                              # DescriptionParameeter
    |   'ITEM' '(' MUUTUJANIMI ')'                                              # ItemParameeter
    |   'SKILL' '(' MUUTUJANIMI ':' ARV ')'                                     # SkillParameeter
    |   'ATTRIBUTE' '(' MUUTUJANIMI ')'                                         # AttributeParameeter
    ;

funktsioonivaljakutseobjekt
    :   FUNKTSIOONINIMI '(' (avaldis (',' avaldis )*)? ')'
    ;

avaldis
    :   avaldis5
    ;

avaldis5
    :   avaldis4 ('<'|'>'|'<='|'>='|'=='|'!='|'fnNot'|'fnOr'|'fnNot') avaldis4        # Vordlemine
    |   avaldis4                                                                # TriviaalneAvaldis5
    ;

avaldis4
    :   avaldis4 ('+'|'-') avaldis3                                             # LiitmineLahutamine
    |   avaldis3                                                                # TriviaalneAvaldis4
    ;

avaldis3
    :   avaldis3 ('*'|'/') avaldis2                                             # KorrutamineJagamine
    |   avaldis2                                                                # TriviaalneAvaldis3
    ;

avaldis2
    :   '-' avaldis2                                                            # UnaarneMiinus
    |   avaldis1                                                                # TriviaalneAvaldis2
    ;

avaldis1
    :   FUNKTSIOONINIMI '(' (avaldis (',' avaldis )*)? ')'                      # FunktsiooniValjakutse
    |   avaldis0                                                                # TriviaalneAvaldis1
    ;

avaldis0
    :   SONE                                                                    # SoneLiteraalR
    |   MUUTUJANIMI                                                             # MuutujaNimiR
    |   ARV                                                                     # ArvuLiteraalR
    |   '('avaldis')'                                                           # SuluAvaldis
    |   MUUTUJANIMI ':' ARV                                                     # SkillAvaldis
    ;

FUNKTSIOONINIMI
    : 'fn'[A-Z\u00c4\u00d6\u00dc\u00D5][A-Z\u00c4\u00d6\u00dc\u00D5a-õ0-9_]*
    ;

MUUTUJANIMI
    :   [A-Z\u00c4\u00d6\u00dc\u00D5][A-Z\u00c4\u00d6\u00dc\u00D5a-õ0-9_]*
    ;

SONE
    :   '"' [A-Z\u00c4\u00d6\u00dc\u00D5a-z\u00e4\u00f6\u00fc\u00F5 .,;:!?0-9\n\t]* '"'
    ;

ARV
    :   [1-9]+
    |   [1-9][0-9]*
    |   [0-9]+ '.' [0-9]+
    ;

WS
    :   [ \t\n]+ -> skip
    ;

KOMMENTAAR
    :   '/*' .? '*/' -> skip
    ;