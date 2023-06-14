grammar ArrayInt;
arr: '{' value (','value)* '}';
value : arr
     | INT
     ;
INT : [0-9]+;
WS : [ \t\n\r]+ ->skip;
