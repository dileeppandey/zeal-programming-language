grammar zeal;

program: program_full ; 

program_full: declaration_list ';' | declaration_list ';' command_list ;

declaration_list: declaration ';' declaration_list
                | declaration 
                ;

 declaration: 'num' initialization_int
            | 'bool'  initialization_bool
            | data_types IDENTIFIER
            ;

initialization_int: IDENTIFIER '=' INT_VAL 
                  | IDENTIFIER '=' initialization_int ;

initialization_bool: IDENTIFIER '=' bool_expr 
                   | IDENTIFIER '=' initialization_bool ;

command_list: command ';'
            | command ';' command_list
            | declaration_list
            ;

command: IDENTIFIER '=' expr
       | 'if' '(' bool_expr ')' '{' command_list '}' 'else' '{' command_list '}'
       | 'while' '(' bool_expr ')' '{' command_list '}'
       | program_full
       ;

bool_expr: 'true'
         | 'false'
         | expr '==' expr
         | '!' bool_expr
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
        | INT_VAL
        | '(' expr ')'
        ;

function: return_types IDENTIFIER '(' (params)* ')' '{' command_list ';' (return_stmt)* ';' '}';

params: data_types IDENTIFIER | data_types IDENTIFIER ',' params ;

data_types: 'num' | 'bool';

return_types: data_types | 'void';

return_stmt: 'return' IDENTIFIER ;

IDENTIFIER: [a-zA-Z]+[0-9]* ;

INT_VAL: [0-9]+ ;

WHITESPACE: [ \t\n\r]+ -> skip ;