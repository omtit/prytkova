package lab2;

import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double xa;
        xa=s.nextDouble();
        double ya;
        ya=s.nextDouble();
        double xb;
        xb=s.nextDouble();
        double yb;
        yb=s.nextDouble();
        double result;
        result = Math.sqrt(Math.pow(xb-xa,2)+Math.pow(yb-ya,2));
        System.out.printf("%.4f", result);
    }
}
