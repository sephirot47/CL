// $ANTLR 3.4 ExprInterp.g 2017-02-14 19:54:32

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprInterpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FLOAT", "ID", "INT", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='", "'=='"
    };

    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int FLOAT=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprInterpParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprInterpParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ExprInterpParser.tokenNames; }
    public String getGrammarFileName() { return "ExprInterp.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // ExprInterp.g:12:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // ExprInterp.g:12:5: ( ( stat )+ )
            // ExprInterp.g:12:9: ( stat )+
            {
            // ExprInterp.g:12:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= FLOAT && LA1_0 <= NEWLINE)||LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ExprInterp.g:12:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog23);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // ExprInterp.g:14:1: stat : ( comp NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        float comp1 =0.0f;

        float expr3 =0.0f;


        try {
            // ExprInterp.g:14:5: ( comp NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
            case 9:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==15) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 11 && LA2_2 <= 14)||LA2_2==16) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // ExprInterp.g:14:9: comp NEWLINE
                    {
                    pushFollow(FOLLOW_comp_in_stat49);
                    comp1=comp();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat51); 

                    System.out.println(comp1);

                    }
                    break;
                case 2 :
                    // ExprInterp.g:15:9: ID '=' expr NEWLINE
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat63); 

                    match(input,15,FOLLOW_15_in_stat65); 

                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat69); 

                    memory.put((ID2!=null?ID2.getText():null), new Float(expr3));

                    }
                    break;
                case 3 :
                    // ExprInterp.g:17:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat89); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "comp"
    // ExprInterp.g:20:1: comp returns [float value] : e= expr ( '==' rhs= expr )? ;
    public final float comp() throws RecognitionException {
        float value = 0.0f;


        float e =0.0f;

        float rhs =0.0f;


        try {
            // ExprInterp.g:21:5: (e= expr ( '==' rhs= expr )? )
            // ExprInterp.g:21:7: e= expr ( '==' rhs= expr )?
            {
            pushFollow(FOLLOW_expr_in_comp112);
            e=expr();

            state._fsp--;


             value =e; 

            // ExprInterp.g:21:35: ( '==' rhs= expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ExprInterp.g:21:36: '==' rhs= expr
                    {
                    match(input,16,FOLLOW_16_in_comp117); 

                    pushFollow(FOLLOW_expr_in_comp121);
                    rhs=expr();

                    state._fsp--;


                    }
                    break;

            }


             value = (e==rhs ? 1.0f : 0.0f); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "comp"



    // $ANTLR start "expr"
    // ExprInterp.g:25:1: expr returns [float value] : e= multDivExpr ( '+' e= multDivExpr | '-' e= multDivExpr )* ;
    public final float expr() throws RecognitionException {
        float value = 0.0f;


        float e =0.0f;


        try {
            // ExprInterp.g:26:5: (e= multDivExpr ( '+' e= multDivExpr | '-' e= multDivExpr )* )
            // ExprInterp.g:26:9: e= multDivExpr ( '+' e= multDivExpr | '-' e= multDivExpr )*
            {
            pushFollow(FOLLOW_multDivExpr_in_expr157);
            e=multDivExpr();

            state._fsp--;


            value = e;

            // ExprInterp.g:27:9: ( '+' e= multDivExpr | '-' e= multDivExpr )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }
                else if ( (LA4_0==13) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ExprInterp.g:27:13: '+' e= multDivExpr
            	    {
            	    match(input,12,FOLLOW_12_in_expr173); 

            	    pushFollow(FOLLOW_multDivExpr_in_expr177);
            	    e=multDivExpr();

            	    state._fsp--;


            	    value += e;

            	    }
            	    break;
            	case 2 :
            	    // ExprInterp.g:28:13: '-' e= multDivExpr
            	    {
            	    match(input,13,FOLLOW_13_in_expr193); 

            	    pushFollow(FOLLOW_multDivExpr_in_expr197);
            	    e=multDivExpr();

            	    state._fsp--;


            	    value -= e;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multDivExpr"
    // ExprInterp.g:32:1: multDivExpr returns [float value] : e= atom ( '*' e= atom | '/' e= atom )* ;
    public final float multDivExpr() throws RecognitionException {
        float value = 0.0f;


        float e =0.0f;


        try {
            // ExprInterp.g:33:5: (e= atom ( '*' e= atom | '/' e= atom )* )
            // ExprInterp.g:33:7: e= atom ( '*' e= atom | '/' e= atom )*
            {
            pushFollow(FOLLOW_atom_in_multDivExpr233);
            e=atom();

            state._fsp--;


            value = e;

            // ExprInterp.g:33:35: ( '*' e= atom | '/' e= atom )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }
                else if ( (LA5_0==14) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ExprInterp.g:33:36: '*' e= atom
            	    {
            	    match(input,11,FOLLOW_11_in_multDivExpr238); 

            	    pushFollow(FOLLOW_atom_in_multDivExpr242);
            	    e=atom();

            	    state._fsp--;


            	    value *= e;

            	    }
            	    break;
            	case 2 :
            	    // ExprInterp.g:33:71: '/' e= atom
            	    {
            	    match(input,14,FOLLOW_14_in_multDivExpr248); 

            	    pushFollow(FOLLOW_atom_in_multDivExpr252);
            	    e=atom();

            	    state._fsp--;


            	    value /= e;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multDivExpr"



    // $ANTLR start "atom"
    // ExprInterp.g:36:1: atom returns [float value] : ( INT | FLOAT | ID | '(' e= expr ')' );
    public final float atom() throws RecognitionException {
        float value = 0.0f;


        Token INT4=null;
        Token FLOAT5=null;
        Token ID6=null;
        float e =0.0f;


        try {
            // ExprInterp.g:37:5: ( INT | FLOAT | ID | '(' e= expr ')' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt6=1;
                }
                break;
            case FLOAT:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                alt6=3;
                }
                break;
            case 9:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // ExprInterp.g:37:9: INT
                    {
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_atom280); 

                    value = Integer.parseInt((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 2 :
                    // ExprInterp.g:38:9: FLOAT
                    {
                    FLOAT5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom292); 

                    value = Float.parseFloat((FLOAT5!=null?FLOAT5.getText():null));

                    }
                    break;
                case 3 :
                    // ExprInterp.g:39:9: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_atom304); 


                            Float v = (Float) memory.get((ID6!=null?ID6.getText():null));
                            if ( v!=null ) value = v.floatValue();
                            else System.err.println("undefined variable "+(ID6!=null?ID6.getText():null));
                            

                    }
                    break;
                case 4 :
                    // ExprInterp.g:45:7: '(' e= expr ')'
                    {
                    match(input,9,FOLLOW_9_in_atom322); 

                    pushFollow(FOLLOW_expr_in_atom326);
                    e=expr();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_atom328); 

                    value = e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog23 = new BitSet(new long[]{0x00000000000002F2L});
    public static final BitSet FOLLOW_comp_in_stat49 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_stat51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat63 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stat65 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_comp112 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_comp117 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_expr_in_comp121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multDivExpr_in_expr157 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_expr173 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_multDivExpr_in_expr177 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_expr193 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_multDivExpr_in_expr197 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_atom_in_multDivExpr233 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_11_in_multDivExpr238 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_atom_in_multDivExpr242 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_14_in_multDivExpr248 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_atom_in_multDivExpr252 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_INT_in_atom280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_atom292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_atom322 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_expr_in_atom326 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_atom328 = new BitSet(new long[]{0x0000000000000002L});

}