DECLARE

A INT:=9;

B INT:=3;

BEGIN

DBMS_OUTPUT.PUT_LINE(A||' + '||B||' = '||(A+B));
DBMS_OUTPUT.PUT_LINE(A||' - '||B||' = '||(A-B));
DBMS_OUTPUT.PUT_LINE(A||' * '||B||' = '||(A*B));
DBMS_OUTPUT.PUT_LINE(A||' / '||B||' = '||(A/B));
  END;

/