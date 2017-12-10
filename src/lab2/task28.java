package lab2;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        a = s.nextDouble();
        double b;
        b = s.nextDouble();
        double c;
        c = s.nextDouble();
        double x;
        x = s.nextDouble();
        double result;
        result = 1/Math.sqrt(a*Math.pow(x,2)+b*x+c);
        if ((a*Math.pow(x,2)+b*x+c) < 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        if (Math.sqrt(a*Math.pow(x,2)+b*x+c) == 0) {
            System.out.println("Знаменатель не может быть равен нулю");
            return;
        }
        System.out.printf("%.4f", result);
    }
}
