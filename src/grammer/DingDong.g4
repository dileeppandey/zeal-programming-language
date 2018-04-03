grammar DingDong;






program: k ; 

k: 'begin' d_multipleDeclaration ';' c_multipleCommand 'end' '.' ;




d_multipleDeclaration: d1 ';' d_multipleDeclaration
                     | d1
                     ;
d1: 'const' IDENTIFIER '=' INT
  | 'var' IDENTIFIER
  ;




c_multipleCommand: c1 ';' c_multipleCommand
                 | c1
                 ;
c1: INT ':=' expr
  | 'if' booleani 'then' c_multipleCommand 'else' c_multipleCommand 'endif'
  | 'while' booleani 'do' c_multipleCommand 'endwhile'
  | k
  ;



booleani: 'true'
       | 'false'
       | expr '=' expr
       | 'not' booleani
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