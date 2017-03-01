// $ANTLR 3.4 /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g 2017-03-01 16:44:07

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARR_ACCESS", "ARR_ELM_ASSIGN", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARR_ACCESS=6;
    public static final int ARR_ELM_ASSIGN=7;
    public static final int ASSIGN=8;
    public static final int BOOLEAN=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int ELSE=13;
    public static final int ENDFUNC=14;
    public static final int ENDIF=15;
    public static final int ENDWHILE=16;
    public static final int EQUAL=17;
    public static final int ESC_SEQ=18;
    public static final int FALSE=19;
    public static final int FUNC=20;
    public static final int FUNCALL=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INT=26;
    public static final int LE=27;
    public static final int LIST=28;
    public static final int LIST_FUNCTIONS=29;
    public static final int LIST_INSTR=30;
    public static final int LT=31;
    public static final int MINUS=32;
    public static final int MOD=33;
    public static final int MUL=34;
    public static final int NOT=35;
    public static final int NOT_EQUAL=36;
    public static final int OR=37;
    public static final int PARAMS=38;
    public static final int PLUS=39;
    public static final int PREF=40;
    public static final int PVALUE=41;
    public static final int READ=42;
    public static final int RETURN=43;
    public static final int STRING=44;
    public static final int THEN=45;
    public static final int TRUE=46;
    public static final int WHILE=47;
    public static final int WRITE=48;
    public static final int WS=49;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:8: ( func )+ EOF
            {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog185);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog188);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 63:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:63:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:67:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:67:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:67:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func227); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func230); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func232);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func234);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func236); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,51,FOLLOW_51_in_params255);  
            stream_51.add(char_literal8);


            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==50) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params257);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,52,FOLLOW_52_in_params260);  
            stream_52.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 71:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:71:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:75:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:75:10: ( param ( ',' ! param )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:75:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist286);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:75:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:75:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,53,FOLLOW_53_in_paramlist289); 

            	    pushFollow(FOLLOW_param_in_paramlist292);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:80:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:80:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:80:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,50,FOLLOW_50_in_param317);  
                    stream_50.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param321);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 80:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:80:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:81:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param344);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 81:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:81:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:85:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:86:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:86:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions378);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:86:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==54) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:86:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,54,FOLLOW_54_in_block_instructions381);  
            	    stream_54.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions383);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 87:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:87:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:91:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;



        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:92:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==55) ) {
                    alt6=1;
                }
                else if ( (LA6_1==51) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 54:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:92:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction432);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:93:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction454);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:94:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction474);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:95:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction494);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:96:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction515);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:97:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction532);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:98:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction557);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:100:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:103:1: assign : ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\"ASSIGN\"] ID expr ) | ID '[' index= expr ']' eq= EQUAL val= expr -> ^( ARR_ELM_ASSIGN ^( ARR_ACCESS ID $index) $val) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID25=null;
        Token ID27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        AslParser.expr_return index =null;

        AslParser.expr_return val =null;

        AslParser.expr_return expr26 =null;


        AslTree eq_tree=null;
        AslTree ID25_tree=null;
        AslTree ID27_tree=null;
        AslTree char_literal28_tree=null;
        AslTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:103:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\"ASSIGN\"] ID expr ) | ID '[' index= expr ']' eq= EQUAL val= expr -> ^( ARR_ELM_ASSIGN ^( ARR_ACCESS ID $index) $val) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==55) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:103:10: ID eq= EQUAL expr
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign615);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign619);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign621);
                    expr26=expr();

                    state._fsp--;

                    stream_expr.add(expr26.getTree());

                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 103:27: -> ^( ASSIGN[$eq,\"ASSIGN\"] ID expr )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:103:30: ^( ASSIGN[$eq,\"ASSIGN\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:105:4: ID '[' index= expr ']' eq= EQUAL val= expr
                    {
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_assign639);  
                    stream_ID.add(ID27);


                    char_literal28=(Token)match(input,55,FOLLOW_55_in_assign641);  
                    stream_55.add(char_literal28);


                    pushFollow(FOLLOW_expr_in_assign645);
                    index=expr();

                    state._fsp--;

                    stream_expr.add(index.getTree());

                    char_literal29=(Token)match(input,56,FOLLOW_56_in_assign647);  
                    stream_56.add(char_literal29);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign651);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign655);
                    val=expr();

                    state._fsp--;

                    stream_expr.add(val.getTree());

                    // AST REWRITE
                    // elements: ID, index, val
                    // token labels: 
                    // rule labels: val, index, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_val=new RewriteRuleSubtreeStream(adaptor,"rule val",val!=null?val.tree:null);
                    RewriteRuleSubtreeStream stream_index=new RewriteRuleSubtreeStream(adaptor,"rule index",index!=null?index.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 105:44: -> ^( ARR_ELM_ASSIGN ^( ARR_ACCESS ID $index) $val)
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:105:47: ^( ARR_ELM_ASSIGN ^( ARR_ACCESS ID $index) $val)
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARR_ELM_ASSIGN, "ARR_ELM_ASSIGN")
                        , root_1);

                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:105:64: ^( ARR_ACCESS ID $index)
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARR_ACCESS, "ARR_ACCESS")
                        , root_2);

                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_2, stream_index.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_val.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:109:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF30=null;
        Token THEN32=null;
        Token ELSE34=null;
        Token ENDIF36=null;
        AslParser.expr_return expr31 =null;

        AslParser.block_instructions_return block_instructions33 =null;

        AslParser.block_instructions_return block_instructions35 =null;


        AslTree IF30_tree=null;
        AslTree THEN32_tree=null;
        AslTree ELSE34_tree=null;
        AslTree ENDIF36_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:109:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:109:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF30=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt692); 
            IF30_tree = 
            (AslTree)adaptor.create(IF30)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF30_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt695);
            expr31=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr31.getTree());

            THEN32=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt697); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt700);
            block_instructions33=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions33.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:109:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:109:47: ELSE ! block_instructions
                    {
                    ELSE34=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt703); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt706);
                    block_instructions35=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions35.getTree());

                    }
                    break;

            }


            ENDIF36=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt710); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:113:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE37=null;
        Token DO39=null;
        Token ENDWHILE41=null;
        AslParser.expr_return expr38 =null;

        AslParser.block_instructions_return block_instructions40 =null;


        AslTree WHILE37_tree=null;
        AslTree DO39_tree=null;
        AslTree ENDWHILE41_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:113:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:113:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE37=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt733); 
            WHILE37_tree = 
            (AslTree)adaptor.create(WHILE37)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE37_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt736);
            expr38=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr38.getTree());

            DO39=(Token)match(input,DO,FOLLOW_DO_in_while_stmt738); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt741);
            block_instructions40=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions40.getTree());

            ENDWHILE41=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt743); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:117:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN42=null;
        AslParser.expr_return expr43 =null;


        AslTree RETURN42_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:117:13: ( RETURN ^ ( expr )? )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:117:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN42=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt766); 
            RETURN42_tree = 
            (AslTree)adaptor.create(RETURN42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN42_tree, root_0);


            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:117:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==51||LA9_0==55) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:117:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt769);
                    expr43=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr43.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:121:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ44=null;
        Token ID45=null;

        AslTree READ44_tree=null;
        AslTree ID45_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:121:6: ( READ ^ ID )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:121:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ44=(Token)match(input,READ,FOLLOW_READ_in_read788); 
            READ44_tree = 
            (AslTree)adaptor.create(READ44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ44_tree, root_0);


            ID45=(Token)match(input,ID,FOLLOW_ID_in_read791); 
            ID45_tree = 
            (AslTree)adaptor.create(ID45)
            ;
            adaptor.addChild(root_0, ID45_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE46=null;
        Token STRING48=null;
        AslParser.expr_return expr47 =null;


        AslTree WRITE46_tree=null;
        AslTree STRING48_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:7: ( WRITE ^ ( expr | STRING ) )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write811); 
            WRITE46_tree = 
            (AslTree)adaptor.create(WRITE46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE46_tree, root_0);


            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==51||LA10_0==55) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write815);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:125:26: STRING
                    {
                    STRING48=(Token)match(input,STRING,FOLLOW_STRING_in_write819); 
                    STRING48_tree = 
                    (AslTree)adaptor.create(STRING48)
                    ;
                    adaptor.addChild(root_0, STRING48_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:129:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR50=null;
        AslParser.boolterm_return boolterm49 =null;

        AslParser.boolterm_return boolterm51 =null;


        AslTree OR50_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:129:9: ( boolterm ( OR ^ boolterm )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:129:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr844);
            boolterm49=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm49.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:129:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:129:23: OR ^ boolterm
            	    {
            	    OR50=(Token)match(input,OR,FOLLOW_OR_in_expr847); 
            	    OR50_tree = 
            	    (AslTree)adaptor.create(OR50)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR50_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr850);
            	    boolterm51=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm51.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:132:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND53=null;
        AslParser.boolfact_return boolfact52 =null;

        AslParser.boolfact_return boolfact54 =null;


        AslTree AND53_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:132:9: ( boolfact ( AND ^ boolfact )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:132:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm870);
            boolfact52=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact52.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:132:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:132:23: AND ^ boolfact
            	    {
            	    AND53=(Token)match(input,AND,FOLLOW_AND_in_boolterm873); 
            	    AND53_tree = 
            	    (AslTree)adaptor.create(AND53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND53_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm876);
            	    boolfact54=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact54.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL56=null;
        Token NOT_EQUAL57=null;
        Token LT58=null;
        Token LE59=null;
        Token GT60=null;
        Token GE61=null;
        AslParser.num_expr_return num_expr55 =null;

        AslParser.num_expr_return num_expr62 =null;


        AslTree EQUAL56_tree=null;
        AslTree NOT_EQUAL57_tree=null;
        AslTree LT58_tree=null;
        AslTree LE59_tree=null;
        AslTree GT60_tree=null;
        AslTree GE61_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact896);
            num_expr55=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr55.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:24: EQUAL ^
                            {
                            EQUAL56=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact900); 
                            EQUAL56_tree = 
                            (AslTree)adaptor.create(EQUAL56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL56_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL57=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact905); 
                            NOT_EQUAL57_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL57_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:46: LT ^
                            {
                            LT58=(Token)match(input,LT,FOLLOW_LT_in_boolfact910); 
                            LT58_tree = 
                            (AslTree)adaptor.create(LT58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT58_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:52: LE ^
                            {
                            LE59=(Token)match(input,LE,FOLLOW_LE_in_boolfact915); 
                            LE59_tree = 
                            (AslTree)adaptor.create(LE59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE59_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:58: GT ^
                            {
                            GT60=(Token)match(input,GT,FOLLOW_GT_in_boolfact920); 
                            GT60_tree = 
                            (AslTree)adaptor.create(GT60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT60_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:135:64: GE ^
                            {
                            GE61=(Token)match(input,GE,FOLLOW_GE_in_boolfact925); 
                            GE61_tree = 
                            (AslTree)adaptor.create(GE61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE61_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact929);
                    num_expr62=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr62.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS64=null;
        Token MINUS65=null;
        AslParser.term_return term63 =null;

        AslParser.term_return term66 =null;


        AslTree PLUS64_tree=null;
        AslTree MINUS65_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr949);
            term63=term();

            state._fsp--;

            adaptor.addChild(root_0, term63.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:21: PLUS ^
            	            {
            	            PLUS64=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr954); 
            	            PLUS64_tree = 
            	            (AslTree)adaptor.create(PLUS64)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS64_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:138:29: MINUS ^
            	            {
            	            MINUS65=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr959); 
            	            MINUS65_tree = 
            	            (AslTree)adaptor.create(MINUS65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS65_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr963);
            	    term66=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term66.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL68=null;
        Token DIV69=null;
        Token MOD70=null;
        AslParser.factor_return factor67 =null;

        AslParser.factor_return factor71 =null;


        AslTree MUL68_tree=null;
        AslTree DIV69_tree=null;
        AslTree MOD70_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term987);
            factor67=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor67.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:23: MUL ^
            	            {
            	            MUL68=(Token)match(input,MUL,FOLLOW_MUL_in_term992); 
            	            MUL68_tree = 
            	            (AslTree)adaptor.create(MUL68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL68_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:30: DIV ^
            	            {
            	            DIV69=(Token)match(input,DIV,FOLLOW_DIV_in_term997); 
            	            DIV69_tree = 
            	            (AslTree)adaptor.create(DIV69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV69_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:141:37: MOD ^
            	            {
            	            MOD70=(Token)match(input,MOD,FOLLOW_MOD_in_term1002); 
            	            MOD70_tree = 
            	            (AslTree)adaptor.create(MOD70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD70_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1006);
            	    factor71=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor71.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT72=null;
        Token PLUS73=null;
        Token MINUS74=null;
        AslParser.atom_return atom75 =null;


        AslTree NOT72_tree=null;
        AslTree PLUS73_tree=null;
        AslTree MINUS74_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:14: NOT ^
                    {
                    NOT72=(Token)match(input,NOT,FOLLOW_NOT_in_factor1029); 
                    NOT72_tree = 
                    (AslTree)adaptor.create(NOT72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT72_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:21: PLUS ^
                    {
                    PLUS73=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1034); 
                    PLUS73_tree = 
                    (AslTree)adaptor.create(PLUS73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS73_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:144:29: MINUS ^
                    {
                    MINUS74=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1039); 
                    MINUS74_tree = 
                    (AslTree)adaptor.create(MINUS74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS74_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1044);
            atom75=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom75.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:151:1: atom : ( ID | INT | ( ID '[' expr ']' ) -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| '[' expr_list ']' -> ^( LIST expr_list ) );
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID76=null;
        Token INT77=null;
        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        AslParser.expr_return expr80 =null;

        AslParser.funcall_return funcall82 =null;

        AslParser.expr_return expr84 =null;

        AslParser.expr_list_return expr_list87 =null;


        AslTree b_tree=null;
        AslTree ID76_tree=null;
        AslTree INT77_tree=null;
        AslTree ID78_tree=null;
        AslTree char_literal79_tree=null;
        AslTree char_literal81_tree=null;
        AslTree char_literal83_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal86_tree=null;
        AslTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:151:9: ( ID | INT | ( ID '[' expr ']' ) -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| '[' expr_list ']' -> ^( LIST expr_list ) )
            int alt21=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 55:
                    {
                    alt21=3;
                    }
                    break;
                case 51:
                    {
                    alt21=5;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQUAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case THEN:
                case 52:
                case 53:
                case 54:
                case 56:
                    {
                    alt21=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            case INT:
                {
                alt21=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=4;
                }
                break;
            case 51:
                {
                alt21=6;
                }
                break;
            case 55:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:151:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID76=(Token)match(input,ID,FOLLOW_ID_in_atom1070); 
                    ID76_tree = 
                    (AslTree)adaptor.create(ID76)
                    ;
                    adaptor.addChild(root_0, ID76_tree);


                    }
                    break;
                case 2 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:152:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT77=(Token)match(input,INT,FOLLOW_INT_in_atom1085); 
                    INT77_tree = 
                    (AslTree)adaptor.create(INT77)
                    ;
                    adaptor.addChild(root_0, INT77_tree);


                    }
                    break;
                case 3 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:153:6: ( ID '[' expr ']' )
                    {
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:153:6: ( ID '[' expr ']' )
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:153:7: ID '[' expr ']'
                    {
                    ID78=(Token)match(input,ID,FOLLOW_ID_in_atom1093);  
                    stream_ID.add(ID78);


                    char_literal79=(Token)match(input,55,FOLLOW_55_in_atom1095);  
                    stream_55.add(char_literal79);


                    pushFollow(FOLLOW_expr_in_atom1097);
                    expr80=expr();

                    state._fsp--;

                    stream_expr.add(expr80.getTree());

                    char_literal81=(Token)match(input,56,FOLLOW_56_in_atom1099);  
                    stream_56.add(char_literal81);


                    }


                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 153:24: -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:153:27: ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARR_ACCESS, ID78, "ARR_ACCESS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:154:13: (b= TRUE |b= FALSE )
                    {
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:154:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:154:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1129);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:154:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1135);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 154:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:154:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:155:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1158);
                    funcall82=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall82.getTree());

                    }
                    break;
                case 6 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:156:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal83=(Token)match(input,51,FOLLOW_51_in_atom1172); 

                    pushFollow(FOLLOW_expr_in_atom1175);
                    expr84=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr84.getTree());

                    char_literal85=(Token)match(input,52,FOLLOW_52_in_atom1177); 

                    }
                    break;
                case 7 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:157:6: '[' expr_list ']'
                    {
                    char_literal86=(Token)match(input,55,FOLLOW_55_in_atom1185);  
                    stream_55.add(char_literal86);


                    pushFollow(FOLLOW_expr_list_in_atom1187);
                    expr_list87=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list87.getTree());

                    char_literal88=(Token)match(input,56,FOLLOW_56_in_atom1189);  
                    stream_56.add(char_literal88);


                    // AST REWRITE
                    // elements: expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 157:24: -> ^( LIST expr_list )
                    {
                        // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:157:27: ^( LIST expr_list )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(LIST, "LIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID89=null;
        Token char_literal90=null;
        Token char_literal92=null;
        AslParser.expr_list_return expr_list91 =null;


        AslTree ID89_tree=null;
        AslTree char_literal90_tree=null;
        AslTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:13: ID '(' ( expr_list )? ')'
            {
            ID89=(Token)match(input,ID,FOLLOW_ID_in_funcall1217);  
            stream_ID.add(ID89);


            char_literal90=(Token)match(input,51,FOLLOW_51_in_funcall1219);  
            stream_51.add(char_literal90);


            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==51||LA22_0==55) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1221);
                    expr_list91=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list91.getTree());

                    }
                    break;

            }


            char_literal92=(Token)match(input,52,FOLLOW_52_in_funcall1224);  
            stream_52.add(char_literal92);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 161:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:161:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:165:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal94=null;
        AslParser.expr_return expr93 =null;

        AslParser.expr_return expr95 =null;


        AslTree char_literal94_tree=null;

        try {
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:165:10: ( expr ( ',' ! expr )* )
            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:165:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1257);
            expr93=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr93.getTree());

            // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:165:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/jfons/FIB/CL/labs/Asl/src/parser/Asl.g:165:19: ',' ! expr
            	    {
            	    char_literal94=(Token)match(input,53,FOLLOW_53_in_expr_list1260); 

            	    pushFollow(FOLLOW_expr_in_expr_list1263);
            	    expr95=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr95.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog185 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EOF_in_prog188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func227 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func230 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_params_in_func232 = new BitSet(new long[]{0x00418C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_func234 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_params255 = new BitSet(new long[]{0x0014000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params257 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_params260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist286 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_paramlist289 = new BitSet(new long[]{0x0004000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist292 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_50_in_param317 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions378 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_block_instructions381 = new BitSet(new long[]{0x00418C0003000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions383 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign615 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assign619 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_assign621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign639 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_assign641 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_assign645 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_assign647 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_assign651 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_assign655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt692 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt695 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt697 = new BitSet(new long[]{0x00418C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt700 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt703 = new BitSet(new long[]{0x00418C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt706 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt733 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_while_stmt736 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt738 = new BitSet(new long[]{0x00418C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt766 = new BitSet(new long[]{0x0088408905080002L});
    public static final BitSet FOLLOW_expr_in_return_stmt769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read788 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_read791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write811 = new BitSet(new long[]{0x0088508905080000L});
    public static final BitSet FOLLOW_expr_in_write815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr844 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OR_in_expr847 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_boolterm_in_expr850 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm870 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm873 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm876 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact896 = new BitSet(new long[]{0x0000001088C20002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact900 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact905 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_LT_in_boolfact910 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_LE_in_boolfact915 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_GT_in_boolfact920 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_GE_in_boolfact925 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr949 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr954 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr959 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_term_in_num_expr963 = new BitSet(new long[]{0x0000008100000002L});
    public static final BitSet FOLLOW_factor_in_term987 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_MUL_in_term992 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_DIV_in_term997 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_MOD_in_term1002 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_factor_in_term1006 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_NOT_in_factor1029 = new BitSet(new long[]{0x0088400005080000L});
    public static final BitSet FOLLOW_PLUS_in_factor1034 = new BitSet(new long[]{0x0088400005080000L});
    public static final BitSet FOLLOW_MINUS_in_factor1039 = new BitSet(new long[]{0x0088400005080000L});
    public static final BitSet FOLLOW_atom_in_factor1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1093 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1095 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_atom1097 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom1172 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_atom1175 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom1185 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_list_in_atom1187 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1217 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funcall1219 = new BitSet(new long[]{0x0098408905080000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1221 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_funcall1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1257 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expr_list1260 = new BitSet(new long[]{0x0088408905080000L});
    public static final BitSet FOLLOW_expr_in_expr_list1263 = new BitSet(new long[]{0x0020000000000002L});

}