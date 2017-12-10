package lab2;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double aInDeg;
        aInDeg = s.nextDouble();
        double bInDeg;
        bInDeg = s.nextDouble();
        double result;
        result = Math.sin(aInDeg)*Math.cos(bInDeg)+ Math.cos(aInDeg)*Math.sin(bInDeg);
        System.out.printf("%.4f", result);
    }
}
