grammar ExprInterp;

@header {
import java.util.HashMap;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   stat+;
                
stat:   comp NEWLINE {System.out.println($comp.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, new Float($expr.value));}
    |   NEWLINE
    ;

comp returns [float value]
    : e=expr { $value=$e.value; } ('==' rhs=expr)?
     { $value = ($e.value==$rhs.value ? 1.0f : 0.0f); }  
    ;

expr returns [float value]
    :   e=multDivExpr {$value = $e.value;}
        (   '+' e=multDivExpr {$value += $e.value;}
        |   '-' e=multDivExpr {$value -= $e.value;}
        )*
    ;

multDivExpr returns [float value]
    : e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;} | '/' e=atom {$value /= $e.value;} )*
    ;

atom returns [float value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   FLOAT {$value = Float.parseFloat($FLOAT.text);}
    |   ID
        {
        Float v = (Float) memory.get($ID.text);
        if ( v!=null ) $value = v.floatValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    | '(' e=expr ')'  {$value = $e.value;} 
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
FLOAT : INT'.'INT ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;

