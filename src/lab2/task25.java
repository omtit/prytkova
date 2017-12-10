package lab2;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        a = s.nextDouble();
        double b;
        b = s.nextDouble();
        double aInDeg;
        aInDeg = s.nextDouble();
        double result;
        result =Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(aInDeg*Math.PI/180));
        System.out.printf("%.4f", result);
    }
}
