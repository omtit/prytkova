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

}
