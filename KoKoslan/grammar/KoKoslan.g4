/**
  KoKoslan Grammar
  EIF400 II-2017
  @author loriacarlo@gmail.com
  @since 2017
*/

/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

grammar KoKoslan;


program           : definition* expression
;

definition        : 'let' id '=' expression
;
expression        : part_expr (',' part_expr)*
;
part_expr         :  lambda_expr | logic_expr | evaluable_expr | case_value
;

lambda_expr       : '\\' pattern '.' ( expression | pattern )   #BackslashLambda
                  | pattern '->' ( expression | pattern )       #ArrowLambda
;

logic_expr        :  rel_expr (rel_oper rel_expr)*
;

rel_expr          : evaluable_expr | '!' logic_expr
;

rel_oper          : oper=('||' | '&&')
;

evaluable_expr    :  add_expr | bool_expr test_expr?
;

add_expr          :  mult_expr (add_oper mult_expr)*
;

add_oper          : oper=('+' | '-')
;

mult_expr         : prefixUnary_expr (mult_oper prefixUnary_expr)*
;

mult_oper         :  oper=('*' | '/' | '%' | '^')
;

bool_expr         :  value_expr (bool_oper value_expr)*
;

prefixUnary_expr  : /*unary_oper?*/ posfixUnary_expr 
;

posfixUnary_expr   : value_expr unary_oper?
;

/**
 * Assuming these are the only unary operators for prefix and posfix
 * If there are any differences, they must be changed.
 */
unary_oper        : oper=('++'|'--')
;


bool_oper         :  oper=('>' | '<' | '==' | '<=' | '>=' | '!=')
;


test_expr         :  '?' expression ':' expression
;

// Value Expressions
value_expr        : '(' expression ')'              #ParentValueExpr
                  | '(' lambda_expr ')' value_expr  #EvaluableLambdaExpr
                  | value_expr call_args            #CallValueExpr
                  | atomic_value                    #AtomicValueExpr
                  | list_value                      #ListValueExpr
                  | while_then_expr                 #WhileThenExpr
;

while_then_expr   : while_condition '{' while_body '}' then_expr
;

while_condition   : 'while(' evaluable_expr ')'
;

while_body        : definition+
;

then_expr         : 'then' value_expr
;

atomic_value : id | number | bool | string
;
// List expressions
list_value   :  '[' list_expr? ']'
; 

list_expr    :  expression (','  expression)*
;

// Case expressions
case_value   :  '{' case_expr+ '}'
;
case_expr    :  lambda_expr ( '|'  lambda_expr)*
;

call_args    :  '(' list_expr? ')'
;

// Patterns
pattern      :  list_pat | atomic_pat
;
atomic_pat   : id | number | bool
;
list_pat     : '[' list_body_pat? ']'
;
list_body_pat : part_expr (',' part_expr)* rest_body_pat?
;
rest_body_pat : '|' (id | list_pat | value_expr)
;

id : ID
;

string : STRING
;

number : NUMBER
;
bool : TRUE | FALSE
;
////////////////////////////////////////////////////////////////
//                    Lexer    
///////////////////////////////////////////////////////////////
NUMBER : ('-')? INTEGER ('.' INTEGER)? 
;
fragment INTEGER : [0-9]+ ;

STRING : ('"' (~'"')* '"' )
;
DOT : '.'
;
BACK_SLASH : '\\'
;
COMMA : ','
;
COLON : ':'
;
QUESTION_MARK : '?'
;
LEFT_PAR : '('
;
RIGHT_PAR : ')'
;
LEFT_CURLY : '{'
;
RIGHT_CURLY : '}'
;
LEFT_BRACKET : '['
;
RIGHT_BRACKET : ']'
;
PIPE : '|'
;
LET : 'let'
;
NOT : '!'
;
EQ : '='
;
NEQ : '!='
;
LEQ : '<='
;
OR : '||'
;
TRUE : 'true'
;
FALSE : 'false'
;
MUL :   '*'
; 
DIV :   '/' 
;
ADD :   '+' 
;
SUB :   '-' 
;
ID : [a-z_A-Z][a-zA-Z_0-9]*
;
////////////////////////////////////////////////
// Ignored tokens
SLC :   '/*'.*? '*/' -> skip
;
MLC : '//'.*?'\r'?'\n' -> skip
;         
WS  : [ \t\r\n]+ -> skip
; 


