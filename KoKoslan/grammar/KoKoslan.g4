/**
  KoKoslan Grammar
  EIF400 II-2017
  @author loriacarlo@gmail.com
  @since 2017
*/

grammar KoKoslan;


program      : definition* expression
;

definition   : 'let' id '=' expression
;
expression   : part_expr (',' part_expr)*
;
part_expr    :  lambda_expr | evaluable_expr 
;
lambda_expr  : '\\' pattern '.' expression
;

evaluable_expr    :  add_expr test_expr?
;
add_expr          :  mult_expr (add_oper mult_expr)*
;
add_oper          : oper=('+' | '-')
;
mult_expr         :  value_expr (mult_oper value_expr)*
;

mult_oper         :  oper=('*' | '/' | '%')
;

test_expr         :  '?' expression ':' expression
;
// Value Expressions
value_expr   :    '(' expression ')'          #ParentValueExpr
                 | atomic_value               #AtomicValueExpr
				         | list_value                 #ListValueExpr
                 | case_value                 #CaseValueExpr
                 | value_expr call_args       #CallValueExpr
                 | unary_expr value_expr      #UnaryPreExpr (i.e: ++i, --i)
                 | value_expr unary_expr      #UnaryPosExpr (i.e: i++, i--)
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
case_expr    :  lambda_expr ( ','  lambda_expr)*
;

call_args         :  '(' list_expr? ')'
;

unary_expr   : oper=('++'|'--')
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


