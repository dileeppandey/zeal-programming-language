grammar zeal;
//entry point for grammer
program: main_command_list+ ;   

main_command_list: command_list #commands
                  | function #functions;

command_list: command 
            | command command_list ;

function_command_list: command 
            | command command_list ;
            
label_command_list: (command)+;            
            
            
//assignment, if, while, function calling
command: varName=IDENTIFIER '=' expr ';' #VarAssign
       | declarations ';'  #VarInit
       | 'if' '(' bool_expr ')' '{' label_command_list '}' ('else' '{' label_command_list '}')? ';' #IfElseBlock
       | 'while' '(' bool_expr ')' '{' label_command_list '}' ';' #WhileBlock
       | (data_types)? varName=IDENTIFIER '=' function_call ';' #FunctionToVarAssign
       | function_call ';' #FunctionCall
       | print_statement ';' #PrintExpression
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
bool_expr: 'true' #TrueExpression
         | 'false' #FalseExpression
         | left=expr '==' right=expr #Equality
         | left=expr '!=' right=expr #NotEqual
         | left=expr '=<' right=expr #EqualLessThan
         | left=expr '<=' right=expr #LessThanEqual
         | left=expr '=>' right=expr #EqualGreaterThan
         | left=expr '>=' right=expr #GreaterThanEqual
         | left=expr '>' right=expr #GreaterThan
         | left=expr '<' right=expr #LessThan
         | '!' '(' bool_expr ')' #NotEqual
         | '(' bool_expr ')' '&&' '(' bool_expr ')' #AndOperator
         | '(' bool_expr ')' '||' '(' bool_expr ')' #OrOperator
         ;

//precedence expression evaluation
expr: left=expr '+' right=term #Add
    | left=expr '-' right=term #Sub
    | term #TermExpression
    ;

//modulus multiplication and 
term: left=term '*' right=factor #Multiply
    | left=term '/' right=factor #Divide
    | left=term '%' right=factor #Mod
    | factor #FactorExpression
    ;
    
print_statement : 'print' '(' print_pattern ')';
print_pattern :  varName=IDENTIFIER #PrintSymbol
	| varName=IDENTIFIER ',' print_pattern #PrintRecursive
	| TEXT #PrintText
	| function_call #PrintFunctionCall
	;

factor: varName=IDENTIFIER #variableAssign
        | value=INT_VAL #valueAssign
        | expression='(' expr ')' #expressionAssign
        ;

function: 'function' returnType=return_types functionName=IDENTIFIER  '(' (argumentList+=arguments)* ')' '{' function_command_list (return_stmt ';')*  '}';
arguments: data_types varName=IDENTIFIER | data_types varName=IDENTIFIER ',' arguments;

function_call: functionName=IDENTIFIER '(' (params)* ')' ; 
params: varName=IDENTIFIER | varName=IDENTIFIER ',' params;

data_types: 'num' #NumericalDataType
            | 'bool' #BooleanDataType;

return_types: data_types #ReturnTypeDataType
              | 'void' #ReturnTypeVoid;

return_stmt: 'return' varName=IDENTIFIER #ReturnVariable
           | 'return' expr #ReturnExpression
           ;

IDENTIFIER: [a-zA-Z]+[0-9]* ;

INT_VAL: [-]? [0-9]+ ;

TEXT: '"' (~["])* '"'
	;

WHITESPACE: [ \t\n\r]+ -> skip ;

BLOCK_COMMENT : '/*' .*? '*/' -> skip;

LINE_COMMENT:   '//' ~[\r\n]* -> skip;