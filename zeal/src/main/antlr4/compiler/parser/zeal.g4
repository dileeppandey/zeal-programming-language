grammar zeal;
//entry point for grammer
program: main_command_list ;   

main_command_list: command_list | function | command_list main_command_list | function main_command_list;

command_list: command 
            | command command_list ;

function_command_list: command 
            | command command_list ;
//assignment, if, while, function calling
command: varName=IDENTIFIER '=' expr ';'
       | declarations ';'
       | 'if' '(' bool_expr ')' '{' command_list '}' ('else' '{' command_list '}')* ';'
       | 'while' '(' bool_expr ')' '{' command_list '}' ';'
       | (data_types)? varName=IDENTIFIER '=' function_call ';'
       | function_call ';'
       | print_statement ';'
       ;
//num, bool initialisations and datatype declarations
declarations: varName='num' initialization_int
            | varName='bool'  initialization_bool
            | data_types varName=IDENTIFIER
            ;

//num datatype initialisation with multiple identifier
initialization_int: varName=IDENTIFIER '=' INT_VAL
                  | varName=IDENTIFIER '=' initialization_int ;

//bool datatype initialisation with multiple identifier
initialization_bool: varName=IDENTIFIER '=' bool_expr
                   | varName=IDENTIFIER '=' initialization_bool ;

//boolean evaluations
bool_expr: 'true'
         | 'false'
         | left=expr '==' right=expr
         | left=expr '!=' right=expr
         | left=expr '=<' right=expr
         | left=expr '<=' right=expr
         | left=expr '=>' right=expr
         | left=expr '>=' right=expr
         | left=expr '>' right=expr
         | left=expr '<' right=expr
         | '!' '(' bool_expr ')'
         | '(' bool_expr ')' '&&' '(' bool_expr ')'
         | '(' bool_expr ')' '||' '(' bool_expr ')'
         ;

//precedence expression evaluation
expr: left=expr '+' right=term
    | left=expr '-' right=term
    | term
    ;

//modulus multiplication and 
term: left=term '*' right=factor
    | left=term '/' right=factor
    | left=term '%' right=factor
    | factor
    ;
    
print_statement : 'print' '(' print_pattern ')';
print_pattern :  varName=IDENTIFIER
	| varName=IDENTIFIER ',' print_pattern
	| TEXT
	| function_call
	;

factor: varName=IDENTIFIER
        | INT_VAL
        | '(' expr ')'
        ;

function: 'function' returnType=return_types functionName=IDENTIFIER  '(' (arguments)* ')' '{' function_command_list (return_stmt ';')*  '}';
arguments: data_types varName=IDENTIFIER | data_types varName=IDENTIFIER ',' arguments;

function_call: functionName=IDENTIFIER '(' (params)* ')' ; 
params: varName=IDENTIFIER | varName=IDENTIFIER ',' params;

data_types: 'num' | 'bool';

return_types: data_types | 'void';

return_stmt: 'return' varName=IDENTIFIER 
           | 'return' expr
           ;

IDENTIFIER: [a-zA-Z]+[0-9]* ;

INT_VAL: [-]? [0-9]+ ;

TEXT: '"' (~["])* '"'
	;

WHITESPACE: [ \t\n\r]+ -> skip ;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

LINE_COMMENT:   '//' ~[\r\n]* -> skip;