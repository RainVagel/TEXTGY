// Generated from TEXTGY.g4 by ANTLR 4.5.3
package TEXTGY;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TEXTGYParser}.
 */
public interface TEXTGYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(TEXTGYParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(TEXTGYParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#lausetejada}.
	 * @param ctx the parse tree
	 */
	void enterLausetejada(TEXTGYParser.LausetejadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#lausetejada}.
	 * @param ctx the parse tree
	 */
	void exitLausetejada(TEXTGYParser.LausetejadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#lause}.
	 * @param ctx the parse tree
	 */
	void enterLause(TEXTGYParser.LauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#lause}.
	 * @param ctx the parse tree
	 */
	void exitLause(TEXTGYParser.LauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#tagastuslause}.
	 * @param ctx the parse tree
	 */
	void enterTagastuslause(TEXTGYParser.TagastuslauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#tagastuslause}.
	 * @param ctx the parse tree
	 */
	void exitTagastuslause(TEXTGYParser.TagastuslauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#omistamine}.
	 * @param ctx the parse tree
	 */
	void enterOmistamine(TEXTGYParser.OmistamineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#omistamine}.
	 * @param ctx the parse tree
	 */
	void exitOmistamine(TEXTGYParser.OmistamineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#muutujadeklaratsioon}.
	 * @param ctx the parse tree
	 */
	void enterMuutujadeklaratsioon(TEXTGYParser.MuutujadeklaratsioonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#muutujadeklaratsioon}.
	 * @param ctx the parse tree
	 */
	void exitMuutujadeklaratsioon(TEXTGYParser.MuutujadeklaratsioonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#tuup}.
	 * @param ctx the parse tree
	 */
	void enterTuup(TEXTGYParser.TuupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#tuup}.
	 * @param ctx the parse tree
	 */
	void exitTuup(TEXTGYParser.TuupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#iflause}.
	 * @param ctx the parse tree
	 */
	void enterIflause(TEXTGYParser.IflauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#iflause}.
	 * @param ctx the parse tree
	 */
	void exitIflause(TEXTGYParser.IflauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#whilelause}.
	 * @param ctx the parse tree
	 */
	void enterWhilelause(TEXTGYParser.WhilelauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#whilelause}.
	 * @param ctx the parse tree
	 */
	void exitWhilelause(TEXTGYParser.WhilelauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#alterlause}.
	 * @param ctx the parse tree
	 */
	void enterAlterlause(TEXTGYParser.AlterlauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#alterlause}.
	 * @param ctx the parse tree
	 */
	void exitAlterlause(TEXTGYParser.AlterlauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#objektiloomine}.
	 * @param ctx the parse tree
	 */
	void enterObjektiloomine(TEXTGYParser.ObjektiloomineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#objektiloomine}.
	 * @param ctx the parse tree
	 */
	void exitObjektiloomine(TEXTGYParser.ObjektiloomineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#funktsiooniloomine}.
	 * @param ctx the parse tree
	 */
	void enterFunktsiooniloomine(TEXTGYParser.FunktsiooniloomineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#funktsiooniloomine}.
	 * @param ctx the parse tree
	 */
	void exitFunktsiooniloomine(TEXTGYParser.FunktsiooniloomineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#objektituup}.
	 * @param ctx the parse tree
	 */
	void enterObjektituup(TEXTGYParser.ObjektituupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#objektituup}.
	 * @param ctx the parse tree
	 */
	void exitObjektituup(TEXTGYParser.ObjektituupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DescriptionParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionParameeter(TEXTGYParser.DescriptionParameeterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DescriptionParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionParameeter(TEXTGYParser.DescriptionParameeterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void enterItemParameeter(TEXTGYParser.ItemParameeterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void exitItemParameeter(TEXTGYParser.ItemParameeterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkillParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void enterSkillParameeter(TEXTGYParser.SkillParameeterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkillParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void exitSkillParameeter(TEXTGYParser.SkillParameeterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void enterAttributeParameeter(TEXTGYParser.AttributeParameeterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeParameeter}
	 * labeled alternative in {@link TEXTGYParser#objektiparameeter}.
	 * @param ctx the parse tree
	 */
	void exitAttributeParameeter(TEXTGYParser.AttributeParameeterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#funktsioonivaljakutseobjekt}.
	 * @param ctx the parse tree
	 */
	void enterFunktsioonivaljakutseobjekt(TEXTGYParser.FunktsioonivaljakutseobjektContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#funktsioonivaljakutseobjekt}.
	 * @param ctx the parse tree
	 */
	void exitFunktsioonivaljakutseobjekt(TEXTGYParser.FunktsioonivaljakutseobjektContext ctx);
	/**
	 * Enter a parse tree produced by {@link TEXTGYParser#avaldis}.
	 * @param ctx the parse tree
	 */
	void enterAvaldis(TEXTGYParser.AvaldisContext ctx);
	/**
	 * Exit a parse tree produced by {@link TEXTGYParser#avaldis}.
	 * @param ctx the parse tree
	 */
	void exitAvaldis(TEXTGYParser.AvaldisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vordlemine}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 */
	void enterVordlemine(TEXTGYParser.VordlemineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vordlemine}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 */
	void exitVordlemine(TEXTGYParser.VordlemineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TriviaalneAvaldis5}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 */
	void enterTriviaalneAvaldis5(TEXTGYParser.TriviaalneAvaldis5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TriviaalneAvaldis5}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 */
	void exitTriviaalneAvaldis5(TEXTGYParser.TriviaalneAvaldis5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TriviaalneAvaldis4}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 */
	void enterTriviaalneAvaldis4(TEXTGYParser.TriviaalneAvaldis4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TriviaalneAvaldis4}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 */
	void exitTriviaalneAvaldis4(TEXTGYParser.TriviaalneAvaldis4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LiitmineLahutamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 */
	void enterLiitmineLahutamine(TEXTGYParser.LiitmineLahutamineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiitmineLahutamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 */
	void exitLiitmineLahutamine(TEXTGYParser.LiitmineLahutamineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KorrutamineJagamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 */
	void enterKorrutamineJagamine(TEXTGYParser.KorrutamineJagamineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KorrutamineJagamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 */
	void exitKorrutamineJagamine(TEXTGYParser.KorrutamineJagamineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TriviaalneAvaldis3}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 */
	void enterTriviaalneAvaldis3(TEXTGYParser.TriviaalneAvaldis3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TriviaalneAvaldis3}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 */
	void exitTriviaalneAvaldis3(TEXTGYParser.TriviaalneAvaldis3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaarneMiinus}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 */
	void enterUnaarneMiinus(TEXTGYParser.UnaarneMiinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaarneMiinus}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 */
	void exitUnaarneMiinus(TEXTGYParser.UnaarneMiinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TriviaalneAvaldis2}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 */
	void enterTriviaalneAvaldis2(TEXTGYParser.TriviaalneAvaldis2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TriviaalneAvaldis2}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 */
	void exitTriviaalneAvaldis2(TEXTGYParser.TriviaalneAvaldis2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FunktsiooniValjakutse}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 */
	void enterFunktsiooniValjakutse(TEXTGYParser.FunktsiooniValjakutseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunktsiooniValjakutse}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 */
	void exitFunktsiooniValjakutse(TEXTGYParser.FunktsiooniValjakutseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TriviaalneAvaldis1}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 */
	void enterTriviaalneAvaldis1(TEXTGYParser.TriviaalneAvaldis1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TriviaalneAvaldis1}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 */
	void exitTriviaalneAvaldis1(TEXTGYParser.TriviaalneAvaldis1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code SoneLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void enterSoneLiteraalR(TEXTGYParser.SoneLiteraalRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SoneLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void exitSoneLiteraalR(TEXTGYParser.SoneLiteraalRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MuutujaNimiR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void enterMuutujaNimiR(TEXTGYParser.MuutujaNimiRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MuutujaNimiR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void exitMuutujaNimiR(TEXTGYParser.MuutujaNimiRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArvuLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void enterArvuLiteraalR(TEXTGYParser.ArvuLiteraalRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArvuLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void exitArvuLiteraalR(TEXTGYParser.ArvuLiteraalRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuluAvaldis}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void enterSuluAvaldis(TEXTGYParser.SuluAvaldisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuluAvaldis}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void exitSuluAvaldis(TEXTGYParser.SuluAvaldisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkillAvaldis}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void enterSkillAvaldis(TEXTGYParser.SkillAvaldisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkillAvaldis}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 */
	void exitSkillAvaldis(TEXTGYParser.SkillAvaldisContext ctx);
}