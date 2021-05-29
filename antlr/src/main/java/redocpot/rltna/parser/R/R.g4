grammar R;

prog : (expr_or_assign (';' | NL) | NL)* EOF ;

expr_or_assign : expr ('<-' | '=' | '<<-') expr_or_assign
               | expr
               ;

expr : '{' exprList '}'
     | 'if' '(' expr ')' expr
     | 'if' '(' expr ')' expr 'else' expr
     | 'for' '(' ID 'in' expr ')' expr
     | 'while' '(' expr ')' expr
     | 'repeat' expr
     | '?' expr
     | 'next'
     | 'break'
     | expr '[[' subList ']' ']'
     | expr '[' subList ']'
     | expr ('::' | ':::') expr
     | expr ('$' | '@') expr
     | expr '^'<assoc=right> expr
     | ('-' | '+') expr
     | expr ':' expr
     | expr USER_OP expr
     | expr ('*' | '/') expr
     | expr ('+' | '-') expr
     | expr ('>' | '>=' | '<' | '<=' | '==' | '!=') expr
     | '!' expr
     | expr ('&' | '&&') expr
     | expr ('|' | '||') expr
     | '~' expr
     | expr '~' expr
     | expr ('->' | '->>' | ':=') expr
     | 'function' '(' formList? ')' expr
     | expr '(' subList ')'
     | ID
     | NUMBER
     ;

exprList : expr_or_assign ( (';' | NL) expr_or_assign? )* ; 

formList : form (',' form)* ;

form : ID
     | ID '=' expr
     | '...'
     ;

subList : sub (',' sub)* ;

sub : expr
    | ID '='
    | ID '=' expr
    | STRING '='
    | STRING '=' expr
    | 'NULL' '='
    | 'NULL' '=' expr
    | '...'
    ;

NUMBER : (DIGIT)+ ;

STRING : '"' (ESC | ~["\\])* '"' ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-zA-Z] ;

ID : '.' (LETTER | '_' | '.') (LETTER | DIGIT | '_' | '.')*
   | LETTER (LETTER | DIGIT | '_' | '.')*
   ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;

NL : '\r'? '\n' ;

WS : [ \t\n\r]+ -> skip ;
