package lab2;

import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        a = s.nextDouble();
        double b;
        b = 12*Math.pow(a,2)+7*a-16;
        System.out.printf("%.4f", b);
    }
}
