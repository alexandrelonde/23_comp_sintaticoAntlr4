package org.example.analisadorsintatico;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Compilador {
    private String entrada;

    public Compilador(String entrada) {
        this.entrada = entrada;
    }

    public void compile() {
        CharStream input = CharStreams.fromString(this.entrada);
        gramaticaPascalLexer lexer = new gramaticaPascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            int tokenType = token.getType();
            String tokenName = lexer.getVocabulary().getSymbolicName(tokenType);
            String tokenText = token.getText();
            int line = token.getLine();
            int column = token.getCharPositionInLine();
            System.out.println("Token: " + tokenName + " | Texto: " + tokenText + " | Linha: " + line + " | Coluna: " + column);
        }
        gramaticaPascalParser parser = new gramaticaPascalParser(tokens);
        ParseTree tree = parser.program();
    }
}