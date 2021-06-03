grammar Keywords;

@lexer::header {
import java.util.*;
}

@lexer::members {
    Map<String, Integer> Keywords = new HashMap<String, Integer>() {{
        put("begin", KeywordsParser.BEGIN);
        put("end", KeywordsParser.END);
        put("if", KeywordsParser.IF);
        put("then", KeywordsParser.THEN);
        put("while", KeywordsParser.WHILE);
    }};
}

tokens { BEGIN, END, IF, THEN, WHILE }

stat : BEGIN stat* END
     | IF expr THEN stat
     | WHILE expr stat
     | ID '=' expr ';'
     ;

expr : INT | CHAR ;

INT : '0' | [1-9] [0-9]* ;
CHAR : '\'' . '\'' { setText(String.valueOf(getText().charAt(1))); } ;

ID : '.' (LETTER | '_' | '.') (LETTER | DIGIT | '_' | '.')*
   | LETTER (LETTER | DIGIT | '_' | '.')*
    {
        if (Keywords.containsKey(getText())) {
            setType(Keywords.get(getText()));
        }
    }
   ;

fragment LETTER : [a-zA-Z] ;
fragment DIGIT : [0-9] ;

WS : [ \t\n\r]+ -> skip ;
