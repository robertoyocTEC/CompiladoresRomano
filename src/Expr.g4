grammar Expr;
prog: (expr NEWLINE {
    System.out.println("");
})* ;
expr: (thousand)(hundred)(ten)(unit)
    | (hundred)(ten)(unit)
    | (ten)(unit)
    | unit;
thousand: INT {
    int q = Main.parse(_ctx.getText());
    if(q <= 3) {
      System.out.print(Main.repeat(q, "M"));
    }
};
hundred: INT {
    int q = Main.parse(_ctx.getText());
    if(q <= 3) {
        System.out.print(Main.repeat(q, "C"));
    }
    if(q == 4) {
        System.out.print("CD");
    }
    if(q >= 5 && q <=8) {
        System.out.print("D");
        System.out.print(Main.repeat(q-5, "C"));
    }
    if(q == 9) {
        System.out.print("CM");
    }
};
ten: INT {
    int q = Main.parse(_ctx.getText());
    if(q <= 3) {
        System.out.print(Main.repeat(q, "X"));
    }
    if(q == 4) {
        System.out.print("XL");
    }
    if(q >= 5 && q <=8) {
        System.out.print("L");
        System.out.print(Main.repeat(q-5, "X"));
    }
    if(q == 9) {
        System.out.print("XC");
    }
};
unit: INT {
    int q = Main.parse(_ctx.getText());
    if(q <= 3) {
        System.out.print(Main.repeat(q, "I"));
    }
    if(q == 4) {
        System.out.print("IV");
    }
    if(q >= 5 && q <=8) {
        System.out.print("V");
        System.out.print(Main.repeat(q-5, "I"));
    }
    if(q == 9) {
        System.out.print("IX");
    }
};

NEWLINE : [\r\n]+;
INT : [0-9] ;