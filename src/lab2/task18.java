package lab2;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1;
        double x2;
        double x3;
        x1 = s.nextDouble();
        x2 = s.nextDouble();
        x3 = s.nextDouble();
        double result;
        result = x1*x2+x1*x3+x2*x3;
        System.out.printf("%.0f", result);
    }
}
