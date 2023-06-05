// Generated from org\example\analisadorsintatico\gramaticaPascal.g4 by ANTLR 4.12.0
package org.example.analisadorsintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaPascalParser}.
 */
public interface gramaticaPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramaticaPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramaticaPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(gramaticaPascalParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(gramaticaPascalParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void enterDeclara(gramaticaPascalParser.DeclaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#declara}.
	 * @param ctx the parse tree
	 */
	void exitDeclara(gramaticaPascalParser.DeclaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void enterDvar(gramaticaPascalParser.DvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#dvar}.
	 * @param ctx the parse tree
	 */
	void exitDvar(gramaticaPascalParser.DvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(gramaticaPascalParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(gramaticaPascalParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(gramaticaPascalParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(gramaticaPascalParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(gramaticaPascalParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(gramaticaPascalParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void enterMais_dc(gramaticaPascalParser.Mais_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_dc}.
	 * @param ctx the parse tree
	 */
	void exitMais_dc(gramaticaPascalParser.Mais_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void enterCont_dc(gramaticaPascalParser.Cont_dcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#cont_dc}.
	 * @param ctx the parse tree
	 */
	void exitCont_dc(gramaticaPascalParser.Cont_dcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void enterSentencas(gramaticaPascalParser.SentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#sentencas}.
	 * @param ctx the parse tree
	 */
	void exitSentencas(gramaticaPascalParser.SentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterMais_sentencas(gramaticaPascalParser.Mais_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitMais_sentencas(gramaticaPascalParser.Mais_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void enterCont_sentencas(gramaticaPascalParser.Cont_sentencasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#cont_sentencas}.
	 * @param ctx the parse tree
	 */
	void exitCont_sentencas(gramaticaPascalParser.Cont_sentencasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void enterVar_read(gramaticaPascalParser.Var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#var_read}.
	 * @param ctx the parse tree
	 */
	void exitVar_read(gramaticaPascalParser.Var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_read(gramaticaPascalParser.Mais_var_readContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_var_read}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_read(gramaticaPascalParser.Mais_var_readContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void enterVar_write(gramaticaPascalParser.Var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#var_write}.
	 * @param ctx the parse tree
	 */
	void exitVar_write(gramaticaPascalParser.Var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void enterMais_var_write(gramaticaPascalParser.Mais_var_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_var_write}.
	 * @param ctx the parse tree
	 */
	void exitMais_var_write(gramaticaPascalParser.Mais_var_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaPascalParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaPascalParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(gramaticaPascalParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(gramaticaPascalParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void enterPfalsa(gramaticaPascalParser.PfalsaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#pfalsa}.
	 * @param ctx the parse tree
	 */
	void exitPfalsa(gramaticaPascalParser.PfalsaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(gramaticaPascalParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(gramaticaPascalParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(gramaticaPascalParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(gramaticaPascalParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(gramaticaPascalParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(gramaticaPascalParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void enterOp_ad(gramaticaPascalParser.Op_adContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#op_ad}.
	 * @param ctx the parse tree
	 */
	void exitOp_ad(gramaticaPascalParser.Op_adContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaPascalParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaPascalParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void enterMais_fatores(gramaticaPascalParser.Mais_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#mais_fatores}.
	 * @param ctx the parse tree
	 */
	void exitMais_fatores(gramaticaPascalParser.Mais_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void enterOp_mul(gramaticaPascalParser.Op_mulContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#op_mul}.
	 * @param ctx the parse tree
	 */
	void exitOp_mul(gramaticaPascalParser.Op_mulContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaPascalParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaPascalParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#intnum}.
	 * @param ctx the parse tree
	 */
	void enterIntnum(gramaticaPascalParser.IntnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#intnum}.
	 * @param ctx the parse tree
	 */
	void exitIntnum(gramaticaPascalParser.IntnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaPascalParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(gramaticaPascalParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaPascalParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(gramaticaPascalParser.IdContext ctx);
}