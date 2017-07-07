package org.gemoc.activitydiagram.sequential.xactivitydiagram.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.services.ActivityDiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityDiagramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'activity'", "'{'", "','", "'events'", "'}'", "'nodes'", "'edges'", "'action'", "'comp'", "'in'", "'('", "')'", "'out'", "'accept'", "'type'", "'initial'", "'final'", "'fork'", "'join'", "'merge'", "'decision'", "'='", "'int'", "'bool'", "'true'", "'false'", "'-'", "'flow'", "'from'", "'to'", "'['", "']'", "'+'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!'", "'&'", "'|'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalActivityDiagramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityDiagramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityDiagramParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityDiagram.g"; }



     	private ActivityDiagramGrammarAccess grammarAccess;

        public InternalActivityDiagramParser(TokenStream input, ActivityDiagramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Activity";
       	}

       	@Override
       	protected ActivityDiagramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleActivity"
    // InternalActivityDiagram.g:65:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalActivityDiagram.g:65:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalActivityDiagram.g:66:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalActivityDiagram.g:72:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )? (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )? (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_locals_4_0 = null;

        EObject lv_locals_6_0 = null;

        EObject lv_events_9_0 = null;

        EObject lv_events_11_0 = null;

        EObject lv_nodes_15_0 = null;

        EObject lv_nodes_17_0 = null;

        EObject lv_edges_21_0 = null;

        EObject lv_edges_23_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:78:2: ( ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )? (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )? (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalActivityDiagram.g:79:2: ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )? (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )? (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalActivityDiagram.g:79:2: ( () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )? (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )? (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalActivityDiagram.g:80:3: () otherlv_1= 'activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )? (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )? (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )? (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalActivityDiagram.g:80:3: ()
            // InternalActivityDiagram.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
            		
            // InternalActivityDiagram.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:92:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalActivityDiagram.g:114:3: ( ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=33 && LA2_0<=34)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalActivityDiagram.g:115:4: ( (lv_locals_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )*
                    {
                    // InternalActivityDiagram.g:115:4: ( (lv_locals_4_0= ruleVariable ) )
                    // InternalActivityDiagram.g:116:5: (lv_locals_4_0= ruleVariable )
                    {
                    // InternalActivityDiagram.g:116:5: (lv_locals_4_0= ruleVariable )
                    // InternalActivityDiagram.g:117:6: lv_locals_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_locals_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"locals",
                    							lv_locals_4_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagram.g:134:4: (otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:135:5: otherlv_5= ',' ( (lv_locals_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalActivityDiagram.g:139:5: ( (lv_locals_6_0= ruleVariable ) )
                    	    // InternalActivityDiagram.g:140:6: (lv_locals_6_0= ruleVariable )
                    	    {
                    	    // InternalActivityDiagram.g:140:6: (lv_locals_6_0= ruleVariable )
                    	    // InternalActivityDiagram.g:141:7: lv_locals_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getLocalsVariableParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_locals_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"locals",
                    	    								lv_locals_6_0,
                    	    								"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalActivityDiagram.g:160:3: (otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityDiagram.g:161:4: otherlv_7= 'events' otherlv_8= '{' ( (lv_events_9_0= ruleEvent ) ) (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getEventsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalActivityDiagram.g:169:4: ( (lv_events_9_0= ruleEvent ) )
                    // InternalActivityDiagram.g:170:5: (lv_events_9_0= ruleEvent )
                    {
                    // InternalActivityDiagram.g:170:5: (lv_events_9_0= ruleEvent )
                    // InternalActivityDiagram.g:171:6: lv_events_9_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getEventsEventParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_events_9_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_9_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagram.g:188:4: (otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:189:5: otherlv_10= ',' ( (lv_events_11_0= ruleEvent ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:193:5: ( (lv_events_11_0= ruleEvent ) )
                    	    // InternalActivityDiagram.g:194:6: (lv_events_11_0= ruleEvent )
                    	    {
                    	    // InternalActivityDiagram.g:194:6: (lv_events_11_0= ruleEvent )
                    	    // InternalActivityDiagram.g:195:7: lv_events_11_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getEventsEventParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_events_11_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_11_0,
                    	    								"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:218:3: (otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalActivityDiagram.g:219:4: otherlv_13= 'nodes' otherlv_14= '{' ( (lv_nodes_15_0= ruleActivityNode ) ) (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getNodesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalActivityDiagram.g:227:4: ( (lv_nodes_15_0= ruleActivityNode ) )
                    // InternalActivityDiagram.g:228:5: (lv_nodes_15_0= ruleActivityNode )
                    {
                    // InternalActivityDiagram.g:228:5: (lv_nodes_15_0= ruleActivityNode )
                    // InternalActivityDiagram.g:229:6: lv_nodes_15_0= ruleActivityNode
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_nodes_15_0=ruleActivityNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_15_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.ActivityNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagram.g:246:4: (otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:247:5: otherlv_16= ',' ( (lv_nodes_17_0= ruleActivityNode ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getActivityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:251:5: ( (lv_nodes_17_0= ruleActivityNode ) )
                    	    // InternalActivityDiagram.g:252:6: (lv_nodes_17_0= ruleActivityNode )
                    	    {
                    	    // InternalActivityDiagram.g:252:6: (lv_nodes_17_0= ruleActivityNode )
                    	    // InternalActivityDiagram.g:253:7: lv_nodes_17_0= ruleActivityNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getNodesActivityNodeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_nodes_17_0=ruleActivityNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_17_0,
                    	    								"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.ActivityNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_18, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:276:3: (otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalActivityDiagram.g:277:4: otherlv_19= 'edges' otherlv_20= '{' ( (lv_edges_21_0= ruleActivityEdge ) ) (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getEdgesKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalActivityDiagram.g:285:4: ( (lv_edges_21_0= ruleActivityEdge ) )
                    // InternalActivityDiagram.g:286:5: (lv_edges_21_0= ruleActivityEdge )
                    {
                    // InternalActivityDiagram.g:286:5: (lv_edges_21_0= ruleActivityEdge )
                    // InternalActivityDiagram.g:287:6: lv_edges_21_0= ruleActivityEdge
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_edges_21_0=ruleActivityEdge();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"edges",
                    							lv_edges_21_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.ActivityEdge");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagram.g:304:4: (otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:305:5: otherlv_22= ',' ( (lv_edges_23_0= ruleActivityEdge ) )
                    	    {
                    	    otherlv_22=(Token)match(input,13,FOLLOW_12); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getActivityAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:309:5: ( (lv_edges_23_0= ruleActivityEdge ) )
                    	    // InternalActivityDiagram.g:310:6: (lv_edges_23_0= ruleActivityEdge )
                    	    {
                    	    // InternalActivityDiagram.g:310:6: (lv_edges_23_0= ruleActivityEdge )
                    	    // InternalActivityDiagram.g:311:7: lv_edges_23_0= ruleActivityEdge
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getEdgesActivityEdgeParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_edges_23_0=ruleActivityEdge();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"edges",
                    	    								lv_edges_23_0,
                    	    								"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.ActivityEdge");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_24, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEvent"
    // InternalActivityDiagram.g:342:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalActivityDiagram.g:342:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalActivityDiagram.g:343:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalActivityDiagram.g:349:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:355:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalActivityDiagram.g:356:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalActivityDiagram.g:356:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalActivityDiagram.g:357:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalActivityDiagram.g:357:3: ()
            // InternalActivityDiagram.g:358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalActivityDiagram.g:364:3: ( (lv_name_1_0= ruleEString ) )
            // InternalActivityDiagram.g:365:4: (lv_name_1_0= ruleEString )
            {
            // InternalActivityDiagram.g:365:4: (lv_name_1_0= ruleEString )
            // InternalActivityDiagram.g:366:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityDiagram.g:387:1: entryRuleActivityNode returns [EObject current=null] : iv_ruleActivityNode= ruleActivityNode EOF ;
    public final EObject entryRuleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityNode = null;


        try {
            // InternalActivityDiagram.g:387:53: (iv_ruleActivityNode= ruleActivityNode EOF )
            // InternalActivityDiagram.g:388:2: iv_ruleActivityNode= ruleActivityNode EOF
            {
             newCompositeNode(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityNode=ruleActivityNode();

            state._fsp--;

             current =iv_ruleActivityNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityDiagram.g:394:1: ruleActivityNode returns [EObject current=null] : (this_OpaqueAction_0= ruleOpaqueAction | this_AcceptEventAction_1= ruleAcceptEventAction | this_InitialNode_2= ruleInitialNode | this_ActivityFinalNode_3= ruleActivityFinalNode | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_MergeNode_6= ruleMergeNode | this_DecisionNode_7= ruleDecisionNode ) ;
    public final EObject ruleActivityNode() throws RecognitionException {
        EObject current = null;

        EObject this_OpaqueAction_0 = null;

        EObject this_AcceptEventAction_1 = null;

        EObject this_InitialNode_2 = null;

        EObject this_ActivityFinalNode_3 = null;

        EObject this_ForkNode_4 = null;

        EObject this_JoinNode_5 = null;

        EObject this_MergeNode_6 = null;

        EObject this_DecisionNode_7 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:400:2: ( (this_OpaqueAction_0= ruleOpaqueAction | this_AcceptEventAction_1= ruleAcceptEventAction | this_InitialNode_2= ruleInitialNode | this_ActivityFinalNode_3= ruleActivityFinalNode | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_MergeNode_6= ruleMergeNode | this_DecisionNode_7= ruleDecisionNode ) )
            // InternalActivityDiagram.g:401:2: (this_OpaqueAction_0= ruleOpaqueAction | this_AcceptEventAction_1= ruleAcceptEventAction | this_InitialNode_2= ruleInitialNode | this_ActivityFinalNode_3= ruleActivityFinalNode | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_MergeNode_6= ruleMergeNode | this_DecisionNode_7= ruleDecisionNode )
            {
            // InternalActivityDiagram.g:401:2: (this_OpaqueAction_0= ruleOpaqueAction | this_AcceptEventAction_1= ruleAcceptEventAction | this_InitialNode_2= ruleInitialNode | this_ActivityFinalNode_3= ruleActivityFinalNode | this_ForkNode_4= ruleForkNode | this_JoinNode_5= ruleJoinNode | this_MergeNode_6= ruleMergeNode | this_DecisionNode_7= ruleDecisionNode )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 29:
                {
                alt9=6;
                }
                break;
            case 30:
                {
                alt9=7;
                }
                break;
            case 31:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalActivityDiagram.g:402:3: this_OpaqueAction_0= ruleOpaqueAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getOpaqueActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OpaqueAction_0=ruleOpaqueAction();

                    state._fsp--;


                    			current = this_OpaqueAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:411:3: this_AcceptEventAction_1= ruleAcceptEventAction
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getAcceptEventActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptEventAction_1=ruleAcceptEventAction();

                    state._fsp--;


                    			current = this_AcceptEventAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:420:3: this_InitialNode_2= ruleInitialNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getInitialNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialNode_2=ruleInitialNode();

                    state._fsp--;


                    			current = this_InitialNode_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:429:3: this_ActivityFinalNode_3= ruleActivityFinalNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getActivityFinalNodeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActivityFinalNode_3=ruleActivityFinalNode();

                    state._fsp--;


                    			current = this_ActivityFinalNode_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalActivityDiagram.g:438:3: this_ForkNode_4= ruleForkNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getForkNodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForkNode_4=ruleForkNode();

                    state._fsp--;


                    			current = this_ForkNode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalActivityDiagram.g:447:3: this_JoinNode_5= ruleJoinNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getJoinNodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_JoinNode_5=ruleJoinNode();

                    state._fsp--;


                    			current = this_JoinNode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalActivityDiagram.g:456:3: this_MergeNode_6= ruleMergeNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getMergeNodeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MergeNode_6=ruleMergeNode();

                    state._fsp--;


                    			current = this_MergeNode_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalActivityDiagram.g:465:3: this_DecisionNode_7= ruleDecisionNode
                    {

                    			newCompositeNode(grammarAccess.getActivityNodeAccess().getDecisionNodeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecisionNode_7=ruleDecisionNode();

                    state._fsp--;


                    			current = this_DecisionNode_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleActivityEdge"
    // InternalActivityDiagram.g:477:1: entryRuleActivityEdge returns [EObject current=null] : iv_ruleActivityEdge= ruleActivityEdge EOF ;
    public final EObject entryRuleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityEdge = null;


        try {
            // InternalActivityDiagram.g:477:53: (iv_ruleActivityEdge= ruleActivityEdge EOF )
            // InternalActivityDiagram.g:478:2: iv_ruleActivityEdge= ruleActivityEdge EOF
            {
             newCompositeNode(grammarAccess.getActivityEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityEdge=ruleActivityEdge();

            state._fsp--;

             current =iv_ruleActivityEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityEdge"


    // $ANTLR start "ruleActivityEdge"
    // InternalActivityDiagram.g:484:1: ruleActivityEdge returns [EObject current=null] : this_ControlFlow_0= ruleControlFlow ;
    public final EObject ruleActivityEdge() throws RecognitionException {
        EObject current = null;

        EObject this_ControlFlow_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:490:2: (this_ControlFlow_0= ruleControlFlow )
            // InternalActivityDiagram.g:491:2: this_ControlFlow_0= ruleControlFlow
            {

            		newCompositeNode(grammarAccess.getActivityEdgeAccess().getControlFlowParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ControlFlow_0=ruleControlFlow();

            state._fsp--;


            		current = this_ControlFlow_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityEdge"


    // $ANTLR start "entryRuleVariable"
    // InternalActivityDiagram.g:502:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalActivityDiagram.g:502:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalActivityDiagram.g:503:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalActivityDiagram.g:509:1: ruleVariable returns [EObject current=null] : (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariable_0 = null;

        EObject this_BooleanVariable_1 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:515:2: ( (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable ) )
            // InternalActivityDiagram.g:516:2: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            {
            // InternalActivityDiagram.g:516:2: (this_IntegerVariable_0= ruleIntegerVariable | this_BooleanVariable_1= ruleBooleanVariable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            else if ( (LA10_0==34) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityDiagram.g:517:3: this_IntegerVariable_0= ruleIntegerVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerVariable_0=ruleIntegerVariable();

                    state._fsp--;


                    			current = this_IntegerVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:526:3: this_BooleanVariable_1= ruleBooleanVariable
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getBooleanVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVariable_1=ruleBooleanVariable();

                    state._fsp--;


                    			current = this_BooleanVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEString"
    // InternalActivityDiagram.g:538:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalActivityDiagram.g:538:47: (iv_ruleEString= ruleEString EOF )
            // InternalActivityDiagram.g:539:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalActivityDiagram.g:545:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:551:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalActivityDiagram.g:552:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalActivityDiagram.g:552:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalActivityDiagram.g:553:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:561:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleOpaqueAction"
    // InternalActivityDiagram.g:572:1: entryRuleOpaqueAction returns [EObject current=null] : iv_ruleOpaqueAction= ruleOpaqueAction EOF ;
    public final EObject entryRuleOpaqueAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpaqueAction = null;


        try {
            // InternalActivityDiagram.g:572:53: (iv_ruleOpaqueAction= ruleOpaqueAction EOF )
            // InternalActivityDiagram.g:573:2: iv_ruleOpaqueAction= ruleOpaqueAction EOF
            {
             newCompositeNode(grammarAccess.getOpaqueActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpaqueAction=ruleOpaqueAction();

            state._fsp--;

             current =iv_ruleOpaqueAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpaqueAction"


    // $ANTLR start "ruleOpaqueAction"
    // InternalActivityDiagram.g:579:1: ruleOpaqueAction returns [EObject current=null] : ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )? ) ;
    public final EObject ruleOpaqueAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_assignments_5_0 = null;

        EObject lv_assignments_7_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:585:2: ( ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )? ) )
            // InternalActivityDiagram.g:586:2: ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )? )
            {
            // InternalActivityDiagram.g:586:2: ( () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )? )
            // InternalActivityDiagram.g:587:3: () otherlv_1= 'action' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )? (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )? (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )?
            {
            // InternalActivityDiagram.g:587:3: ()
            // InternalActivityDiagram.g:588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOpaqueActionAccess().getOpaqueActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOpaqueActionAccess().getActionKeyword_1());
            		
            // InternalActivityDiagram.g:598:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:599:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:599:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:600:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpaqueActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:617:3: (otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityDiagram.g:618:4: otherlv_3= 'comp' otherlv_4= '{' ( (lv_assignments_5_0= ruleVariableAssignment ) ) (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOpaqueActionAccess().getCompKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getOpaqueActionAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalActivityDiagram.g:626:4: ( (lv_assignments_5_0= ruleVariableAssignment ) )
                    // InternalActivityDiagram.g:627:5: (lv_assignments_5_0= ruleVariableAssignment )
                    {
                    // InternalActivityDiagram.g:627:5: (lv_assignments_5_0= ruleVariableAssignment )
                    // InternalActivityDiagram.g:628:6: lv_assignments_5_0= ruleVariableAssignment
                    {

                    						newCompositeNode(grammarAccess.getOpaqueActionAccess().getAssignmentsVariableAssignmentParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_assignments_5_0=ruleVariableAssignment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                    						}
                    						add(
                    							current,
                    							"assignments",
                    							lv_assignments_5_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.VariableAssignment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalActivityDiagram.g:645:4: (otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:646:5: otherlv_6= ',' ( (lv_assignments_7_0= ruleVariableAssignment ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getOpaqueActionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:650:5: ( (lv_assignments_7_0= ruleVariableAssignment ) )
                    	    // InternalActivityDiagram.g:651:6: (lv_assignments_7_0= ruleVariableAssignment )
                    	    {
                    	    // InternalActivityDiagram.g:651:6: (lv_assignments_7_0= ruleVariableAssignment )
                    	    // InternalActivityDiagram.g:652:7: lv_assignments_7_0= ruleVariableAssignment
                    	    {

                    	    							newCompositeNode(grammarAccess.getOpaqueActionAccess().getAssignmentsVariableAssignmentParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_assignments_7_0=ruleVariableAssignment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOpaqueActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"assignments",
                    	    								lv_assignments_7_0,
                    	    								"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.VariableAssignment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getOpaqueActionAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:675:3: (otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalActivityDiagram.g:676:4: otherlv_9= 'in' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getOpaqueActionAccess().getInKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagram.g:684:4: ( (otherlv_11= RULE_ID ) )
                    // InternalActivityDiagram.g:685:5: (otherlv_11= RULE_ID )
                    {
                    // InternalActivityDiagram.g:685:5: (otherlv_11= RULE_ID )
                    // InternalActivityDiagram.g:686:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpaqueActionRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_11, grammarAccess.getOpaqueActionAccess().getIncomingActivityEdgeCrossReference_4_2_0());
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:702:3: (otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityDiagram.g:703:4: otherlv_13= 'out' otherlv_14= '(' ( (otherlv_15= RULE_ID ) ) otherlv_16= ')'
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getOpaqueActionAccess().getOutKeyword_5_0());
                    			
                    otherlv_14=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getOpaqueActionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalActivityDiagram.g:711:4: ( (otherlv_15= RULE_ID ) )
                    // InternalActivityDiagram.g:712:5: (otherlv_15= RULE_ID )
                    {
                    // InternalActivityDiagram.g:712:5: (otherlv_15= RULE_ID )
                    // InternalActivityDiagram.g:713:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpaqueActionRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_15, grammarAccess.getOpaqueActionAccess().getOutgoingActivityEdgeCrossReference_5_2_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getOpaqueActionAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpaqueAction"


    // $ANTLR start "entryRuleAcceptEventAction"
    // InternalActivityDiagram.g:733:1: entryRuleAcceptEventAction returns [EObject current=null] : iv_ruleAcceptEventAction= ruleAcceptEventAction EOF ;
    public final EObject entryRuleAcceptEventAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptEventAction = null;


        try {
            // InternalActivityDiagram.g:733:58: (iv_ruleAcceptEventAction= ruleAcceptEventAction EOF )
            // InternalActivityDiagram.g:734:2: iv_ruleAcceptEventAction= ruleAcceptEventAction EOF
            {
             newCompositeNode(grammarAccess.getAcceptEventActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptEventAction=ruleAcceptEventAction();

            state._fsp--;

             current =iv_ruleAcceptEventAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptEventAction"


    // $ANTLR start "ruleAcceptEventAction"
    // InternalActivityDiagram.g:740:1: ruleAcceptEventAction returns [EObject current=null] : ( () otherlv_1= 'accept' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )? (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )? ) ;
    public final EObject ruleAcceptEventAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:746:2: ( ( () otherlv_1= 'accept' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )? (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )? ) )
            // InternalActivityDiagram.g:747:2: ( () otherlv_1= 'accept' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )? (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )? )
            {
            // InternalActivityDiagram.g:747:2: ( () otherlv_1= 'accept' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )? (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )? )
            // InternalActivityDiagram.g:748:3: () otherlv_1= 'accept' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )? (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )?
            {
            // InternalActivityDiagram.g:748:3: ()
            // InternalActivityDiagram.g:749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptEventActionAccess().getAcceptEventActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptEventActionAccess().getAcceptKeyword_1());
            		
            // InternalActivityDiagram.g:759:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:760:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:760:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:761:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAcceptEventActionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAcceptEventActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAcceptEventActionAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAcceptEventActionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalActivityDiagram.g:786:3: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:787:4: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:787:4: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:788:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAcceptEventActionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_5, grammarAccess.getAcceptEventActionAccess().getEventTypeEventCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAcceptEventActionAccess().getRightParenthesisKeyword_6());
            		
            // InternalActivityDiagram.g:803:3: (otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalActivityDiagram.g:804:4: otherlv_7= 'in' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getAcceptEventActionAccess().getInKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getAcceptEventActionAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalActivityDiagram.g:812:4: ( (otherlv_9= RULE_ID ) )
                    // InternalActivityDiagram.g:813:5: (otherlv_9= RULE_ID )
                    {
                    // InternalActivityDiagram.g:813:5: (otherlv_9= RULE_ID )
                    // InternalActivityDiagram.g:814:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_9, grammarAccess.getAcceptEventActionAccess().getIncomingActivityEdgeCrossReference_7_2_0());
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getAcceptEventActionAccess().getRightParenthesisKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:830:3: (otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalActivityDiagram.g:831:4: otherlv_11= 'out' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getAcceptEventActionAccess().getOutKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getAcceptEventActionAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalActivityDiagram.g:839:4: ( (otherlv_13= RULE_ID ) )
                    // InternalActivityDiagram.g:840:5: (otherlv_13= RULE_ID )
                    {
                    // InternalActivityDiagram.g:840:5: (otherlv_13= RULE_ID )
                    // InternalActivityDiagram.g:841:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAcceptEventActionRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_13, grammarAccess.getAcceptEventActionAccess().getOutgoingActivityEdgeCrossReference_8_2_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getAcceptEventActionAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptEventAction"


    // $ANTLR start "entryRuleInitialNode"
    // InternalActivityDiagram.g:861:1: entryRuleInitialNode returns [EObject current=null] : iv_ruleInitialNode= ruleInitialNode EOF ;
    public final EObject entryRuleInitialNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialNode = null;


        try {
            // InternalActivityDiagram.g:861:52: (iv_ruleInitialNode= ruleInitialNode EOF )
            // InternalActivityDiagram.g:862:2: iv_ruleInitialNode= ruleInitialNode EOF
            {
             newCompositeNode(grammarAccess.getInitialNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialNode=ruleInitialNode();

            state._fsp--;

             current =iv_ruleInitialNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialNode"


    // $ANTLR start "ruleInitialNode"
    // InternalActivityDiagram.g:868:1: ruleInitialNode returns [EObject current=null] : ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleInitialNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:874:2: ( ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) )
            // InternalActivityDiagram.g:875:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            {
            // InternalActivityDiagram.g:875:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalActivityDiagram.g:876:3: () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalActivityDiagram.g:876:3: ()
            // InternalActivityDiagram.g:877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialNodeAccess().getInitialNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialNodeAccess().getInitialKeyword_1());
            		
            // InternalActivityDiagram.g:887:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:888:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:888:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:889:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:906:3: (otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:907:4: otherlv_3= 'out' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getInitialNodeAccess().getOutKeyword_3_0());
            			
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getInitialNodeAccess().getLeftParenthesisKeyword_3_1());
            			
            // InternalActivityDiagram.g:915:4: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:916:5: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:916:5: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:917:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getInitialNodeRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getInitialNodeAccess().getOutgoingActivityEdgeCrossReference_3_2_0());
            					

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getInitialNodeAccess().getRightParenthesisKeyword_3_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialNode"


    // $ANTLR start "entryRuleActivityFinalNode"
    // InternalActivityDiagram.g:937:1: entryRuleActivityFinalNode returns [EObject current=null] : iv_ruleActivityFinalNode= ruleActivityFinalNode EOF ;
    public final EObject entryRuleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityFinalNode = null;


        try {
            // InternalActivityDiagram.g:937:58: (iv_ruleActivityFinalNode= ruleActivityFinalNode EOF )
            // InternalActivityDiagram.g:938:2: iv_ruleActivityFinalNode= ruleActivityFinalNode EOF
            {
             newCompositeNode(grammarAccess.getActivityFinalNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivityFinalNode=ruleActivityFinalNode();

            state._fsp--;

             current =iv_ruleActivityFinalNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivityFinalNode"


    // $ANTLR start "ruleActivityFinalNode"
    // InternalActivityDiagram.g:944:1: ruleActivityFinalNode returns [EObject current=null] : ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleActivityFinalNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:950:2: ( ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ) )
            // InternalActivityDiagram.g:951:2: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            {
            // InternalActivityDiagram.g:951:2: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalActivityDiagram.g:952:3: () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalActivityDiagram.g:952:3: ()
            // InternalActivityDiagram.g:953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityFinalNodeAccess().getActivityFinalNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityFinalNodeAccess().getFinalKeyword_1());
            		
            // InternalActivityDiagram.g:963:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:964:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:964:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:965:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityFinalNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityFinalNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:982:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:983:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getActivityFinalNodeAccess().getInKeyword_3_0());
            			
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getActivityFinalNodeAccess().getLeftParenthesisKeyword_3_1());
            			
            // InternalActivityDiagram.g:991:4: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:992:5: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:992:5: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:993:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getActivityFinalNodeRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getActivityFinalNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
            					

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_6, grammarAccess.getActivityFinalNodeAccess().getRightParenthesisKeyword_3_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivityFinalNode"


    // $ANTLR start "entryRuleForkNode"
    // InternalActivityDiagram.g:1013:1: entryRuleForkNode returns [EObject current=null] : iv_ruleForkNode= ruleForkNode EOF ;
    public final EObject entryRuleForkNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForkNode = null;


        try {
            // InternalActivityDiagram.g:1013:49: (iv_ruleForkNode= ruleForkNode EOF )
            // InternalActivityDiagram.g:1014:2: iv_ruleForkNode= ruleForkNode EOF
            {
             newCompositeNode(grammarAccess.getForkNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForkNode=ruleForkNode();

            state._fsp--;

             current =iv_ruleForkNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForkNode"


    // $ANTLR start "ruleForkNode"
    // InternalActivityDiagram.g:1020:1: ruleForkNode returns [EObject current=null] : ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleForkNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1026:2: ( ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalActivityDiagram.g:1027:2: ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalActivityDiagram.g:1027:2: ( () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalActivityDiagram.g:1028:3: () otherlv_1= 'fork' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalActivityDiagram.g:1028:3: ()
            // InternalActivityDiagram.g:1029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForkNodeAccess().getForkNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getForkNodeAccess().getForkKeyword_1());
            		
            // InternalActivityDiagram.g:1039:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1040:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1040:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1041:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForkNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForkNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1058:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:1059:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getForkNodeAccess().getInKeyword_3_0());
            			
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_3_1());
            			
            // InternalActivityDiagram.g:1067:4: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:1068:5: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:1068:5: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:1069:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getForkNodeRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getForkNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
            					

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_19); 

            				newLeafNode(otherlv_6, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_3_3());
            			

            }

            // InternalActivityDiagram.g:1085:3: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalActivityDiagram.g:1086:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getForkNodeAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getForkNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagram.g:1094:4: ( (otherlv_9= RULE_ID ) )
                    // InternalActivityDiagram.g:1095:5: (otherlv_9= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1095:5: (otherlv_9= RULE_ID )
                    // InternalActivityDiagram.g:1096:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForkNodeRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_9, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalActivityDiagram.g:1107:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1108:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getForkNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:1112:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1113:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1113:6: (otherlv_11= RULE_ID )
                    	    // InternalActivityDiagram.g:1114:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getForkNodeRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getForkNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getForkNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForkNode"


    // $ANTLR start "entryRuleJoinNode"
    // InternalActivityDiagram.g:1135:1: entryRuleJoinNode returns [EObject current=null] : iv_ruleJoinNode= ruleJoinNode EOF ;
    public final EObject entryRuleJoinNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinNode = null;


        try {
            // InternalActivityDiagram.g:1135:49: (iv_ruleJoinNode= ruleJoinNode EOF )
            // InternalActivityDiagram.g:1136:2: iv_ruleJoinNode= ruleJoinNode EOF
            {
             newCompositeNode(grammarAccess.getJoinNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoinNode=ruleJoinNode();

            state._fsp--;

             current =iv_ruleJoinNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinNode"


    // $ANTLR start "ruleJoinNode"
    // InternalActivityDiagram.g:1142:1: ruleJoinNode returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleJoinNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1148:2: ( ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalActivityDiagram.g:1149:2: ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalActivityDiagram.g:1149:2: ( () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalActivityDiagram.g:1150:3: () otherlv_1= 'join' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalActivityDiagram.g:1150:3: ()
            // InternalActivityDiagram.g:1151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinNodeAccess().getJoinNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinNodeAccess().getJoinKeyword_1());
            		
            // InternalActivityDiagram.g:1161:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1162:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1162:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1163:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1180:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalActivityDiagram.g:1181:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getJoinNodeAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalActivityDiagram.g:1189:4: ( (otherlv_5= RULE_ID ) )
                    // InternalActivityDiagram.g:1190:5: (otherlv_5= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1190:5: (otherlv_5= RULE_ID )
                    // InternalActivityDiagram.g:1191:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinNodeRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_5, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalActivityDiagram.g:1202:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==13) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1203:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getJoinNodeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:1207:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1208:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1208:6: (otherlv_7= RULE_ID )
                    	    // InternalActivityDiagram.g:1209:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJoinNodeRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getJoinNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:1226:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalActivityDiagram.g:1227:4: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_9, grammarAccess.getJoinNodeAccess().getOutKeyword_4_0());
            			
            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_10, grammarAccess.getJoinNodeAccess().getLeftParenthesisKeyword_4_1());
            			
            // InternalActivityDiagram.g:1235:4: ( (otherlv_11= RULE_ID ) )
            // InternalActivityDiagram.g:1236:5: (otherlv_11= RULE_ID )
            {
            // InternalActivityDiagram.g:1236:5: (otherlv_11= RULE_ID )
            // InternalActivityDiagram.g:1237:6: otherlv_11= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getJoinNodeRule());
            						}
            					
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_11, grammarAccess.getJoinNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
            					

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_12, grammarAccess.getJoinNodeAccess().getRightParenthesisKeyword_4_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinNode"


    // $ANTLR start "entryRuleMergeNode"
    // InternalActivityDiagram.g:1257:1: entryRuleMergeNode returns [EObject current=null] : iv_ruleMergeNode= ruleMergeNode EOF ;
    public final EObject entryRuleMergeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMergeNode = null;


        try {
            // InternalActivityDiagram.g:1257:50: (iv_ruleMergeNode= ruleMergeNode EOF )
            // InternalActivityDiagram.g:1258:2: iv_ruleMergeNode= ruleMergeNode EOF
            {
             newCompositeNode(grammarAccess.getMergeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMergeNode=ruleMergeNode();

            state._fsp--;

             current =iv_ruleMergeNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMergeNode"


    // $ANTLR start "ruleMergeNode"
    // InternalActivityDiagram.g:1264:1: ruleMergeNode returns [EObject current=null] : ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleMergeNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1270:2: ( ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) ) )
            // InternalActivityDiagram.g:1271:2: ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            {
            // InternalActivityDiagram.g:1271:2: ( () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' ) )
            // InternalActivityDiagram.g:1272:3: () otherlv_1= 'merge' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )? (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            {
            // InternalActivityDiagram.g:1272:3: ()
            // InternalActivityDiagram.g:1273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMergeNodeAccess().getMergeNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMergeNodeAccess().getMergeKeyword_1());
            		
            // InternalActivityDiagram.g:1283:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1284:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1284:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1285:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMergeNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMergeNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1302:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityDiagram.g:1303:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getMergeNodeAccess().getInKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalActivityDiagram.g:1311:4: ( (otherlv_5= RULE_ID ) )
                    // InternalActivityDiagram.g:1312:5: (otherlv_5= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1312:5: (otherlv_5= RULE_ID )
                    // InternalActivityDiagram.g:1313:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMergeNodeRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_5, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
                    					

                    }


                    }

                    // InternalActivityDiagram.g:1324:4: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==13) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1325:5: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMergeNodeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:1329:5: ( (otherlv_7= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1330:6: (otherlv_7= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1330:6: (otherlv_7= RULE_ID )
                    	    // InternalActivityDiagram.g:1331:7: otherlv_7= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMergeNodeRule());
                    	    							}
                    	    						
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getMergeNodeAccess().getIncomingActivityEdgeCrossReference_3_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,22,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalActivityDiagram.g:1348:3: (otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')' )
            // InternalActivityDiagram.g:1349:4: otherlv_9= 'out' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_9=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_9, grammarAccess.getMergeNodeAccess().getOutKeyword_4_0());
            			
            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_10, grammarAccess.getMergeNodeAccess().getLeftParenthesisKeyword_4_1());
            			
            // InternalActivityDiagram.g:1357:4: ( (otherlv_11= RULE_ID ) )
            // InternalActivityDiagram.g:1358:5: (otherlv_11= RULE_ID )
            {
            // InternalActivityDiagram.g:1358:5: (otherlv_11= RULE_ID )
            // InternalActivityDiagram.g:1359:6: otherlv_11= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getMergeNodeRule());
            						}
            					
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_11, grammarAccess.getMergeNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
            					

            }


            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            				newLeafNode(otherlv_12, grammarAccess.getMergeNodeAccess().getRightParenthesisKeyword_4_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMergeNode"


    // $ANTLR start "entryRuleDecisionNode"
    // InternalActivityDiagram.g:1379:1: entryRuleDecisionNode returns [EObject current=null] : iv_ruleDecisionNode= ruleDecisionNode EOF ;
    public final EObject entryRuleDecisionNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionNode = null;


        try {
            // InternalActivityDiagram.g:1379:53: (iv_ruleDecisionNode= ruleDecisionNode EOF )
            // InternalActivityDiagram.g:1380:2: iv_ruleDecisionNode= ruleDecisionNode EOF
            {
             newCompositeNode(grammarAccess.getDecisionNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionNode=ruleDecisionNode();

            state._fsp--;

             current =iv_ruleDecisionNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecisionNode"


    // $ANTLR start "ruleDecisionNode"
    // InternalActivityDiagram.g:1386:1: ruleDecisionNode returns [EObject current=null] : ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleDecisionNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1392:2: ( ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
            // InternalActivityDiagram.g:1393:2: ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            {
            // InternalActivityDiagram.g:1393:2: ( () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
            // InternalActivityDiagram.g:1394:3: () otherlv_1= 'decision' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            {
            // InternalActivityDiagram.g:1394:3: ()
            // InternalActivityDiagram.g:1395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecisionNodeAccess().getDecisionNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecisionNodeAccess().getDecisionKeyword_1());
            		
            // InternalActivityDiagram.g:1405:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:1406:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:1406:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:1407:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecisionNodeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecisionNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1424:3: (otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalActivityDiagram.g:1425:4: otherlv_3= 'in' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            				newLeafNode(otherlv_3, grammarAccess.getDecisionNodeAccess().getInKeyword_3_0());
            			
            otherlv_4=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_4, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_3_1());
            			
            // InternalActivityDiagram.g:1433:4: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:1434:5: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:1434:5: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:1435:6: otherlv_5= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getDecisionNodeRule());
            						}
            					
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_18); 

            						newLeafNode(otherlv_5, grammarAccess.getDecisionNodeAccess().getIncomingActivityEdgeCrossReference_3_2_0());
            					

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_19); 

            				newLeafNode(otherlv_6, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_3_3());
            			

            }

            // InternalActivityDiagram.g:1451:3: (otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityDiagram.g:1452:4: otherlv_7= 'out' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getDecisionNodeAccess().getOutKeyword_4_0());
                    			
                    otherlv_8=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getDecisionNodeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalActivityDiagram.g:1460:4: ( (otherlv_9= RULE_ID ) )
                    // InternalActivityDiagram.g:1461:5: (otherlv_9= RULE_ID )
                    {
                    // InternalActivityDiagram.g:1461:5: (otherlv_9= RULE_ID )
                    // InternalActivityDiagram.g:1462:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDecisionNodeRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_9, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalActivityDiagram.g:1473:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==13) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalActivityDiagram.g:1474:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDecisionNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalActivityDiagram.g:1478:5: ( (otherlv_11= RULE_ID ) )
                    	    // InternalActivityDiagram.g:1479:6: (otherlv_11= RULE_ID )
                    	    {
                    	    // InternalActivityDiagram.g:1479:6: (otherlv_11= RULE_ID )
                    	    // InternalActivityDiagram.g:1480:7: otherlv_11= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDecisionNodeRule());
                    	    							}
                    	    						
                    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getDecisionNodeAccess().getOutgoingActivityEdgeCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDecisionNodeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecisionNode"


    // $ANTLR start "entryRuleVariableAssignment"
    // InternalActivityDiagram.g:1501:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // InternalActivityDiagram.g:1501:59: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // InternalActivityDiagram.g:1502:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // InternalActivityDiagram.g:1508:1: ruleVariableAssignment returns [EObject current=null] : (this_IntegerVariableAssignment_0= ruleIntegerVariableAssignment | this_BooleanVariableAssignment_1= ruleBooleanVariableAssignment ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariableAssignment_0 = null;

        EObject this_BooleanVariableAssignment_1 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1514:2: ( (this_IntegerVariableAssignment_0= ruleIntegerVariableAssignment | this_BooleanVariableAssignment_1= ruleBooleanVariableAssignment ) )
            // InternalActivityDiagram.g:1515:2: (this_IntegerVariableAssignment_0= ruleIntegerVariableAssignment | this_BooleanVariableAssignment_1= ruleBooleanVariableAssignment )
            {
            // InternalActivityDiagram.g:1515:2: (this_IntegerVariableAssignment_0= ruleIntegerVariableAssignment | this_BooleanVariableAssignment_1= ruleBooleanVariableAssignment )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==32) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA26_3 = input.LA(4);

                        if ( ((LA26_3>=44 && LA26_3<=48)||(LA26_3>=50 && LA26_3<=51)) ) {
                            alt26=2;
                        }
                        else if ( (LA26_3==37||LA26_3==43) ) {
                            alt26=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 34:
                    case 35:
                    case 36:
                    case 49:
                        {
                        alt26=2;
                        }
                        break;
                    case RULE_INT:
                    case 33:
                    case 37:
                        {
                        alt26=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalActivityDiagram.g:1516:3: this_IntegerVariableAssignment_0= ruleIntegerVariableAssignment
                    {

                    			newCompositeNode(grammarAccess.getVariableAssignmentAccess().getIntegerVariableAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerVariableAssignment_0=ruleIntegerVariableAssignment();

                    state._fsp--;


                    			current = this_IntegerVariableAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:1525:3: this_BooleanVariableAssignment_1= ruleBooleanVariableAssignment
                    {

                    			newCompositeNode(grammarAccess.getVariableAssignmentAccess().getBooleanVariableAssignmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVariableAssignment_1=ruleBooleanVariableAssignment();

                    state._fsp--;


                    			current = this_BooleanVariableAssignment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleIntegerVariableAssignment"
    // InternalActivityDiagram.g:1537:1: entryRuleIntegerVariableAssignment returns [EObject current=null] : iv_ruleIntegerVariableAssignment= ruleIntegerVariableAssignment EOF ;
    public final EObject entryRuleIntegerVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariableAssignment = null;


        try {
            // InternalActivityDiagram.g:1537:66: (iv_ruleIntegerVariableAssignment= ruleIntegerVariableAssignment EOF )
            // InternalActivityDiagram.g:1538:2: iv_ruleIntegerVariableAssignment= ruleIntegerVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariableAssignment=ruleIntegerVariableAssignment();

            state._fsp--;

             current =iv_ruleIntegerVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerVariableAssignment"


    // $ANTLR start "ruleIntegerVariableAssignment"
    // InternalActivityDiagram.g:1544:1: ruleIntegerVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleIntegerExpression ) ) ) ;
    public final EObject ruleIntegerVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1550:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleIntegerExpression ) ) ) )
            // InternalActivityDiagram.g:1551:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleIntegerExpression ) ) )
            {
            // InternalActivityDiagram.g:1551:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleIntegerExpression ) ) )
            // InternalActivityDiagram.g:1552:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleIntegerExpression ) )
            {
            // InternalActivityDiagram.g:1552:3: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1553:4: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1553:4: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1554:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerVariableAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getIntegerVariableAssignmentAccess().getAssigneeIntegerVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalActivityDiagram.g:1569:3: ( (lv_expression_2_0= ruleIntegerExpression ) )
            // InternalActivityDiagram.g:1570:4: (lv_expression_2_0= ruleIntegerExpression )
            {
            // InternalActivityDiagram.g:1570:4: (lv_expression_2_0= ruleIntegerExpression )
            // InternalActivityDiagram.g:1571:5: lv_expression_2_0= ruleIntegerExpression
            {

            					newCompositeNode(grammarAccess.getIntegerVariableAssignmentAccess().getExpressionIntegerExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleIntegerExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerVariableAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.IntegerExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerVariableAssignment"


    // $ANTLR start "entryRuleBooleanVariableAssignment"
    // InternalActivityDiagram.g:1592:1: entryRuleBooleanVariableAssignment returns [EObject current=null] : iv_ruleBooleanVariableAssignment= ruleBooleanVariableAssignment EOF ;
    public final EObject entryRuleBooleanVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariableAssignment = null;


        try {
            // InternalActivityDiagram.g:1592:66: (iv_ruleBooleanVariableAssignment= ruleBooleanVariableAssignment EOF )
            // InternalActivityDiagram.g:1593:2: iv_ruleBooleanVariableAssignment= ruleBooleanVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariableAssignment=ruleBooleanVariableAssignment();

            state._fsp--;

             current =iv_ruleBooleanVariableAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanVariableAssignment"


    // $ANTLR start "ruleBooleanVariableAssignment"
    // InternalActivityDiagram.g:1599:1: ruleBooleanVariableAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleBooleanExpression ) ) ) ;
    public final EObject ruleBooleanVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1605:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleBooleanExpression ) ) ) )
            // InternalActivityDiagram.g:1606:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleBooleanExpression ) ) )
            {
            // InternalActivityDiagram.g:1606:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleBooleanExpression ) ) )
            // InternalActivityDiagram.g:1607:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleBooleanExpression ) )
            {
            // InternalActivityDiagram.g:1607:3: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1608:4: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1608:4: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1609:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanVariableAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getBooleanVariableAssignmentAccess().getAssigneeBooleanVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalActivityDiagram.g:1624:3: ( (lv_expression_2_0= ruleBooleanExpression ) )
            // InternalActivityDiagram.g:1625:4: (lv_expression_2_0= ruleBooleanExpression )
            {
            // InternalActivityDiagram.g:1625:4: (lv_expression_2_0= ruleBooleanExpression )
            // InternalActivityDiagram.g:1626:5: lv_expression_2_0= ruleBooleanExpression
            {

            					newCompositeNode(grammarAccess.getBooleanVariableAssignmentAccess().getExpressionBooleanExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleBooleanExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanVariableAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.BooleanExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanVariableAssignment"


    // $ANTLR start "entryRuleIntegerExpression"
    // InternalActivityDiagram.g:1647:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // InternalActivityDiagram.g:1647:58: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // InternalActivityDiagram.g:1648:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;

             current =iv_ruleIntegerExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerExpression"


    // $ANTLR start "ruleIntegerExpression"
    // InternalActivityDiagram.g:1654:1: ruleIntegerExpression returns [EObject current=null] : (this_IntegerBinaryExpression_0= ruleIntegerBinaryExpression | this_IntegerValue_1= ruleIntegerValue | this_IntegerVariable_2= ruleIntegerVariable ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerBinaryExpression_0 = null;

        EObject this_IntegerValue_1 = null;

        EObject this_IntegerVariable_2 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1660:2: ( (this_IntegerBinaryExpression_0= ruleIntegerBinaryExpression | this_IntegerValue_1= ruleIntegerValue | this_IntegerVariable_2= ruleIntegerVariable ) )
            // InternalActivityDiagram.g:1661:2: (this_IntegerBinaryExpression_0= ruleIntegerBinaryExpression | this_IntegerValue_1= ruleIntegerValue | this_IntegerVariable_2= ruleIntegerVariable )
            {
            // InternalActivityDiagram.g:1661:2: (this_IntegerBinaryExpression_0= ruleIntegerBinaryExpression | this_IntegerValue_1= ruleIntegerValue | this_IntegerVariable_2= ruleIntegerVariable )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
            case 37:
                {
                alt27=2;
                }
                break;
            case 33:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalActivityDiagram.g:1662:3: this_IntegerBinaryExpression_0= ruleIntegerBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getIntegerExpressionAccess().getIntegerBinaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerBinaryExpression_0=ruleIntegerBinaryExpression();

                    state._fsp--;


                    			current = this_IntegerBinaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:1671:3: this_IntegerValue_1= ruleIntegerValue
                    {

                    			newCompositeNode(grammarAccess.getIntegerExpressionAccess().getIntegerValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerValue_1=ruleIntegerValue();

                    state._fsp--;


                    			current = this_IntegerValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:1680:3: this_IntegerVariable_2= ruleIntegerVariable
                    {

                    			newCompositeNode(grammarAccess.getIntegerExpressionAccess().getIntegerVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerVariable_2=ruleIntegerVariable();

                    state._fsp--;


                    			current = this_IntegerVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalActivityDiagram.g:1692:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalActivityDiagram.g:1692:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalActivityDiagram.g:1693:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalActivityDiagram.g:1699:1: ruleBooleanExpression returns [EObject current=null] : (this_BooleanBinaryExpression_0= ruleBooleanBinaryExpression | this_BooleanUnaryExpression_1= ruleBooleanUnaryExpression | this_IntegerComparisonExpression_2= ruleIntegerComparisonExpression | this_BooleanValue_3= ruleBooleanValue | this_BooleanVariable_4= ruleBooleanVariable ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanBinaryExpression_0 = null;

        EObject this_BooleanUnaryExpression_1 = null;

        EObject this_IntegerComparisonExpression_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_BooleanVariable_4 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1705:2: ( (this_BooleanBinaryExpression_0= ruleBooleanBinaryExpression | this_BooleanUnaryExpression_1= ruleBooleanUnaryExpression | this_IntegerComparisonExpression_2= ruleIntegerComparisonExpression | this_BooleanValue_3= ruleBooleanValue | this_BooleanVariable_4= ruleBooleanVariable ) )
            // InternalActivityDiagram.g:1706:2: (this_BooleanBinaryExpression_0= ruleBooleanBinaryExpression | this_BooleanUnaryExpression_1= ruleBooleanUnaryExpression | this_IntegerComparisonExpression_2= ruleIntegerComparisonExpression | this_BooleanValue_3= ruleBooleanValue | this_BooleanVariable_4= ruleBooleanVariable )
            {
            // InternalActivityDiagram.g:1706:2: (this_BooleanBinaryExpression_0= ruleBooleanBinaryExpression | this_BooleanUnaryExpression_1= ruleBooleanUnaryExpression | this_IntegerComparisonExpression_2= ruleIntegerComparisonExpression | this_BooleanValue_3= ruleBooleanValue | this_BooleanVariable_4= ruleBooleanVariable )
            int alt28=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=44 && LA28_1<=48)) ) {
                    alt28=3;
                }
                else if ( ((LA28_1>=50 && LA28_1<=51)) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 35:
            case 36:
                {
                alt28=4;
                }
                break;
            case 34:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalActivityDiagram.g:1707:3: this_BooleanBinaryExpression_0= ruleBooleanBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanBinaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanBinaryExpression_0=ruleBooleanBinaryExpression();

                    state._fsp--;


                    			current = this_BooleanBinaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:1716:3: this_BooleanUnaryExpression_1= ruleBooleanUnaryExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanUnaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanUnaryExpression_1=ruleBooleanUnaryExpression();

                    state._fsp--;


                    			current = this_BooleanUnaryExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:1725:3: this_IntegerComparisonExpression_2= ruleIntegerComparisonExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getIntegerComparisonExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerComparisonExpression_2=ruleIntegerComparisonExpression();

                    state._fsp--;


                    			current = this_IntegerComparisonExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:1734:3: this_BooleanValue_3= ruleBooleanValue
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;


                    			current = this_BooleanValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalActivityDiagram.g:1743:3: this_BooleanVariable_4= ruleBooleanVariable
                    {

                    			newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVariable_4=ruleBooleanVariable();

                    state._fsp--;


                    			current = this_BooleanVariable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleIntegerBinaryExpression"
    // InternalActivityDiagram.g:1755:1: entryRuleIntegerBinaryExpression returns [EObject current=null] : iv_ruleIntegerBinaryExpression= ruleIntegerBinaryExpression EOF ;
    public final EObject entryRuleIntegerBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerBinaryExpression = null;


        try {
            // InternalActivityDiagram.g:1755:64: (iv_ruleIntegerBinaryExpression= ruleIntegerBinaryExpression EOF )
            // InternalActivityDiagram.g:1756:2: iv_ruleIntegerBinaryExpression= ruleIntegerBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerBinaryExpression=ruleIntegerBinaryExpression();

            state._fsp--;

             current =iv_ruleIntegerBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerBinaryExpression"


    // $ANTLR start "ruleIntegerBinaryExpression"
    // InternalActivityDiagram.g:1762:1: ruleIntegerBinaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerCalculationOperator ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleIntegerBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1768:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerCalculationOperator ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1769:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerCalculationOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1769:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerCalculationOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalActivityDiagram.g:1770:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerCalculationOperator ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1770:3: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1771:4: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1771:4: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1772:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerBinaryExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getIntegerBinaryExpressionAccess().getOperand1IntegerExpressionCrossReference_0_0());
            				

            }


            }

            // InternalActivityDiagram.g:1783:3: ( (lv_operator_1_0= ruleIntegerCalculationOperator ) )
            // InternalActivityDiagram.g:1784:4: (lv_operator_1_0= ruleIntegerCalculationOperator )
            {
            // InternalActivityDiagram.g:1784:4: (lv_operator_1_0= ruleIntegerCalculationOperator )
            // InternalActivityDiagram.g:1785:5: lv_operator_1_0= ruleIntegerCalculationOperator
            {

            					newCompositeNode(grammarAccess.getIntegerBinaryExpressionAccess().getOperatorIntegerCalculationOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_operator_1_0=ruleIntegerCalculationOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.IntegerCalculationOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1802:3: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1803:4: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1803:4: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1804:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerBinaryExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getIntegerBinaryExpressionAccess().getOperand2IntegerExpressionCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerBinaryExpression"


    // $ANTLR start "entryRuleIntegerComparisonExpression"
    // InternalActivityDiagram.g:1819:1: entryRuleIntegerComparisonExpression returns [EObject current=null] : iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF ;
    public final EObject entryRuleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerComparisonExpression = null;


        try {
            // InternalActivityDiagram.g:1819:68: (iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF )
            // InternalActivityDiagram.g:1820:2: iv_ruleIntegerComparisonExpression= ruleIntegerComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerComparisonExpression=ruleIntegerComparisonExpression();

            state._fsp--;

             current =iv_ruleIntegerComparisonExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerComparisonExpression"


    // $ANTLR start "ruleIntegerComparisonExpression"
    // InternalActivityDiagram.g:1826:1: ruleIntegerComparisonExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerComparisonOperator ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleIntegerComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1832:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerComparisonOperator ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1833:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerComparisonOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1833:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerComparisonOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalActivityDiagram.g:1834:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleIntegerComparisonOperator ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1834:3: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1835:4: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1835:4: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1836:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_0, grammarAccess.getIntegerComparisonExpressionAccess().getOperand1IntegerExpressionCrossReference_0_0());
            				

            }


            }

            // InternalActivityDiagram.g:1847:3: ( (lv_operator_1_0= ruleIntegerComparisonOperator ) )
            // InternalActivityDiagram.g:1848:4: (lv_operator_1_0= ruleIntegerComparisonOperator )
            {
            // InternalActivityDiagram.g:1848:4: (lv_operator_1_0= ruleIntegerComparisonOperator )
            // InternalActivityDiagram.g:1849:5: lv_operator_1_0= ruleIntegerComparisonOperator
            {

            					newCompositeNode(grammarAccess.getIntegerComparisonExpressionAccess().getOperatorIntegerComparisonOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_operator_1_0=ruleIntegerComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerComparisonExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.IntegerComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1866:3: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1867:4: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1867:4: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1868:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerComparisonExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getIntegerComparisonExpressionAccess().getOperand2IntegerExpressionCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerComparisonExpression"


    // $ANTLR start "entryRuleBooleanUnaryExpression"
    // InternalActivityDiagram.g:1883:1: entryRuleBooleanUnaryExpression returns [EObject current=null] : iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF ;
    public final EObject entryRuleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnaryExpression = null;


        try {
            // InternalActivityDiagram.g:1883:63: (iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF )
            // InternalActivityDiagram.g:1884:2: iv_ruleBooleanUnaryExpression= ruleBooleanUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanUnaryExpression=ruleBooleanUnaryExpression();

            state._fsp--;

             current =iv_ruleBooleanUnaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanUnaryExpression"


    // $ANTLR start "ruleBooleanUnaryExpression"
    // InternalActivityDiagram.g:1890:1: ruleBooleanUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBooleanUnaryOperator ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBooleanUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_operator_0_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1896:2: ( ( ( (lv_operator_0_0= ruleBooleanUnaryOperator ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1897:2: ( ( (lv_operator_0_0= ruleBooleanUnaryOperator ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1897:2: ( ( (lv_operator_0_0= ruleBooleanUnaryOperator ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalActivityDiagram.g:1898:3: ( (lv_operator_0_0= ruleBooleanUnaryOperator ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1898:3: ( (lv_operator_0_0= ruleBooleanUnaryOperator ) )
            // InternalActivityDiagram.g:1899:4: (lv_operator_0_0= ruleBooleanUnaryOperator )
            {
            // InternalActivityDiagram.g:1899:4: (lv_operator_0_0= ruleBooleanUnaryOperator )
            // InternalActivityDiagram.g:1900:5: lv_operator_0_0= ruleBooleanUnaryOperator
            {

            					newCompositeNode(grammarAccess.getBooleanUnaryExpressionAccess().getOperatorBooleanUnaryOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_operator_0_0=ruleBooleanUnaryOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanUnaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.BooleanUnaryOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1917:3: ( (otherlv_1= RULE_ID ) )
            // InternalActivityDiagram.g:1918:4: (otherlv_1= RULE_ID )
            {
            // InternalActivityDiagram.g:1918:4: (otherlv_1= RULE_ID )
            // InternalActivityDiagram.g:1919:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanUnaryExpressionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getBooleanUnaryExpressionAccess().getOperandBooleanVariableCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanUnaryExpression"


    // $ANTLR start "entryRuleBooleanBinaryExpression"
    // InternalActivityDiagram.g:1934:1: entryRuleBooleanBinaryExpression returns [EObject current=null] : iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF ;
    public final EObject entryRuleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanBinaryExpression = null;


        try {
            // InternalActivityDiagram.g:1934:64: (iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF )
            // InternalActivityDiagram.g:1935:2: iv_ruleBooleanBinaryExpression= ruleBooleanBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanBinaryExpression=ruleBooleanBinaryExpression();

            state._fsp--;

             current =iv_ruleBooleanBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanBinaryExpression"


    // $ANTLR start "ruleBooleanBinaryExpression"
    // InternalActivityDiagram.g:1941:1: ruleBooleanBinaryExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleBooleanBinaryOperator ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBooleanBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_operator_1_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:1947:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleBooleanBinaryOperator ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalActivityDiagram.g:1948:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleBooleanBinaryOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalActivityDiagram.g:1948:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleBooleanBinaryOperator ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalActivityDiagram.g:1949:3: ( (otherlv_0= RULE_ID ) ) ( (lv_operator_1_0= ruleBooleanBinaryOperator ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalActivityDiagram.g:1949:3: ( (otherlv_0= RULE_ID ) )
            // InternalActivityDiagram.g:1950:4: (otherlv_0= RULE_ID )
            {
            // InternalActivityDiagram.g:1950:4: (otherlv_0= RULE_ID )
            // InternalActivityDiagram.g:1951:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_0, grammarAccess.getBooleanBinaryExpressionAccess().getOperand1BooleanVariableCrossReference_0_0());
            				

            }


            }

            // InternalActivityDiagram.g:1962:3: ( (lv_operator_1_0= ruleBooleanBinaryOperator ) )
            // InternalActivityDiagram.g:1963:4: (lv_operator_1_0= ruleBooleanBinaryOperator )
            {
            // InternalActivityDiagram.g:1963:4: (lv_operator_1_0= ruleBooleanBinaryOperator )
            // InternalActivityDiagram.g:1964:5: lv_operator_1_0= ruleBooleanBinaryOperator
            {

            					newCompositeNode(grammarAccess.getBooleanBinaryExpressionAccess().getOperatorBooleanBinaryOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_operator_1_0=ruleBooleanBinaryOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanBinaryExpressionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.BooleanBinaryOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:1981:3: ( (otherlv_2= RULE_ID ) )
            // InternalActivityDiagram.g:1982:4: (otherlv_2= RULE_ID )
            {
            // InternalActivityDiagram.g:1982:4: (otherlv_2= RULE_ID )
            // InternalActivityDiagram.g:1983:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanBinaryExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getBooleanBinaryExpressionAccess().getOperand2BooleanVariableCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanBinaryExpression"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalActivityDiagram.g:1998:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // InternalActivityDiagram.g:1998:56: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // InternalActivityDiagram.g:1999:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalActivityDiagram.g:2005:1: ruleIntegerVariable returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:2011:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? ) )
            // InternalActivityDiagram.g:2012:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? )
            {
            // InternalActivityDiagram.g:2012:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? )
            // InternalActivityDiagram.g:2013:3: () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )?
            {
            // InternalActivityDiagram.g:2013:3: ()
            // InternalActivityDiagram.g:2014:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getIntKeyword_1());
            		
            // InternalActivityDiagram.g:2024:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:2025:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:2025:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:2026:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:2043:3: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityDiagram.g:2044:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalActivityDiagram.g:2048:4: ( (lv_initialValue_4_0= ruleEInt ) )
                    // InternalActivityDiagram.g:2049:5: (lv_initialValue_4_0= ruleEInt )
                    {
                    // InternalActivityDiagram.g:2049:5: (lv_initialValue_4_0= ruleEInt )
                    // InternalActivityDiagram.g:2050:6: lv_initialValue_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialValue_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_4_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleBooleanVariable"
    // InternalActivityDiagram.g:2072:1: entryRuleBooleanVariable returns [EObject current=null] : iv_ruleBooleanVariable= ruleBooleanVariable EOF ;
    public final EObject entryRuleBooleanVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVariable = null;


        try {
            // InternalActivityDiagram.g:2072:56: (iv_ruleBooleanVariable= ruleBooleanVariable EOF )
            // InternalActivityDiagram.g:2073:2: iv_ruleBooleanVariable= ruleBooleanVariable EOF
            {
             newCompositeNode(grammarAccess.getBooleanVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVariable=ruleBooleanVariable();

            state._fsp--;

             current =iv_ruleBooleanVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanVariable"


    // $ANTLR start "ruleBooleanVariable"
    // InternalActivityDiagram.g:2079:1: ruleBooleanVariable returns [EObject current=null] : ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )? ) ;
    public final EObject ruleBooleanVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:2085:2: ( ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )? ) )
            // InternalActivityDiagram.g:2086:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )? )
            {
            // InternalActivityDiagram.g:2086:2: ( () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )? )
            // InternalActivityDiagram.g:2087:3: () otherlv_1= 'bool' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )?
            {
            // InternalActivityDiagram.g:2087:3: ()
            // InternalActivityDiagram.g:2088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanVariableAccess().getBooleanVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanVariableAccess().getBoolKeyword_1());
            		
            // InternalActivityDiagram.g:2098:3: ( (lv_name_2_0= ruleEString ) )
            // InternalActivityDiagram.g:2099:4: (lv_name_2_0= ruleEString )
            {
            // InternalActivityDiagram.g:2099:4: (lv_name_2_0= ruleEString )
            // InternalActivityDiagram.g:2100:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalActivityDiagram.g:2117:3: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityDiagram.g:2118:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanVariableAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalActivityDiagram.g:2122:4: ( (lv_initialValue_4_0= ruleEBoolean ) )
                    // InternalActivityDiagram.g:2123:5: (lv_initialValue_4_0= ruleEBoolean )
                    {
                    // InternalActivityDiagram.g:2123:5: (lv_initialValue_4_0= ruleEBoolean )
                    // InternalActivityDiagram.g:2124:6: lv_initialValue_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getBooleanVariableAccess().getInitialValueEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialValue_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanVariableRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_4_0,
                    							"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanVariable"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalActivityDiagram.g:2146:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalActivityDiagram.g:2146:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalActivityDiagram.g:2147:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;

             current =iv_ruleBooleanValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalActivityDiagram.g:2153:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= ruleEBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:2159:2: ( ( (lv_value_0_0= ruleEBoolean ) ) )
            // InternalActivityDiagram.g:2160:2: ( (lv_value_0_0= ruleEBoolean ) )
            {
            // InternalActivityDiagram.g:2160:2: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalActivityDiagram.g:2161:3: (lv_value_0_0= ruleEBoolean )
            {
            // InternalActivityDiagram.g:2161:3: (lv_value_0_0= ruleEBoolean )
            // InternalActivityDiagram.g:2162:4: lv_value_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanValueAccess().getValueEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EBoolean");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleIntegerValue"
    // InternalActivityDiagram.g:2182:1: entryRuleIntegerValue returns [EObject current=null] : iv_ruleIntegerValue= ruleIntegerValue EOF ;
    public final EObject entryRuleIntegerValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValue = null;


        try {
            // InternalActivityDiagram.g:2182:53: (iv_ruleIntegerValue= ruleIntegerValue EOF )
            // InternalActivityDiagram.g:2183:2: iv_ruleIntegerValue= ruleIntegerValue EOF
            {
             newCompositeNode(grammarAccess.getIntegerValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerValue=ruleIntegerValue();

            state._fsp--;

             current =iv_ruleIntegerValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValue"


    // $ANTLR start "ruleIntegerValue"
    // InternalActivityDiagram.g:2189:1: ruleIntegerValue returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:2195:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalActivityDiagram.g:2196:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalActivityDiagram.g:2196:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalActivityDiagram.g:2197:3: (lv_value_0_0= ruleEInt )
            {
            // InternalActivityDiagram.g:2197:3: (lv_value_0_0= ruleEInt )
            // InternalActivityDiagram.g:2198:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getIntegerValueAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIntegerValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValue"


    // $ANTLR start "entryRuleEBoolean"
    // InternalActivityDiagram.g:2218:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalActivityDiagram.g:2218:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalActivityDiagram.g:2219:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalActivityDiagram.g:2225:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2231:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalActivityDiagram.g:2232:2: (kw= 'true' | kw= 'false' )
            {
            // InternalActivityDiagram.g:2232:2: (kw= 'true' | kw= 'false' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            else if ( (LA31_0==36) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalActivityDiagram.g:2233:3: kw= 'true'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2239:3: kw= 'false'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalActivityDiagram.g:2248:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalActivityDiagram.g:2248:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalActivityDiagram.g:2249:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalActivityDiagram.g:2255:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2261:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalActivityDiagram.g:2262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalActivityDiagram.g:2262:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalActivityDiagram.g:2263:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalActivityDiagram.g:2263:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalActivityDiagram.g:2264:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleControlFlow"
    // InternalActivityDiagram.g:2281:1: entryRuleControlFlow returns [EObject current=null] : iv_ruleControlFlow= ruleControlFlow EOF ;
    public final EObject entryRuleControlFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlFlow = null;


        try {
            // InternalActivityDiagram.g:2281:52: (iv_ruleControlFlow= ruleControlFlow EOF )
            // InternalActivityDiagram.g:2282:2: iv_ruleControlFlow= ruleControlFlow EOF
            {
             newCompositeNode(grammarAccess.getControlFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControlFlow=ruleControlFlow();

            state._fsp--;

             current =iv_ruleControlFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlFlow"


    // $ANTLR start "ruleControlFlow"
    // InternalActivityDiagram.g:2288:1: ruleControlFlow returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) ;
    public final EObject ruleControlFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalActivityDiagram.g:2294:2: ( (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? ) )
            // InternalActivityDiagram.g:2295:2: (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            {
            // InternalActivityDiagram.g:2295:2: (otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )? )
            // InternalActivityDiagram.g:2296:3: otherlv_0= 'flow' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControlFlowAccess().getFlowKeyword_0());
            		
            // InternalActivityDiagram.g:2300:3: ( (lv_name_1_0= ruleEString ) )
            // InternalActivityDiagram.g:2301:4: (lv_name_1_0= ruleEString )
            {
            // InternalActivityDiagram.g:2301:4: (lv_name_1_0= ruleEString )
            // InternalActivityDiagram.g:2302:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControlFlowAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControlFlowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.activitydiagram.sequential.xactivitydiagram.ActivityDiagram.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getControlFlowAccess().getFromKeyword_2());
            		
            // InternalActivityDiagram.g:2323:3: ( (otherlv_3= RULE_ID ) )
            // InternalActivityDiagram.g:2324:4: (otherlv_3= RULE_ID )
            {
            // InternalActivityDiagram.g:2324:4: (otherlv_3= RULE_ID )
            // InternalActivityDiagram.g:2325:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControlFlowRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_3, grammarAccess.getControlFlowAccess().getSourceActivityNodeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getControlFlowAccess().getToKeyword_4());
            		
            // InternalActivityDiagram.g:2340:3: ( (otherlv_5= RULE_ID ) )
            // InternalActivityDiagram.g:2341:4: (otherlv_5= RULE_ID )
            {
            // InternalActivityDiagram.g:2341:4: (otherlv_5= RULE_ID )
            // InternalActivityDiagram.g:2342:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControlFlowRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_5, grammarAccess.getControlFlowAccess().getTargetActivityNodeCrossReference_5_0());
            				

            }


            }

            // InternalActivityDiagram.g:2353:3: (otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityDiagram.g:2354:4: otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getControlFlowAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalActivityDiagram.g:2358:4: ( (otherlv_7= RULE_ID ) )
                    // InternalActivityDiagram.g:2359:5: (otherlv_7= RULE_ID )
                    {
                    // InternalActivityDiagram.g:2359:5: (otherlv_7= RULE_ID )
                    // InternalActivityDiagram.g:2360:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlFlowRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						newLeafNode(otherlv_7, grammarAccess.getControlFlowAccess().getGuardBooleanVariableCrossReference_6_1_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getControlFlowAccess().getRightSquareBracketKeyword_6_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlFlow"


    // $ANTLR start "ruleIntegerCalculationOperator"
    // InternalActivityDiagram.g:2380:1: ruleIntegerCalculationOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleIntegerCalculationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2386:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalActivityDiagram.g:2387:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalActivityDiagram.g:2387:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==37) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalActivityDiagram.g:2388:3: (enumLiteral_0= '+' )
                    {
                    // InternalActivityDiagram.g:2388:3: (enumLiteral_0= '+' )
                    // InternalActivityDiagram.g:2389:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntegerCalculationOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2396:3: (enumLiteral_1= '-' )
                    {
                    // InternalActivityDiagram.g:2396:3: (enumLiteral_1= '-' )
                    // InternalActivityDiagram.g:2397:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntegerCalculationOperatorAccess().getSUBRACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerCalculationOperator"


    // $ANTLR start "ruleIntegerComparisonOperator"
    // InternalActivityDiagram.g:2407:1: ruleIntegerComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleIntegerComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2413:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // InternalActivityDiagram.g:2414:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // InternalActivityDiagram.g:2414:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt35=1;
                }
                break;
            case 45:
                {
                alt35=2;
                }
                break;
            case 46:
                {
                alt35=3;
                }
                break;
            case 47:
                {
                alt35=4;
                }
                break;
            case 48:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalActivityDiagram.g:2415:3: (enumLiteral_0= '<' )
                    {
                    // InternalActivityDiagram.g:2415:3: (enumLiteral_0= '<' )
                    // InternalActivityDiagram.g:2416:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2423:3: (enumLiteral_1= '<=' )
                    {
                    // InternalActivityDiagram.g:2423:3: (enumLiteral_1= '<=' )
                    // InternalActivityDiagram.g:2424:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntegerComparisonOperatorAccess().getSMALLER_EQUALSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityDiagram.g:2431:3: (enumLiteral_2= '==' )
                    {
                    // InternalActivityDiagram.g:2431:3: (enumLiteral_2= '==' )
                    // InternalActivityDiagram.g:2432:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntegerComparisonOperatorAccess().getEQUALSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalActivityDiagram.g:2439:3: (enumLiteral_3= '>=' )
                    {
                    // InternalActivityDiagram.g:2439:3: (enumLiteral_3= '>=' )
                    // InternalActivityDiagram.g:2440:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntegerComparisonOperatorAccess().getGREATER_EQUALSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalActivityDiagram.g:2447:3: (enumLiteral_4= '>' )
                    {
                    // InternalActivityDiagram.g:2447:3: (enumLiteral_4= '>' )
                    // InternalActivityDiagram.g:2448:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIntegerComparisonOperatorAccess().getGREATEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerComparisonOperator"


    // $ANTLR start "ruleBooleanUnaryOperator"
    // InternalActivityDiagram.g:2458:1: ruleBooleanUnaryOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleBooleanUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2464:2: ( (enumLiteral_0= '!' ) )
            // InternalActivityDiagram.g:2465:2: (enumLiteral_0= '!' )
            {
            // InternalActivityDiagram.g:2465:2: (enumLiteral_0= '!' )
            // InternalActivityDiagram.g:2466:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

            			current = grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getBooleanUnaryOperatorAccess().getNOTEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanUnaryOperator"


    // $ANTLR start "ruleBooleanBinaryOperator"
    // InternalActivityDiagram.g:2475:1: ruleBooleanBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleBooleanBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalActivityDiagram.g:2481:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalActivityDiagram.g:2482:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalActivityDiagram.g:2482:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            else if ( (LA36_0==51) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalActivityDiagram.g:2483:3: (enumLiteral_0= '&' )
                    {
                    // InternalActivityDiagram.g:2483:3: (enumLiteral_0= '&' )
                    // InternalActivityDiagram.g:2484:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanBinaryOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityDiagram.g:2491:3: (enumLiteral_1= '|' )
                    {
                    // InternalActivityDiagram.g:2491:3: (enumLiteral_1= '|' )
                    // InternalActivityDiagram.g:2492:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanBinaryOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanBinaryOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000060003C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000FD040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000980002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002200000060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002001E00000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});

}