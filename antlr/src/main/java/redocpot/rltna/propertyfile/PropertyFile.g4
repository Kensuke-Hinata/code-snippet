grammar PropertyFile ;

file : prop+ ;
prop : ID '=' STRING '\n' ;

ID : LETTER (LETTER | DIGIT)* ;

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;

STRING : '"' (ESC | ~["\\])* '"' ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-zA-Z] ;
