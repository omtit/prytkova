package lab2;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextDouble();
        double result;
        result = (Math.sqrt(x+5)+Math.sqrt(x-5))/(2*Math.sqrt(x));

        if ((x-5)< 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        if (x< 0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        System.out.printf("%f", result);
    }
}
