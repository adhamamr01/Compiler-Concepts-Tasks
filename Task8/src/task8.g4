grammar task8;

//Parser Rule start to parse the input and check whether it is accepted or rejected
start: (Q2 | Q3 | Q4) + EOF ;


HELP: ZERO ONE+ | ONE+ ;
//Lexer Rule Q2 which has the Regular Expression of the accepted state Q2
Q2:  ZERO (ONE ZERO)* ZERO
    | HELP* ZERO ZERO
    | HELP* ZERO ZERO ONE* (ZERO ONE)* ZERO ZERO HELP* ZERO (ONE ZERO)* ZERO
    | HELP* ZERO ZERO ZERO ONE+ ZERO ZERO HELP* ZERO (ONE ZERO)* ZERO
    | HELP* ZERO ZERO ZERO ZERO HELP* ZERO (ONE ZERO)* ZERO ;

//Lexer Rule Q3 which has the Regular Expression of the accepted state Q3
Q3: Q2 ONE* ZERO | Q2 ONE* (ZERO ONE+)* ZERO ;

//Lexer Rule Q4 which has the Regular Expression of the accepted state Q4
Q4: Q2 ONE+ | Q3 ONE+  ;

//Fragments representing the zeros and ones
fragment ZERO: '0' ;
fragment ONE: '1' ;