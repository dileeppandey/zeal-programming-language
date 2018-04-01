grammar experiment;

BEGIN: 'begin';
SEMICOLON: ';' ;
END: 'end' ;
DOT: '.' ;
CONST: 'const' ;
VAR: 'var' ;


program: k; 

k: BEGIN d_multipleDeclaration SEMICOLON c_multipleCommand END DOT ;




d_multipleDeclaration: d1 SEMICOLON d_multipleDeclaration
                     | d1
                     ;
d1: CONST IDENTIFIER '=' INT
  | VAR IDENTIFIER
  ;




c_multipleCommand: c1 SEMICOLON c_multipleCommand
                 | c1
                 ;
c1: INT ':=' expr
  | 'if' BOOLEANI 'then' c_multipleCommand 'else' c_multipleCommand 'endif'
  | 'while' BOOLEANI 'do' c_multipleCommand 'endwhile'
  | k
  ;



BOOLEANI: 'true'
       | 'false'
       | expr '=' expr
       | 'not' BOOLEANI
       ;



expr: term '+' expr
    | term '-' expr
    | term
    ;

term: factor '*' term
    | factor '/' term
    | factor
    ;

factor: IDENTIFIER
        | INT
        ;





IDENTIFIER: [a-z]+ ;



INT: [0-9]+ ;