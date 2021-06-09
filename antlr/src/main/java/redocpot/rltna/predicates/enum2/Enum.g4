grammar Enum;

@lexer::members {
    public static boolean java5;
}

prog : (stat | enumDecl)+ ;
stat : ID '=' expr ';' { System.out.println($ID.text + "=" + $expr.text); } ;
expr : ID | INT ;

enumDecl : 'enum' name=ID '{' ID (',' ID)* '}'
    { System.out.println("enum " + $name.text); } ;

ENUM : 'enum' { java5 }? ;

INT : '0' | [1-9] [0-9]* ;
ID : LETTER (LETTER | DIGIT)* ;

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
