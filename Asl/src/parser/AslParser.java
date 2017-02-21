// $ANTLR 3.4 /home/sephirot47/CL/Asl/src/parser/Asl.g 2017-02-21 19:59:17

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int DIV=9;
    public static final int DO=10;
    public static final int ELSE=11;
    public static final int ENDFUNC=12;
    public static final int ENDIF=13;
    public static final int ENDWHILE=14;
    public static final int EQUAL=15;
    public static final int ESC_SEQ=16;
    public static final int FALSE=17;
    public static final int FUNC=18;
    public static final int FUNCALL=19;
    public static final int GE=20;
    public static final int GT=21;
    public static final int ID=22;
    public static final int IF=23;
    public static final int INT=24;
    public static final int LE=25;
    public static final int LIST_FUNCTIONS=26;
    public static final int LIST_INSTR=27;
    public static final int LT=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MUL=31;
    public static final int NOT=32;
    public static final int NOT_EQUAL=33;
    public static final int OR=34;
    public static final int PARAMS=35;
    public static final int PLUS=36;
    public static final int PREF=37;
    public static final int PVALUE=38;
    public static final int READ=39;
    public static final int RETURN=40;
    public static final int STRING=41;
    public static final int THEN=42;
    public static final int TRUE=43;
    public static final int WHILE=44;
    public static final int WRITE=45;
    public static final int WS=46;

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
    public String getGrammarFileName() { return "/home/sephirot47/CL/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:8: ( func )+ EOF
            {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:8: ( func )+
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
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog163);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog166);  
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
            // 60:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:60:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:64:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:64:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:64:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func205); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func208); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func210);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func212);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func214); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,48,FOLLOW_48_in_params233);  
            stream_48.add(char_literal8);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==47) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params235);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,49,FOLLOW_49_in_params238);  
            stream_49.add(char_literal10);


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
            // 68:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:68:41: ( paramlist )?
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:72:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:72:10: ( param ( ',' ! param )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:72:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist264);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:72:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==50) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:72:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,50,FOLLOW_50_in_paramlist267); 

            	    pushFollow(FOLLOW_param_in_paramlist270);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:77:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:77:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:77:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,47,FOLLOW_47_in_param295);  
                    stream_47.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param299);  
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
                    // 77:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:77:26: ^( PREF[$id,$id.text] )
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param322);  
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
                    // 78:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:22: ^( PVALUE[$id,$id.text] )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:82:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:83:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:83:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions356);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:83:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==51) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:83:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,51,FOLLOW_51_in_block_instructions359);  
            	    stream_51.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions361);
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
            // 84:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:84:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:88:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:89:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==48) ) {
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
            case 51:
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:89:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction410);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:90:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction432);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:91:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction452);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:92:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction472);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:93:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction493);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:94:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction510);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:95:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction535);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:97:9: 
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:100:1: assign : ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | ID eq= EQUAL '[' expr_list ']' -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) ) );
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID25=null;
        Token ID27=null;
        Token char_literal28=null;
        Token char_literal30=null;
        AslParser.expr_return expr26 =null;

        AslParser.expr_list_return expr_list29 =null;


        AslTree eq_tree=null;
        AslTree ID25_tree=null;
        AslTree ID27_tree=null;
        AslTree char_literal28_tree=null;
        AslTree char_literal30_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:100:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | ID eq= EQUAL '[' expr_list ']' -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==52) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==FALSE||LA7_2==ID||LA7_2==INT||LA7_2==MINUS||LA7_2==NOT||LA7_2==PLUS||LA7_2==TRUE||LA7_2==48) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:100:10: ID eq= EQUAL expr
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign593);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign597);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign599);
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
                    // 100:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:100:30: ^( ASSIGN[$eq,\":=\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, ":=")
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:4: ID eq= EQUAL '[' expr_list ']'
                    {
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_assign615);  
                    stream_ID.add(ID27);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign619);  
                    stream_EQUAL.add(eq);


                    char_literal28=(Token)match(input,52,FOLLOW_52_in_assign621);  
                    stream_52.add(char_literal28);


                    pushFollow(FOLLOW_expr_list_in_assign623);
                    expr_list29=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list29.getTree());

                    char_literal30=(Token)match(input,53,FOLLOW_53_in_assign625);  
                    stream_53.add(char_literal30);


                    // AST REWRITE
                    // elements: expr_list, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 101:34: -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:37: ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, "[]=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:60: ^( ARGLIST expr_list )
                        {
                        AslTree root_2 = (AslTree)adaptor.nil();
                        root_2 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                        , root_2);

                        adaptor.addChild(root_2, stream_expr_list.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:105:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF31=null;
        Token THEN33=null;
        Token ELSE35=null;
        Token ENDIF37=null;
        AslParser.expr_return expr32 =null;

        AslParser.block_instructions_return block_instructions34 =null;

        AslParser.block_instructions_return block_instructions36 =null;


        AslTree IF31_tree=null;
        AslTree THEN33_tree=null;
        AslTree ELSE35_tree=null;
        AslTree ENDIF37_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:105:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:105:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF31=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt659); 
            IF31_tree = 
            (AslTree)adaptor.create(IF31)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF31_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt662);
            expr32=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr32.getTree());

            THEN33=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt664); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt667);
            block_instructions34=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions34.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:105:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:105:47: ELSE ! block_instructions
                    {
                    ELSE35=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt670); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt673);
                    block_instructions36=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions36.getTree());

                    }
                    break;

            }


            ENDIF37=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt677); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:109:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE38=null;
        Token DO40=null;
        Token ENDWHILE42=null;
        AslParser.expr_return expr39 =null;

        AslParser.block_instructions_return block_instructions41 =null;


        AslTree WHILE38_tree=null;
        AslTree DO40_tree=null;
        AslTree ENDWHILE42_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:109:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:109:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt700); 
            WHILE38_tree = 
            (AslTree)adaptor.create(WHILE38)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE38_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt703);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            DO40=(Token)match(input,DO,FOLLOW_DO_in_while_stmt705); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt708);
            block_instructions41=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions41.getTree());

            ENDWHILE42=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt710); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:113:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN43=null;
        AslParser.expr_return expr44 =null;


        AslTree RETURN43_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:113:13: ( RETURN ^ ( expr )? )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:113:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN43=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt733); 
            RETURN43_tree = 
            (AslTree)adaptor.create(RETURN43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN43_tree, root_0);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:113:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:113:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt736);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:117:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ45=null;
        Token ID46=null;

        AslTree READ45_tree=null;
        AslTree ID46_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:117:6: ( READ ^ ID )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:117:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ45=(Token)match(input,READ,FOLLOW_READ_in_read755); 
            READ45_tree = 
            (AslTree)adaptor.create(READ45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ45_tree, root_0);


            ID46=(Token)match(input,ID,FOLLOW_ID_in_read758); 
            ID46_tree = 
            (AslTree)adaptor.create(ID46)
            ;
            adaptor.addChild(root_0, ID46_tree);


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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE47=null;
        Token STRING49=null;
        AslParser.expr_return expr48 =null;


        AslTree WRITE47_tree=null;
        AslTree STRING49_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:7: ( WRITE ^ ( expr | STRING ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE47=(Token)match(input,WRITE,FOLLOW_WRITE_in_write778); 
            WRITE47_tree = 
            (AslTree)adaptor.create(WRITE47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE47_tree, root_0);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==48) ) {
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write782);
                    expr48=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr48.getTree());

                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:121:26: STRING
                    {
                    STRING49=(Token)match(input,STRING,FOLLOW_STRING_in_write786); 
                    STRING49_tree = 
                    (AslTree)adaptor.create(STRING49)
                    ;
                    adaptor.addChild(root_0, STRING49_tree);


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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:125:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR51=null;
        AslParser.boolterm_return boolterm50 =null;

        AslParser.boolterm_return boolterm52 =null;


        AslTree OR51_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:125:9: ( boolterm ( OR ^ boolterm )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:125:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr811);
            boolterm50=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm50.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:125:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:125:23: OR ^ boolterm
            	    {
            	    OR51=(Token)match(input,OR,FOLLOW_OR_in_expr814); 
            	    OR51_tree = 
            	    (AslTree)adaptor.create(OR51)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR51_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr817);
            	    boolterm52=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm52.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:128:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND54=null;
        AslParser.boolfact_return boolfact53 =null;

        AslParser.boolfact_return boolfact55 =null;


        AslTree AND54_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:128:9: ( boolfact ( AND ^ boolfact )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:128:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm837);
            boolfact53=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact53.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:128:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:128:23: AND ^ boolfact
            	    {
            	    AND54=(Token)match(input,AND,FOLLOW_AND_in_boolterm840); 
            	    AND54_tree = 
            	    (AslTree)adaptor.create(AND54)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND54_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm843);
            	    boolfact55=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact55.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL57=null;
        Token NOT_EQUAL58=null;
        Token LT59=null;
        Token LE60=null;
        Token GT61=null;
        Token GE62=null;
        AslParser.num_expr_return num_expr56 =null;

        AslParser.num_expr_return num_expr63 =null;


        AslTree EQUAL57_tree=null;
        AslTree NOT_EQUAL58_tree=null;
        AslTree LT59_tree=null;
        AslTree LE60_tree=null;
        AslTree GT61_tree=null;
        AslTree GE62_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact863);
            num_expr56=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr56.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:24: EQUAL ^
                            {
                            EQUAL57=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact867); 
                            EQUAL57_tree = 
                            (AslTree)adaptor.create(EQUAL57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL57_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL58=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact872); 
                            NOT_EQUAL58_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL58_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:46: LT ^
                            {
                            LT59=(Token)match(input,LT,FOLLOW_LT_in_boolfact877); 
                            LT59_tree = 
                            (AslTree)adaptor.create(LT59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT59_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:52: LE ^
                            {
                            LE60=(Token)match(input,LE,FOLLOW_LE_in_boolfact882); 
                            LE60_tree = 
                            (AslTree)adaptor.create(LE60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE60_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:58: GT ^
                            {
                            GT61=(Token)match(input,GT,FOLLOW_GT_in_boolfact887); 
                            GT61_tree = 
                            (AslTree)adaptor.create(GT61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT61_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:131:64: GE ^
                            {
                            GE62=(Token)match(input,GE,FOLLOW_GE_in_boolfact892); 
                            GE62_tree = 
                            (AslTree)adaptor.create(GE62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE62_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact896);
                    num_expr63=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr63.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS65=null;
        Token MINUS66=null;
        AslParser.term_return term64 =null;

        AslParser.term_return term67 =null;


        AslTree PLUS65_tree=null;
        AslTree MINUS66_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr916);
            term64=term();

            state._fsp--;

            adaptor.addChild(root_0, term64.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^)
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
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:21: PLUS ^
            	            {
            	            PLUS65=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr921); 
            	            PLUS65_tree = 
            	            (AslTree)adaptor.create(PLUS65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS65_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:134:29: MINUS ^
            	            {
            	            MINUS66=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr926); 
            	            MINUS66_tree = 
            	            (AslTree)adaptor.create(MINUS66)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS66_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr930);
            	    term67=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term67.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL69=null;
        Token DIV70=null;
        Token MOD71=null;
        AslParser.factor_return factor68 =null;

        AslParser.factor_return factor72 =null;


        AslTree MUL69_tree=null;
        AslTree DIV70_tree=null;
        AslTree MOD71_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term954);
            factor68=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor68.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:23: MUL ^
            	            {
            	            MUL69=(Token)match(input,MUL,FOLLOW_MUL_in_term959); 
            	            MUL69_tree = 
            	            (AslTree)adaptor.create(MUL69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL69_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:30: DIV ^
            	            {
            	            DIV70=(Token)match(input,DIV,FOLLOW_DIV_in_term964); 
            	            DIV70_tree = 
            	            (AslTree)adaptor.create(DIV70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV70_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:137:37: MOD ^
            	            {
            	            MOD71=(Token)match(input,MOD,FOLLOW_MOD_in_term969); 
            	            MOD71_tree = 
            	            (AslTree)adaptor.create(MOD71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD71_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term973);
            	    factor72=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor72.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT73=null;
        Token PLUS74=null;
        Token MINUS75=null;
        AslParser.atom_return atom76 =null;


        AslTree NOT73_tree=null;
        AslTree PLUS74_tree=null;
        AslTree MINUS75_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:14: NOT ^
                    {
                    NOT73=(Token)match(input,NOT,FOLLOW_NOT_in_factor996); 
                    NOT73_tree = 
                    (AslTree)adaptor.create(NOT73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT73_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:21: PLUS ^
                    {
                    PLUS74=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1001); 
                    PLUS74_tree = 
                    (AslTree)adaptor.create(PLUS74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS74_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:140:29: MINUS ^
                    {
                    MINUS75=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1006); 
                    MINUS75_tree = 
                    (AslTree)adaptor.create(MINUS75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS75_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1011);
            atom76=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom76.getTree());

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:147:1: atom : ( ID | INT | ( ID ^ '[' ! expr ']' !) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token ID77=null;
        Token INT78=null;
        Token ID79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        AslParser.expr_return expr81 =null;

        AslParser.funcall_return funcall83 =null;

        AslParser.expr_return expr85 =null;


        AslTree b_tree=null;
        AslTree ID77_tree=null;
        AslTree INT78_tree=null;
        AslTree ID79_tree=null;
        AslTree char_literal80_tree=null;
        AslTree char_literal82_tree=null;
        AslTree char_literal84_tree=null;
        AslTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:147:9: ( ID | INT | ( ID ^ '[' ! expr ']' !) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 52:
                    {
                    alt21=3;
                    }
                    break;
                case 48:
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
                case 49:
                case 50:
                case 51:
                case 53:
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
            case 48:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:147:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID77=(Token)match(input,ID,FOLLOW_ID_in_atom1037); 
                    ID77_tree = 
                    (AslTree)adaptor.create(ID77)
                    ;
                    adaptor.addChild(root_0, ID77_tree);


                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:148:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT78=(Token)match(input,INT,FOLLOW_INT_in_atom1052); 
                    INT78_tree = 
                    (AslTree)adaptor.create(INT78)
                    ;
                    adaptor.addChild(root_0, INT78_tree);


                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:149:6: ( ID ^ '[' ! expr ']' !)
                    {
                    root_0 = (AslTree)adaptor.nil();


                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:149:6: ( ID ^ '[' ! expr ']' !)
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:149:7: ID ^ '[' ! expr ']' !
                    {
                    ID79=(Token)match(input,ID,FOLLOW_ID_in_atom1060); 
                    ID79_tree = 
                    (AslTree)adaptor.create(ID79)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(ID79_tree, root_0);


                    char_literal80=(Token)match(input,52,FOLLOW_52_in_atom1063); 

                    pushFollow(FOLLOW_expr_in_atom1066);
                    expr81=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr81.getTree());

                    char_literal82=(Token)match(input,53,FOLLOW_53_in_atom1068); 

                    }


                    }
                    break;
                case 4 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:13: (b= TRUE |b= FALSE )
                    {
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:13: (b= TRUE |b= FALSE )
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
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1087);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1093);  
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
                    // 150:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1116);
                    funcall83=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall83.getTree());

                    }
                    break;
                case 6 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:152:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal84=(Token)match(input,48,FOLLOW_48_in_atom1130); 

                    pushFollow(FOLLOW_expr_in_atom1133);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());

                    char_literal86=(Token)match(input,49,FOLLOW_49_in_atom1135); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        AslParser.expr_list_return expr_list89 =null;


        AslTree ID87_tree=null;
        AslTree char_literal88_tree=null;
        AslTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:13: ID '(' ( expr_list )? ')'
            {
            ID87=(Token)match(input,ID,FOLLOW_ID_in_funcall1156);  
            stream_ID.add(ID87);


            char_literal88=(Token)match(input,48,FOLLOW_48_in_funcall1158);  
            stream_48.add(char_literal88);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1160);
                    expr_list89=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list89.getTree());

                    }
                    break;

            }


            char_literal90=(Token)match(input,49,FOLLOW_49_in_funcall1163);  
            stream_49.add(char_literal90);


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
            // 156:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:156:61: ( expr_list )?
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:160:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal92=null;
        AslParser.expr_return expr91 =null;

        AslParser.expr_return expr93 =null;


        AslTree char_literal92_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:160:10: ( expr ( ',' ! expr )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:160:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1196);
            expr91=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr91.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:160:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:160:19: ',' ! expr
            	    {
            	    char_literal92=(Token)match(input,50,FOLLOW_50_in_expr_list1199); 

            	    pushFollow(FOLLOW_expr_in_expr_list1202);
            	    expr93=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr93.getTree());

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


 

    public static final BitSet FOLLOW_func_in_prog163 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_prog166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_func208 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_params_in_func210 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_func212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_params233 = new BitSet(new long[]{0x0002800000400000L});
    public static final BitSet FOLLOW_paramlist_in_params235 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_params238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist264 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_paramlist267 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_param_in_paramlist270 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_47_in_param295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_param299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions356 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_block_instructions359 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions361 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign593 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign597 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_assign599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign615 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign619 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assign621 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_list_in_assign623 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assign625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt659 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt662 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt664 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt667 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt670 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt673 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt700 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_while_stmt703 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt705 = new BitSet(new long[]{0x0008318000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt708 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt733 = new BitSet(new long[]{0x0001081121420002L});
    public static final BitSet FOLLOW_expr_in_return_stmt736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read755 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_read758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write778 = new BitSet(new long[]{0x00010A1121420000L});
    public static final BitSet FOLLOW_expr_in_write782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr811 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr814 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_boolterm_in_expr817 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm837 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm840 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm843 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact863 = new BitSet(new long[]{0x0000000212308002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact867 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact872 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_LT_in_boolfact877 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_LE_in_boolfact882 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_GT_in_boolfact887 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_GE_in_boolfact892 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr916 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr921 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr926 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_term_in_num_expr930 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_factor_in_term954 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_MUL_in_term959 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_DIV_in_term964 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_MOD_in_term969 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_factor_in_term973 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_NOT_in_factor996 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_PLUS_in_factor1001 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_MINUS_in_factor1006 = new BitSet(new long[]{0x0001080001420000L});
    public static final BitSet FOLLOW_atom_in_factor1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1060 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1063 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_atom1066 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_atom1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atom1130 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_atom1133 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_atom1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1156 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_funcall1158 = new BitSet(new long[]{0x0003081121420000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1160 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcall1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1196 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_expr_list1199 = new BitSet(new long[]{0x0001081121420000L});
    public static final BitSet FOLLOW_expr_in_expr_list1202 = new BitSet(new long[]{0x0004000000000002L});

}