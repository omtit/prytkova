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
        result = Math.sin(aInDeg*Math.PI/180)*Math.cos(bInDeg*Math.PI/180)+Math.cos(aInDeg*Math.PI/180)*Math.sin(bInDeg*Math.PI/180);
        System.out.printf("%.4f", result);
    }
}
