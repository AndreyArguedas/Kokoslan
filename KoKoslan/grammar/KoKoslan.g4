/**
  KoKoslan Grammar
  EIF400 II-2017
  @author loriacarlo@gmail.com
  @since 2017
*/

grammar KoKoslan;


program           : definition* expression
;

definition        : 'let' id '=' expression
;
expression        : part_expr (',' part_expr)*
;
part_expr         :  lambda_expr | evaluable_expr | lambda_eval_expr
;

lambda_expr       :  pattern '->' expression | '\\' pattern '.' expression
;

/* Trying to support the case (x -> x * x) 666 and (\x. x * x) 666*/

lambda_eval_expr  :  '(' lambda_expr ')' expression
;

evaluable_expr    :   add_expr | add_expr | bool_expr test_expr?
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
value_expr        : '(' expression ')'         #ParentValueExpr
                  | value_expr call_args       #CallValueExpr
                  | atomic_value               #AtomicValueExpr
                  | list_value                 #ListValueExpr
                  | case_value                 #CaseValueExpr
;

atomic_value : id | number | bool | string
;
// List expressions
list_value   :  '[' list_expr? ']'
; 

list_expr    :  expression ( ','  expression)*
;

// Case expressions
case_value   :  '{' case_expr? '}'
;
case_expr    :  lambda_expr ( ','  lambda_expr)+
;

call_args    :  '(' list_expr? ')'
;

// Patterns
pattern      :  atomic_pat | list_pat
;
atomic_pat   : id | number | bool 
;
list_pat     : '[' list_body_pat? ']'
;
list_body_pat : pattern (',' pattern)* rest_body_pat?
;
rest_body_pat : '|' (id | list_pat)
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
ID : [a-zA-Z][a-zA-Z_0-9]* 
;
////////////////////////////////////////////////
// Ignored tokens
SLC :   '/*'.*? '*/' -> skip
;
MLC : '//'.*?'\r'?'\n' -> skip
;         
WS  : [ \t\r\n]+ -> skip
; 


