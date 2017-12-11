package lab2;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
      //  if (a==0){
       //    System.out.println("уравнение не является квадратным");
       //     return;
        //}
        double b;
        double c;
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        double discriminant;
        discriminant = Math.pow(b,2)-4*a*c;
        System.out.printf("%.4f",discriminant);
    }
}
