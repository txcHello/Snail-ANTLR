grammar Expr;

prog : stat+ ;
stat : expr NEWLINE
    | ID '=' expr NEWLINE
    | NEWLINE
    ;
expr : expr ('*'|'/') expr
    | expr ('+' | '-') expr
    | INT
    |ID
    | '('expr ')'
    ;

ID : [a-zA-Z]+; //匹配标识符
INT :[0-9]+;    //匹配整数
NEWLINE : '\r'?  '\n';  //告诉语法分析器 新行开始
WS :[ \t]+ ->skip ; //丢掉空白字符