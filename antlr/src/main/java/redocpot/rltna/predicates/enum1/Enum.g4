grammar Enum;

@parser::members {
    public static boolean java5;
}

prog : (stat | { java5 }? enumDecl)+ ;
stat : id '=' expr ';' { System.out.println($id.text + "=" + $expr.text); } ;
expr : id | INT ;

enumDecl : 'enum' name=id '{' id (',' id)* '}'
    { System.out.println("enum " + $name.text); } ;

id : ID | { !java5 }? 'enum' ;

INT : '0' | [1-9] [0-9]* ;
ID : LETTER (LETTER | DIGIT)* ;

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
