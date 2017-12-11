package lab2;

import java.util.Scanner;

public class task35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x1;
        x1=s.nextDouble();
        double x2;
        x2=s.nextDouble();
        double result;
        result = Math.sqrt(Math.pow(x2,2)+Math.pow(x1,2));
        System.out.printf("%.4f", result);
    }
}
