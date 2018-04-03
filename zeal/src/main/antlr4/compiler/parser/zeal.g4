grammar zeal;

program: program_full ; 

program_full: declaration_list ';' command_list ;

declaration_list: declaration ';' declaration_list
                     | declaration
                     ;

 declaration: 'num' initialization_int
 	| 'bool'  initialization_bool
  	| data_types IDENTIFIER
  	;

command_list: command ';' command_list
                 | command
                 ;

command: INT_VAL ':=' expr
  | 'if' '(' bool_expr ')' '{' command_list '}' 'else' '{' command_list '}'
  | 'while' '(' bool_expr ')' '{' command_list '}'
  | program_full
  ;

bool_expr: 'true'
       | 'false'
       | expr '=' expr
       | 'not' bool_expr
       ;

data_types: 'num' | 'bool';

initialization_int: IDENTIFIER '=' INT_VAL | IDENTIFIER '=' initialization_int;

initialization_bool: IDENTIFIER '=' bool_expr | IDENTIFIER '=' initialization_bool;

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