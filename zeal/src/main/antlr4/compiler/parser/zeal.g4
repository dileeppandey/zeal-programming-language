grammar zeal;

program: program_full ; 

program_full: declaration_list ';' command_list ;

declaration_list: declaration ';' declaration_list
                     | declaration
                     ;
declaration: 'num' IDENTIFIER '=' INT_VAL | 'bool' IDENTIFIER '=' bool_expr
  | data_types IDENTIFIER
  ;

command_list: command ';' command_list
                 | command
                 ;

command: INT_VAL ':=' expr
  | 'if' bool_expr 'then' command_list 'else' command_list 'endif'
  | 'while' bool_expr 'do' command_list 'endwhile'
  | program_full
  ;



bool_expr: 'true'
       | 'false'
       | expr '=' expr
       | 'not' bool_expr
       ;

data_types: 'num' | 'bool';


expr: term '+' expr
    | term '-' expr
    | term
    ;

term: factor '*' term
    | factor '/' term
    | factor
    ;

factor: IDENTIFIER
        | INT_VAL
        ;





IDENTIFIER: [a-z]+ ;



INT_VAL: [0-9]+ ;