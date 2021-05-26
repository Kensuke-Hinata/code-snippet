grammar LExpr ;

s : e ;
e returns [int value]
  : e MULT e # Mult
  | e ADD e # Add
  | INT # Int ;

INT : [0-9] ;
MULT : '*' ;
ADD : '+' ;

WS : '\n' -> skip ;
