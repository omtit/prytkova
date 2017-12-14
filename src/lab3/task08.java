package lab3;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
                 if ( a ==0) {
             System.out.println("Данное уравнение не является квадратным");
             return;
         }
        double D = b*b -4*a*c;

         if (D>0) {
             double x1= (-b + Math.sqrt(D))/(2*a);
             double x2 = (-b - Math.sqrt(D))/(2*a);
             System.out.printf("У уравнения:  %dx^2+%dx+%d=0 два вещественных корня\n" , a, b, c);
             System.out.printf("где х1=%.4f, x2=%.4f",x1,x2 );
              }else if (D==0){
             double x = -b/(2*a);
             System.out.printf("Уравнение: %dx^2+%dx+%d=0 имеет один корень x=%.4f",a,b,c,x);
         }
         else {
             System.out.println("Вещественных корней уравнения: "+a+"x^2+"+b+"x+"+c+"=0 нет D=" +D);
         }
    }
}
