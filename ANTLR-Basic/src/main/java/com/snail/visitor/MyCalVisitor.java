package com.snail.visitor;

import com.snail.gen.LabeledExprBaseVisitor;
import com.snail.gen.LabeledExprParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Administrator
 * @Date 2023/6/19 15:41
 * @Version 1.0
 * Desc:
 */
public class MyCalVisitor extends LabeledExprBaseVisitor<Integer> {
        //存放变量名和变量值的对应关系
    Map  memory =    new HashMap<String,Integer>();

        //    | ID '=' expr NEWLINE # assign
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();  //id 在 = 左侧
        Integer value = visit(ctx.expr()); //计算右侧表达式的值
        //将映射关系存储在计算机内存中
        memory.put(id,value);
        return value;
    }
 //    expr NEWLINE       # printExpr
    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        LabeledExprParser.ExprContext expr = ctx.expr();
        Integer visit = visit(expr);
        System.out.println(visit);
        return  0;
    }


}
