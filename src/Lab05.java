import static java.lang.System.*;

/**
 * Created by pro-31 on 02.02.2018.
 */
public class Lab05 {
    public static boolean task8878(int a, int b) {
        if (a < b) {
            return true;

        } else {
            return false;
        }

   }

   public static boolean task8715( int a, int b, int c){
       return a<b && b<c;
//       boolean fact = a<b && b<c;
//       return fact;

//       if (a<b && b<c){
//           return true;
//       }else {
//           return false;
//       }
   }
   public static boolean task4847(int x, int y, int z){
       if (x==y || y==z || x==z){
           return true;

       }else {
           return false;
       }
   }

    public static double task5980(int K) {
        double r;
        if (K > 0) {
            r=Math.sqrt(K);
        } else {
            r= K * K;
        }
        return r;
    }

    public static int task8174(int a){
        return Math.abs(a);
    }

    public static String task5662(int a, int b, int c){

        if ( a ==0) {
           return "Данное уравнение не является квадратным";

        }
        double D = b*b -4*a*c;

        if (D>0) {
            double x1= (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            return  "У уравнения:  "+a+"x^2+"+b+"x+"+c+"=0 два вещественных корня\n"+"где х1="+x1+", x2="+x2;
        }else if (D==0){
            double x = -b/(2*a);
            return "Уравнение: "+a+"x^2+"+b+"x+"+c+"=0 имеет один корень x="+x;
        }
        else {
            return "Вещественных корней уравнения: "+a+"x^2+"+b+"x+"+c+"=0 нет D=" +D;
        }

    }

    public static int task3770(int a, int b, int c){
        return Math.max(Math.max(a ,b),c);
    }

    public static boolean task1999(int x, int y){
        if (x <= -2 && y >= 1) {
            return true;
           // System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            //System.out.println("Точка с координатами [" + x + "; " + y + ";]не принадлежит множеству");
            return false;
        }
    }

    public static boolean task4042(double x, double y){
        if (-2<=y && y<=1.5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task6351(double x, double y){
        if (1<=x && x<=2 &&  y<=4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task5382(double x, double y){
        if (1<=x  && 2<=y && y<=4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task7088(double x, double y){
        if (x >= 1 && y <= -1 || x >= 2 && y >= 0){
            return true;}

        else {
            return false;
        }

    }

    public static boolean task7250(double x, double y){
        if (x >= 2 && y >= 1 || x >= 2 && y <= -1.5){
            return true;}

        else {
            return false;
        }
    }

    public static boolean task6740(double x, double y){
        if (x >= 1 && x <= 3 && y <= -1 && y>= -2){
            return true;}

        else {
            return false;
        }
    }

    public static boolean task9038(double x, double y){
        if (y >= 0.5 && y <= 1.5 || x >= 2 ){
            return true;}

        else {
            return false;
        }
    }

    public static StringBuilder task8518(StringBuilder sb, String x){
        String S = "a\nb\nd\ne\nf\ng\nh";

        if (x.equals("a")) {
            sb.append("a+").append("\n");
        } else {
            sb.append("a").append("\n");

        }
        if (x.equals("b")) {
            sb.append("b+").append("\n");
        } else {
            sb.append("b").append("\n");

        }
        if (x.equals("c")) {
            sb.append("c+").append("\n");
        } else {
            sb.append("c").append("\n");

        }
        if (x.equals("d")) {
            sb.append("d+").append("\n");
        } else {
            sb.append("d").append("\n");

        }
        if (x.equals("e")) {
            sb.append("e+").append("\n");
        } else {
            sb.append("e").append("\n");

        }
        if (x.equals("f")) {
            sb.append("f+").append("\n");
        } else {
            sb.append("f").append("\n");

        }
        if (x.equals("g")) {
            sb.append("g+").append("\n");
        } else {
            sb.append("g").append("\n");

        }
        if (x.equals("h")) {
            sb.append("h+").append("\n");
        } else {
            sb.append("h").append("\n");

        }
        return sb;
    }

}
