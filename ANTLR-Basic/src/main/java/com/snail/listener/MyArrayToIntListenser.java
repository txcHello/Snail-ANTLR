package com.snail.listener;

import com.snail.gen.ArrayIntBaseListener;
import com.snail.gen.ArrayIntParser;

/**
 * @Author Administrator
 * @Date 2023/6/14 16:37
 * @Version 1.0
 * Desc:
 */
public class MyArrayToIntListenser extends ArrayIntBaseListener {

    // 将{ 转换为 "
    @Override
    public void enterArr(ArrayIntParser.ArrContext ctx) {
        System.out.print('"');

    }

    @Override
    public void exitArr(ArrayIntParser.ArrContext ctx) {
        System.out.println('"');
    }


    @Override
    public void enterValue(ArrayIntParser.ValueContext ctx) {
        String text = ctx.INT().getText();//获取value对应的值
        int i = Integer.parseInt(text);
        System.out.printf("\\u%04x",i);
    }


}
