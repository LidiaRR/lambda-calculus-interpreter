grammar lc;
root : terme
     ;
terme : '(' terme ')'   # parentesis
      | terme terme      # aplicacio
      | abstraccio      # abs
      | LLETRA          # lletra
      ;

abstraccio : ('λ'|'\\') LLETRA '.' terme
           ;

LLETRA: [a-z] ;