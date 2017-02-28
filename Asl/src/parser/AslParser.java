// $ANTLR 3.4 /home/sephirot47/CL/Asl/src/parser/Asl.g 2017-02-28 18:35:54

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ARR_ACCESS", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ARR_ACCESS=6;
    public static final int ASSIGN=7;
    public static final int BOOLEAN=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int DO=11;
    public static final int ELSE=12;
    public static final int ENDFUNC=13;
    public static final int ENDIF=14;
    public static final int ENDWHILE=15;
    public static final int EQUAL=16;
    public static final int ESC_SEQ=17;
    public static final int FALSE=18;
    public static final int FUNC=19;
    public static final int FUNCALL=20;
    public static final int GE=21;
    public static final int GT=22;
    public static final int ID=23;
    public static final int IF=24;
    public static final int INT=25;
    public static final int LE=26;
    public static final int LIST_FUNCTIONS=27;
    public static final int LIST_INSTR=28;
    public static final int LT=29;
    public static final int MINUS=30;
    public static final int MOD=31;
    public static final int MUL=32;
    public static final int NOT=33;
    public static final int NOT_EQUAL=34;
    public static final int OR=35;
    public static final int PARAMS=36;
    public static final int PLUS=37;
    public static final int PREF=38;
    public static final int PVALUE=39;
    public static final int READ=40;
    public static final int RETURN=41;
    public static final int STRING=42;
    public static final int THEN=43;
    public static final int TRUE=44;
    public static final int WHILE=45;
    public static final int WRITE=46;
    public static final int WS=47;

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:8: ( func )+ EOF
            {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:8: ( func )+
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
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog170);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog173);  
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
            // 61:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:61:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:65:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:65:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:65:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func212); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func215); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func217);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func219);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func221); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,49,FOLLOW_49_in_params240);  
            stream_49.add(char_literal8);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params242);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,50,FOLLOW_50_in_params245);  
            stream_50.add(char_literal10);


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
            // 69:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:69:41: ( paramlist )?
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:73:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:73:10: ( param ( ',' ! param )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:73:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist271);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:73:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==51) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:73:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,51,FOLLOW_51_in_paramlist274); 

            	    pushFollow(FOLLOW_param_in_paramlist277);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,48,FOLLOW_48_in_param302);  
                    stream_48.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param306);  
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
                    // 78:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:78:26: ^( PREF[$id,$id.text] )
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:79:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param329);  
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
                    // 79:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:79:22: ^( PVALUE[$id,$id.text] )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:83:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:84:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:84:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions363);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:84:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==52) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:84:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,52,FOLLOW_52_in_block_instructions366);  
            	    stream_52.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions368);
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
            // 85:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:85:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:89:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:90:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL) ) {
                    alt6=1;
                }
                else if ( (LA6_1==49) ) {
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
            case 52:
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:90:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction417);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:91:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction439);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:92:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction459);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:93:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction479);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:94:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction500);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:95:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction517);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:96:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction542);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:98:9: 
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:1: assign : ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | ID eq= EQUAL '[' expr_list ']' -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) ) );
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
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | ID eq= EQUAL '[' expr_list ']' -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EQUAL) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==53) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==FALSE||LA7_2==ID||LA7_2==INT||LA7_2==MINUS||LA7_2==NOT||LA7_2==PLUS||LA7_2==TRUE||LA7_2==49) ) {
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:10: ID eq= EQUAL expr
                    {
                    ID25=(Token)match(input,ID,FOLLOW_ID_in_assign600);  
                    stream_ID.add(ID25);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign604);  
                    stream_EQUAL.add(eq);


                    pushFollow(FOLLOW_expr_in_assign606);
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
                    // 101:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:101:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:102:4: ID eq= EQUAL '[' expr_list ']'
                    {
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_assign622);  
                    stream_ID.add(ID27);


                    eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign626);  
                    stream_EQUAL.add(eq);


                    char_literal28=(Token)match(input,53,FOLLOW_53_in_assign628);  
                    stream_53.add(char_literal28);


                    pushFollow(FOLLOW_expr_list_in_assign630);
                    expr_list29=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list29.getTree());

                    char_literal30=(Token)match(input,54,FOLLOW_54_in_assign632);  
                    stream_54.add(char_literal30);


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
                    // 102:34: -> ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:102:37: ^( ASSIGN[$eq,\"[]=\"] ID ^( ARGLIST expr_list ) )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ASSIGN, eq, "[]=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:102:60: ^( ARGLIST expr_list )
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:106:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:106:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:106:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF31=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt666); 
            IF31_tree = 
            (AslTree)adaptor.create(IF31)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF31_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt669);
            expr32=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr32.getTree());

            THEN33=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt671); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt674);
            block_instructions34=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions34.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:106:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:106:47: ELSE ! block_instructions
                    {
                    ELSE35=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt677); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt680);
                    block_instructions36=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions36.getTree());

                    }
                    break;

            }


            ENDIF37=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt684); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:110:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:110:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:110:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt707); 
            WHILE38_tree = 
            (AslTree)adaptor.create(WHILE38)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE38_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt710);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            DO40=(Token)match(input,DO,FOLLOW_DO_in_while_stmt712); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt715);
            block_instructions41=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions41.getTree());

            ENDWHILE42=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt717); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:114:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN43=null;
        AslParser.expr_return expr44 =null;


        AslTree RETURN43_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:114:13: ( RETURN ^ ( expr )? )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:114:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN43=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt740); 
            RETURN43_tree = 
            (AslTree)adaptor.create(RETURN43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN43_tree, root_0);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:114:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==49) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:114:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt743);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:118:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ45=null;
        Token ID46=null;

        AslTree READ45_tree=null;
        AslTree ID46_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:118:6: ( READ ^ ID )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:118:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ45=(Token)match(input,READ,FOLLOW_READ_in_read762); 
            READ45_tree = 
            (AslTree)adaptor.create(READ45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ45_tree, root_0);


            ID46=(Token)match(input,ID,FOLLOW_ID_in_read765); 
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:1: write : WRITE ^ ( expr | STRING ) ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:7: ( WRITE ^ ( expr | STRING ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE47=(Token)match(input,WRITE,FOLLOW_WRITE_in_write785); 
            WRITE47_tree = 
            (AslTree)adaptor.create(WRITE47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE47_tree, root_0);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==49) ) {
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write789);
                    expr48=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr48.getTree());

                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:122:26: STRING
                    {
                    STRING49=(Token)match(input,STRING,FOLLOW_STRING_in_write793); 
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:126:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR51=null;
        AslParser.boolterm_return boolterm50 =null;

        AslParser.boolterm_return boolterm52 =null;


        AslTree OR51_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:126:9: ( boolterm ( OR ^ boolterm )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:126:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr818);
            boolterm50=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm50.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:126:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:126:23: OR ^ boolterm
            	    {
            	    OR51=(Token)match(input,OR,FOLLOW_OR_in_expr821); 
            	    OR51_tree = 
            	    (AslTree)adaptor.create(OR51)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR51_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr824);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:129:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND54=null;
        AslParser.boolfact_return boolfact53 =null;

        AslParser.boolfact_return boolfact55 =null;


        AslTree AND54_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:129:9: ( boolfact ( AND ^ boolfact )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:129:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm844);
            boolfact53=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact53.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:129:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:129:23: AND ^ boolfact
            	    {
            	    AND54=(Token)match(input,AND,FOLLOW_AND_in_boolterm847); 
            	    AND54_tree = 
            	    (AslTree)adaptor.create(AND54)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND54_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm850);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact870);
            num_expr56=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr56.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:24: EQUAL ^
                            {
                            EQUAL57=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact874); 
                            EQUAL57_tree = 
                            (AslTree)adaptor.create(EQUAL57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL57_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL58=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact879); 
                            NOT_EQUAL58_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL58_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:46: LT ^
                            {
                            LT59=(Token)match(input,LT,FOLLOW_LT_in_boolfact884); 
                            LT59_tree = 
                            (AslTree)adaptor.create(LT59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT59_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:52: LE ^
                            {
                            LE60=(Token)match(input,LE,FOLLOW_LE_in_boolfact889); 
                            LE60_tree = 
                            (AslTree)adaptor.create(LE60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE60_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:58: GT ^
                            {
                            GT61=(Token)match(input,GT,FOLLOW_GT_in_boolfact894); 
                            GT61_tree = 
                            (AslTree)adaptor.create(GT61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT61_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:132:64: GE ^
                            {
                            GE62=(Token)match(input,GE,FOLLOW_GE_in_boolfact899); 
                            GE62_tree = 
                            (AslTree)adaptor.create(GE62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE62_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact903);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr923);
            term64=term();

            state._fsp--;

            adaptor.addChild(root_0, term64.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:20: ( PLUS ^| MINUS ^)
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
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:21: PLUS ^
            	            {
            	            PLUS65=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr928); 
            	            PLUS65_tree = 
            	            (AslTree)adaptor.create(PLUS65)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS65_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:135:29: MINUS ^
            	            {
            	            MINUS66=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr933); 
            	            MINUS66_tree = 
            	            (AslTree)adaptor.create(MINUS66)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS66_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr937);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term961);
            factor68=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor68.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:23: MUL ^
            	            {
            	            MUL69=(Token)match(input,MUL,FOLLOW_MUL_in_term966); 
            	            MUL69_tree = 
            	            (AslTree)adaptor.create(MUL69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL69_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:30: DIV ^
            	            {
            	            DIV70=(Token)match(input,DIV,FOLLOW_DIV_in_term971); 
            	            DIV70_tree = 
            	            (AslTree)adaptor.create(DIV70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV70_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/sephirot47/CL/Asl/src/parser/Asl.g:138:37: MOD ^
            	            {
            	            MOD71=(Token)match(input,MOD,FOLLOW_MOD_in_term976); 
            	            MOD71_tree = 
            	            (AslTree)adaptor.create(MOD71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD71_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term980);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
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
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:14: NOT ^
                    {
                    NOT73=(Token)match(input,NOT,FOLLOW_NOT_in_factor1003); 
                    NOT73_tree = 
                    (AslTree)adaptor.create(NOT73)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT73_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:21: PLUS ^
                    {
                    PLUS74=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1008); 
                    PLUS74_tree = 
                    (AslTree)adaptor.create(PLUS74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS74_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:141:29: MINUS ^
                    {
                    MINUS75=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1013); 
                    MINUS75_tree = 
                    (AslTree)adaptor.create(MINUS75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS75_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1018);
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:148:1: atom : ( ID | INT | ( ID '[' expr ']' ) -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:148:9: ( ID | INT | ( ID '[' expr ']' ) -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr ) | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 53:
                    {
                    alt21=3;
                    }
                    break;
                case 49:
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
                case 50:
                case 51:
                case 52:
                case 54:
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
            case 49:
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:148:13: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID77=(Token)match(input,ID,FOLLOW_ID_in_atom1044); 
                    ID77_tree = 
                    (AslTree)adaptor.create(ID77)
                    ;
                    adaptor.addChild(root_0, ID77_tree);


                    }
                    break;
                case 2 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:149:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT78=(Token)match(input,INT,FOLLOW_INT_in_atom1059); 
                    INT78_tree = 
                    (AslTree)adaptor.create(INT78)
                    ;
                    adaptor.addChild(root_0, INT78_tree);


                    }
                    break;
                case 3 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:6: ( ID '[' expr ']' )
                    {
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:6: ( ID '[' expr ']' )
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:7: ID '[' expr ']'
                    {
                    ID79=(Token)match(input,ID,FOLLOW_ID_in_atom1067);  
                    stream_ID.add(ID79);


                    char_literal80=(Token)match(input,53,FOLLOW_53_in_atom1069);  
                    stream_53.add(char_literal80);


                    pushFollow(FOLLOW_expr_in_atom1071);
                    expr81=expr();

                    state._fsp--;

                    stream_expr.add(expr81.getTree());

                    char_literal82=(Token)match(input,54,FOLLOW_54_in_atom1073);  
                    stream_54.add(char_literal82);


                    }


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 150:24: -> ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:150:27: ^( ARR_ACCESS[$ID,\"ARR_ACCESS\"] ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(ARR_ACCESS, ID79, "ARR_ACCESS")
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:13: (b= TRUE |b= FALSE )
                    {
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:13: (b= TRUE |b= FALSE )
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
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1103);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1109);  
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
                    // 151:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/sephirot47/CL/Asl/src/parser/Asl.g:151:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:152:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1132);
                    funcall83=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall83.getTree());

                    }
                    break;
                case 6 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:153:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal84=(Token)match(input,49,FOLLOW_49_in_atom1146); 

                    pushFollow(FOLLOW_expr_in_atom1149);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());

                    char_literal86=(Token)match(input,50,FOLLOW_50_in_atom1151); 

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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:13: ID '(' ( expr_list )? ')'
            {
            ID87=(Token)match(input,ID,FOLLOW_ID_in_funcall1172);  
            stream_ID.add(ID87);


            char_literal88=(Token)match(input,49,FOLLOW_49_in_funcall1174);  
            stream_49.add(char_literal88);


            // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1176);
                    expr_list89=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list89.getTree());

                    }
                    break;

            }


            char_literal90=(Token)match(input,50,FOLLOW_50_in_funcall1179);  
            stream_50.add(char_literal90);


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
            // 157:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/sephirot47/CL/Asl/src/parser/Asl.g:157:61: ( expr_list )?
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
    // /home/sephirot47/CL/Asl/src/parser/Asl.g:161:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal92=null;
        AslParser.expr_return expr91 =null;

        AslParser.expr_return expr93 =null;


        AslTree char_literal92_tree=null;

        try {
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:161:10: ( expr ( ',' ! expr )* )
            // /home/sephirot47/CL/Asl/src/parser/Asl.g:161:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1212);
            expr91=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr91.getTree());

            // /home/sephirot47/CL/Asl/src/parser/Asl.g:161:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==51) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/sephirot47/CL/Asl/src/parser/Asl.g:161:19: ',' ! expr
            	    {
            	    char_literal92=(Token)match(input,51,FOLLOW_51_in_expr_list1215); 

            	    pushFollow(FOLLOW_expr_in_expr_list1218);
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


 

    public static final BitSet FOLLOW_func_in_prog170 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_prog173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func212 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_func215 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_params_in_func217 = new BitSet(new long[]{0x0010630001800000L});
    public static final BitSet FOLLOW_block_instructions_in_func219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_params240 = new BitSet(new long[]{0x0005000000800000L});
    public static final BitSet FOLLOW_paramlist_in_params242 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_params245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist271 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_paramlist274 = new BitSet(new long[]{0x0001000000800000L});
    public static final BitSet FOLLOW_param_in_paramlist277 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_48_in_param302 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_param306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions363 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_block_instructions366 = new BitSet(new long[]{0x0010630001800000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions368 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign600 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign604 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_assign606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign622 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_assign626 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assign628 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_list_in_assign630 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_assign632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt666 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt669 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt671 = new BitSet(new long[]{0x0010630001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt674 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt677 = new BitSet(new long[]{0x0010630001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt680 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt707 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_while_stmt710 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DO_in_while_stmt712 = new BitSet(new long[]{0x0010630001800000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt715 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt740 = new BitSet(new long[]{0x0002102242840002L});
    public static final BitSet FOLLOW_expr_in_return_stmt743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read762 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_read765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write785 = new BitSet(new long[]{0x0002142242840000L});
    public static final BitSet FOLLOW_expr_in_write789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr818 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_OR_in_expr821 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_boolterm_in_expr824 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm844 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm847 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm850 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact870 = new BitSet(new long[]{0x0000000424610002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact874 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact879 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_LT_in_boolfact884 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_LE_in_boolfact889 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_GT_in_boolfact894 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_GE_in_boolfact899 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr923 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr928 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr933 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_term_in_num_expr937 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_factor_in_term961 = new BitSet(new long[]{0x0000000180000402L});
    public static final BitSet FOLLOW_MUL_in_term966 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_DIV_in_term971 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_MOD_in_term976 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_factor_in_term980 = new BitSet(new long[]{0x0000000180000402L});
    public static final BitSet FOLLOW_NOT_in_factor1003 = new BitSet(new long[]{0x0002100002840000L});
    public static final BitSet FOLLOW_PLUS_in_factor1008 = new BitSet(new long[]{0x0002100002840000L});
    public static final BitSet FOLLOW_MINUS_in_factor1013 = new BitSet(new long[]{0x0002100002840000L});
    public static final BitSet FOLLOW_atom_in_factor1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1067 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_atom1069 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_atom1071 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_atom1146 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_atom1149 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_atom1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1172 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcall1174 = new BitSet(new long[]{0x0006102242840000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1176 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_funcall1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1212 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_expr_list1215 = new BitSet(new long[]{0x0002102242840000L});
    public static final BitSet FOLLOW_expr_in_expr_list1218 = new BitSet(new long[]{0x0008000000000002L});

}