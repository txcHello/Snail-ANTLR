grammar LabeledExpr;

prog : stat+ ;
stat : expr NEWLINE       # printExpr
    | ID '=' expr NEWLINE # assign
    | NEWLINE             # blank
    ;
expr : expr (MUL|DIV) expr  # MulDiv
    | expr (ADD | SUB) expr # AddSub
    | INT                   # int
    |ID                     # id
    | '('expr ')'           #parens
    ;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

ID : [a-zA-Z]+; //匹配标识符
INT :[0-9]+;    //匹配整数
NEWLINE : '\r'?  '\n';  //告诉语法分析器 新行开始
WS :[ \t]+ ->skip ; //丢掉空白字符