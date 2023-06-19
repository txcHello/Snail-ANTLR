package com.snail.driver;

import com.snail.gen.LabeledExprLexer;
import com.snail.gen.LabeledExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @Author Administrator
 * @Date 2023/6/19 15:30
 * @Version 1.0
 * Desc:
 */
public class Calc {
    public static void main(String[] args) {
        String s = "1+1";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(s);
        LabeledExprLexer lexer = new LabeledExprLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        LabeledExprParser labeledExprParser = new LabeledExprParser(commonTokenStream);
        LabeledExprParser.ProgContext prog = labeledExprParser.prog();

        System.out.println(prog.toStringTree());
    }
}
