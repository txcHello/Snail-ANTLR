package com.snail.driver;

import com.snail.gen.ArrayIntLexer;
import com.snail.gen.ArrayIntParser;
import com.snail.listener.MyArrayToIntListenser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @Author Administrator
 * @Date 2023/6/15 15:03
 * @Version 1.0
 * Desc:
 */
public class ArrayToIntDriver {
    public static void main(String[] args) {
     //新建一个charStream
        String  arr ="{99,3,451}";
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(arr);
        //新建词法分析器 处理输入的charStream
        ArrayIntLexer arrayIntLexer = new ArrayIntLexer(antlrInputStream);
        //新建词法符号缓冲区，用于存储词法分析器将生成的词法符号
        CommonTokenStream commonTokenStream = new CommonTokenStream(arrayIntLexer);
        //新建语法分析器处理词法缓冲区的内容
        ArrayIntParser arrayIntParser = new ArrayIntParser(commonTokenStream);

        ArrayIntParser.ArrContext arr1 = arrayIntParser.arr();//针对 init规则进行语法解析
        System.out.println(arr1.toStringTree()); //用lisp风格打印树
       // System.out.println(arr1.toStringTree(arrayIntParser)); //用lisp风格打印树
        //新建通用,能够触发回调函数的语法分析遍历树
        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        //遍历语法分析过程中生产的语法树，触发回调
        parseTreeWalker.walk(new MyArrayToIntListenser(),arr1);
        System.out.println();

    }
}
