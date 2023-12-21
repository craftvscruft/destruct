/* Public Domain

Destruct: Ray Myers, Mender.AI

Based on ES6 Destructuring.
Grammar Derived from antlr/examples-v4 JSON5.g4 which derived from JSON.g4
https://github.com/antlr/grammars-v4
https://json5.org
http://json.org

Example:

```
rule1 : { key: [a,...red], ... } => {f:5, ...a, g:7}
      | { key: [a,...red], ... } => {f:5, ...a, g:7};

rule1 : { key: [a,...red], ... } => {f:5, ...a, g:7};

rule2.a.* : {text} => text;
```
*/
grammar Destruct;

start
   : ruleStatement*
   ;

ruleStatement
   : ruleTarget ':' match ('|' match)* ';'
   ;

ruleTarget
   : IDENTIFIER targetSpecifier*
   ;

targetSpecifier
   : '.' IDENTIFIER
   | '.' '*'
   ;

match
   : destruct '=>' transformed
   ;

transformed
   : value
   ;

destruct
   : '{' destructPair (',' destructPair)* (',' destructRest?)? '}'
   | '{' '}'
   ;

destructRest
   : '...' key?
   ;

rest
   : '...' key
   ;

obj
   : '{' pair (',' pair)* ','? '}'
   | '{' '}'
   ;

destructPair
   : key (':' destructValue)? destructDefault?
   |
   ;

destructDefault
   : ('=' destructValue)
   ;

pair
   : rest
   | key (':' value)?
   ;

key
   : STRING
   | IDENTIFIER
   | LITERAL
   | NUMERIC_LITERAL
   ;

destructValue
   : STRING
   | number
   | obj
   | destructArr
   | LITERAL
   | IDENTIFIER
   ;

value
   : STRING
   | number
   | obj
   | arr
   | LITERAL
   | IDENTIFIER
   ;

destructArr
   : '[' destructArrValue destructDefault? (',' destructArrValue destructDefault?)* ','? ']'
   | '[' ']'
   ;

destructArrValue
   : destructValue
   | destructRest
   ;

arr
   : '[' arrValue (',' arrValue)* ','? ']'
   | '[' ']'
   ;

arrValue
   : value
   | rest
   ;

number
   : SYMBOL? (NUMERIC_LITERAL | NUMBER)
   ;
   // Lexer
   
SINGLE_LINE_COMMENT
   : '//' .*? (NEWLINE | EOF) -> skip
   ;

MULTI_LINE_COMMENT
   : '/*' .*? '*/' -> skip
   ;

LITERAL
   : 'true'
   | 'false'
   | 'null'
   ;

STRING
   : '"' DOUBLE_QUOTE_CHAR* '"'
   | '\'' SINGLE_QUOTE_CHAR* '\''
   ;

fragment DOUBLE_QUOTE_CHAR
   : ~ ["\\\r\n]
   | ESCAPE_SEQUENCE
   ;

fragment SINGLE_QUOTE_CHAR
   : ~ ['\\\r\n]
   | ESCAPE_SEQUENCE
   ;

fragment ESCAPE_SEQUENCE
   : '\\' (NEWLINE | UNICODE_SEQUENCE // \u1234
   | ['"\\/bfnrtv] // single escape char
   | ~ ['"\\bfnrtv0-9xu\r\n] // non escape char
   | '0' // \0
   | 'x' HEX HEX // \x3a
   )
   ;

NUMBER
   : INT ('.' [0-9]*)? EXP? // +1.e2, 1234, 1234.5
   | '.' [0-9]+ EXP? // -.2e3
   | '0' [xX] HEX+ // 0x12345678
   
   ;

NUMERIC_LITERAL
   : 'Infinity'
   | 'NaN'
   ;

SYMBOL
   : '+'
   | '-'
   ;

fragment HEX
   : [0-9a-fA-F]
   ;

fragment INT
   : '0'
   | [1-9] [0-9]*
   ;

fragment EXP
   : [Ee] SYMBOL? [0-9]*
   ;

IDENTIFIER
   : IDENTIFIER_START IDENTIFIER_PART*
   ;

fragment IDENTIFIER_START
   : [\p{L}]
   | '$'
   | '_'
   | '\\' UNICODE_SEQUENCE
   ;

fragment IDENTIFIER_PART
   : IDENTIFIER_START
   | [\p{M}]
   | [\p{N}]
   | [\p{Pc}]
   | '\u200C'
   | '\u200D'
   ;

fragment UNICODE_SEQUENCE
   : 'u' HEX HEX HEX HEX
   ;

fragment NEWLINE
   : '\r\n'
   | [\r\n\u2028\u2029]
   ;

WS
   : [ \t\n\r\u00A0\uFEFF\u2003]+ -> skip
   ;

