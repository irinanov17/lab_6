package blogic;

public class FlatFigure {
    double a,b,c,d;
    int al,bet;

    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (c<a+b && b<c+a && a<c+b)    System.out.println("ok Triangle");
        else System.out.println("bad Triangle");
    }
    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        if (alfa==90) this.c=Math.sqrt(a*a+b*b);
        else this.c = Math.sqrt(a*a+b*b -2*a*b*Math.cos(alfa*Math.PI/180));
        this.al = alfa;
    }
    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al= alfa;
        this.bet=180-alfa;
    }
    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        if (alfa+betta==180)
            System.out.println("ok Parallelogram");
        else    System.out.println("bad Parallelogram");

        this.al= alfa;
        this.bet=betta;
    }

    public double area() {
       return FFHelp.area(this);
    }
}
