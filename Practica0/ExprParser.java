// $ANTLR 3.4 Expr.g 2017-02-14 18:49:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", "'*'", "'+'", "'-'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int ID=4;
    public static final int INT=5;
    public static final int NEWLINE=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "Expr.g"; }



    // $ANTLR start "prog"
    // Expr.g:3:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // Expr.g:3:5: ( ( stat )+ )
            // Expr.g:3:9: ( stat )+
            {
            // Expr.g:3:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Expr.g:3:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog11);
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
    // Expr.g:5:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        try {
            // Expr.g:5:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=2;
                }
                else if ( (LA2_1==NEWLINE||(LA2_1 >= 8 && LA2_1 <= 10)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt2=1;
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
                    // Expr.g:5:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat38);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat40); 

                    }
                    break;
                case 2 :
                    // Expr.g:6:9: ID '=' expr NEWLINE
                    {
                    match(input,ID,FOLLOW_ID_in_stat50); 

                    match(input,11,FOLLOW_11_in_stat52); 

                    pushFollow(FOLLOW_expr_in_stat54);
                    expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat56); 

                    }
                    break;
                case 3 :
                    // Expr.g:7:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat66); 

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



    // $ANTLR start "expr"
    // Expr.g:10:1: expr : multExpr ( '+' multExpr | '-' multExpr )* ;
    public final void expr() throws RecognitionException {
        try {
            // Expr.g:10:5: ( multExpr ( '+' multExpr | '-' multExpr )* )
            // Expr.g:10:9: multExpr ( '+' multExpr | '-' multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_expr80);
            multExpr();

            state._fsp--;


            // Expr.g:10:18: ( '+' multExpr | '-' multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }
                else if ( (LA3_0==10) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // Expr.g:10:19: '+' multExpr
            	    {
            	    match(input,9,FOLLOW_9_in_expr83); 

            	    pushFollow(FOLLOW_multExpr_in_expr85);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // Expr.g:10:34: '-' multExpr
            	    {
            	    match(input,10,FOLLOW_10_in_expr89); 

            	    pushFollow(FOLLOW_multExpr_in_expr91);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // Expr.g:13:1: multExpr : atom ( '*' atom )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // Expr.g:13:9: ( atom ( '*' atom )* )
            // Expr.g:13:13: atom ( '*' atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr107);
            atom();

            state._fsp--;


            // Expr.g:13:18: ( '*' atom )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==8) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Expr.g:13:19: '*' atom
            	    {
            	    match(input,8,FOLLOW_8_in_multExpr110); 

            	    pushFollow(FOLLOW_atom_in_multExpr112);
            	    atom();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // Expr.g:16:1: atom : ( INT | ID );
    public final void atom() throws RecognitionException {
        try {
            // Expr.g:16:5: ( INT | ID )
            // Expr.g:
            {
            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog11 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_expr_in_stat38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat50 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_stat52 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_expr_in_stat54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_stat56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr80 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_9_in_expr83 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_multExpr_in_expr85 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10_in_expr89 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_multExpr_in_expr91 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_atom_in_multExpr107 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_multExpr110 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_atom_in_multExpr112 = new BitSet(new long[]{0x0000000000000102L});

}