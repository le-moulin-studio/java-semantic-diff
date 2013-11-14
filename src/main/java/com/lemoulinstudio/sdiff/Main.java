package com.lemoulinstudio.sdiff;

import com.lemoulinstudio.sdiff.parser.java.JavaLexer;
import com.lemoulinstudio.sdiff.parser.java.JavaParser;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {

  public static void main(String[] args) throws Exception {
    String filename = "src/main/resources/Foobar.java";
    JavaParser javaParser = getParser(filename);
    
    String filename2 = "src/main/resources/Foobar2.java";
    JavaParser javaParser2 = getParser(filename2);
    
//    Future<JDialog> future = javaParser.compilationUnit().inspect(javaParser);
//    future.get().setVisible(true);
    ParseTree a = javaParser.compilationUnit();
    ParseTree b = javaParser2.compilationUnit();
    
    boolean r = isSimilar(a, b);
    
    System.out.print("Is similar ? "+ Boolean.toString(r));

  }

  private static boolean isSimilar(ParseTree nodeA, ParseTree nodeB) {
    //if (((ParserRuleContext) a).getRuleIndex() == ((ParserRuleContext) b).getRuleIndex()) {
    if (!nodeA.getText().equalsIgnoreCase(nodeB.getText())) {
      return false;
    }

    int nbChildrenNodeA = nodeA.getChildCount();
    int nbChildrenNodeB = nodeB.getChildCount();
    if (nbChildrenNodeA != nbChildrenNodeB) {
      return false;
    }

    for (int i = 0; i < nbChildrenNodeA; i++) {
      ParseTree a1 = nodeA.getChild(i);
      ParseTree b1 = nodeB.getChild(i);
      if (!isSimilar(a1, b1)) {
        return false;
      }
    }
    
    return true;
  }
  
  private static JavaParser getParser(String filename) throws Exception {
  InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(filename)));

    CharStream charStream = new ANTLRInputStream(inputStream);

    JavaLexer javaLexer = new JavaLexer(charStream);
    
    TokenStream tokenStream = new BufferedTokenStream(javaLexer);
    JavaParser javaParser = new JavaParser(tokenStream);

    javaParser.addParseListener(new ParseTreeListener() {
      @Override
      public void visitTerminal(TerminalNode node) {
        System.out.print(node.getText() + " ");
      }

      @Override
      public void visitErrorNode(ErrorNode node) {
      }

      @Override
      public void enterEveryRule(ParserRuleContext ctx) {
      }

      @Override
      public void exitEveryRule(ParserRuleContext ctx) {
      }
    });

    javaParser.setBuildParseTree(true);
    return javaParser;
  }
}
