package lab2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int yInRad;
        yInRad=s.nextInt();
        double result;
        result =5* Math.cos(yInRad*Math.PI/180);
        System.out.printf("%.4f", result);
    }
}
