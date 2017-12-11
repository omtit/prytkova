package lab2;

import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double aInDeg;
        aInDeg = s.nextDouble();
        double bInDeg;
        bInDeg = s.nextDouble();
        double result;
        result = 3*Math.sin(2*aInDeg*Math.PI/180)*Math.cos(3*bInDeg*Math.PI/180);
        System.out.printf("%.4f", result);
    }
}
