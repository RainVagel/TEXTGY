// Generated from TEXTGY.g4 by ANTLR 4.5.3
package TEXTGY;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TEXTGYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TEXTGYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(TEXTGYParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#lause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLause(TEXTGYParser.LauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#tagastuslause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagastuslause(TEXTGYParser.TagastuslauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#omistamine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmistamine(TEXTGYParser.OmistamineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#muutujadeklaratsioon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuutujadeklaratsioon(TEXTGYParser.MuutujadeklaratsioonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#tuup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuup(TEXTGYParser.TuupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#iflause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIflause(TEXTGYParser.IflauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#whilelause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilelause(TEXTGYParser.WhilelauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#alterlause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterlause(TEXTGYParser.AlterlauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#altertegevus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltertegevus(TEXTGYParser.AltertegevusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#hastegevus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHastegevus(TEXTGYParser.HastegevusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#addtegevus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddtegevus(TEXTGYParser.AddtegevusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#removetegevus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemovetegevus(TEXTGYParser.RemovetegevusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#changetegevus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangetegevus(TEXTGYParser.ChangetegevusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#objektiloomine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjektiloomine(TEXTGYParser.ObjektiloomineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#funktsiooniloomine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsiooniloomine(TEXTGYParser.FunktsiooniloomineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#objektituup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjektituup(TEXTGYParser.ObjektituupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#objektiparameetrid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjektiparameetrid(TEXTGYParser.ObjektiparameetridContext ctx);
	/**
	 * Visit a parse tree produced by {@link TEXTGYParser#avaldis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaldis(TEXTGYParser.AvaldisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vordlemine}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVordlemine(TEXTGYParser.VordlemineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TriviaalneAvaldis5}
	 * labeled alternative in {@link TEXTGYParser#avaldis5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis5(TEXTGYParser.TriviaalneAvaldis5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TriviaalneAvaldis4}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis4(TEXTGYParser.TriviaalneAvaldis4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LiitmineLahutamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiitmineLahutamine(TEXTGYParser.LiitmineLahutamineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KorrutamineJagamine}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKorrutamineJagamine(TEXTGYParser.KorrutamineJagamineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TriviaalneAvaldis3}
	 * labeled alternative in {@link TEXTGYParser#avaldis3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis3(TEXTGYParser.TriviaalneAvaldis3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaarneMiinus}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaarneMiinus(TEXTGYParser.UnaarneMiinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TriviaalneAvaldis2}
	 * labeled alternative in {@link TEXTGYParser#avaldis2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis2(TEXTGYParser.TriviaalneAvaldis2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FunktsiooniValjakutse}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunktsiooniValjakutse(TEXTGYParser.FunktsiooniValjakutseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TriviaalneAvaldis1}
	 * labeled alternative in {@link TEXTGYParser#avaldis1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriviaalneAvaldis1(TEXTGYParser.TriviaalneAvaldis1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SoneLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoneLiteraalR(TEXTGYParser.SoneLiteraalRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MuutujaNimiR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuutujaNimiR(TEXTGYParser.MuutujaNimiRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArvuLiteraalR}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArvuLiteraalR(TEXTGYParser.ArvuLiteraalRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuluAvaldis}
	 * labeled alternative in {@link TEXTGYParser#avaldis0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuluAvaldis(TEXTGYParser.SuluAvaldisContext ctx);
}