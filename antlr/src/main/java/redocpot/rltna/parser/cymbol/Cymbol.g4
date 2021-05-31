grammar Cymbol;

file : (functionDeclare | variableDeclare)+ ;
variableDeclare : type ID ('=' expr)? ';' ;
type : 'float' | 'int' | 'void' ;
functionDeclare : type ID '(' formalParameters? ')' block ;
formalParameters : formalParameter (',' formalParameter)* ;
formalParameter : type ID ;
block : '{' stat* '}' ;

stat : block
     | variableDeclare
     | 'if' expr 'then' stat ('else' stat)?
     | 'return' expr ';'
     | expr '=' expr ';'
     | expr ';'
     ;

expr : ID '(' exprList? ')'     # Call
     | expr '[' expr ']'        # Index
     | '-' expr                 # Negate
     | '!' expr                 # Not
     | expr '*' expr            # Mult
     | expr ('+' | '-') expr    # AddSub
     | expr '==' expr           # Equal
     | ID                       # Var
     | INT                      # Int
     | '(' expr ')'             # Parens
     ;

exprList : expr (',' expr)* ;

ID : LETTER (LETTER | DIGIT)* ;
INT : '0' | [1-9] [0-9]* ;

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
