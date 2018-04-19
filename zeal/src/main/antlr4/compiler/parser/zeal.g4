grammar zeal;
//entry point for grammer
program: main_command_list ;   

//num, bool initialisations and datatype declarations
declarations: 'num' initialization_int
            | 'bool'  initialization_bool
            | data_types IDENTIFIER
            ;
//num datatype initialisation with multiple identifier
initialization_int: IDENTIFIER '=' INT_VAL
                  | IDENTIFIER '=' initialization_int ;

//bool datatype initialisation with multiple identifier
initialization_bool: IDENTIFIER '=' bool_expr
                   | IDENTIFIER '=' initialization_bool ;

main_command_list: (function)* command_list ;


command_list: command 
            | command command_list ;

function_command_list: command 
            | command command_list ;
//assignment, if, while, function calling
command: IDENTIFIER '=' expr ';'
       | declarations ';'
       | 'if' '(' bool_expr ')' '{' command_list '}' ('else' '{' command_list '}')* ';'
       | 'while' '(' bool_expr ')' '{' command_list '}' ';'
       | (data_types)? IDENTIFIER '=' function_call ';'
       | function_call ';'
       ;


//boolean evaluations
bool_expr: 'true'
         | 'false'
         | expr '==' expr
         | expr '!=' expr
         | expr '=<' expr
         | expr '<=' expr
         | expr '=>' expr
         | expr '>=' expr
         | expr '>' expr
         | expr '<' expr
         | '!' '(' bool_expr ')' 
         ;

//precedence expression evaluation
expr: expr '+' term
    | expr '-' term
    | term
    ;

//modulus multiplication and 
term: term '*' factor
    | term '/' factor
    | term '%' factor
    | factor
    ;

factor: IDENTIFIER
        | INT_VAL
        | '(' expr ')'
        ;

function: return_types IDENTIFIER '(' (params)* ')' '{' function_command_list (return_stmt ';')*  '}';

function_call: IDENTIFIER '(' (params)* ')' ; 

params: data_types IDENTIFIER | data_types IDENTIFIER ',' params | IDENTIFIER ;

data_types: 'num' | 'bool';

return_types: data_types | 'void';

return_stmt: 'return' IDENTIFIER 
           | 'return' expr
           ;

IDENTIFIER: [a-zA-Z]+[0-9]* ;

INT_VAL: [0-9]+ ;

WHITESPACE: [ \t\n\r]+ -> skip ;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

LINE_COMMENT:   '//' ~[\r\n]* -> skip;