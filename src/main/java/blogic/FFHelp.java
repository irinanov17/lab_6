package blogic;

public class FFHelp {
    public static double area(FlatFigure ff) {
        double s=0;
        if (isTriangle(ff)) {
            return getAreaForTriangle(ff);
        }
        else s = getAreaForRectangle(ff);

        return s;
    }

    private static double getAreaForTriangle(FlatFigure ff) {
        if (ff.al==90) return 0.5*ff.a*ff.b;
        else {
            double p=(ff.a+ff.b+ff.c)/2;
            return Math.sqrt(p*(p-ff.a)*(p-ff.b)*(p-ff.c));
        }
    }

    private static double getAreaForRectangle(FlatFigure ff) {
        if (isRectangle(ff)) { return getAreaForSquare(ff); }
        else { return getAreaForParallelogram(ff); }
    }

    private static double getAreaForParallelogram(FlatFigure ff){
        return  ff.a*ff.b*Math.sin(ff.al*Math.PI/180);
    }

    private static double getAreaForSquare(FlatFigure ff) { return ff.a*ff.b;}

    private static boolean isTriangle(FlatFigure ff) {
        return ff.d==0;
    }

    private static boolean isRectangle(FlatFigure ff) {
        return ff.al==90 && ff.bet==90 && ff.a==ff.c && ff.b==ff.d;
    }
}
