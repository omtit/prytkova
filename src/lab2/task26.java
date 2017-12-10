package lab2;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        a=s.nextDouble();
        if (a==0){
            System.out.println("Значение a должно быть не равно нулю");
            return;
        }
        double b;
        b= s.nextDouble();
        double c;
        c=s.nextDouble();
        double d;
        d= s.nextDouble();
        if (d==0){
            System.out.println("Значение d должно быть не равно нулю");
            return;
                }
        double result;
        result = (a*d+b*c)/(a*d);
        System.out.printf("%.4f", result);
    }

}
