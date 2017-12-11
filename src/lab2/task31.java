package lab2;

import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextDouble();
        double result;
        result = 7*Math.pow(x,2)-3*x+6;
        System.out.printf("%.0f", result);
    }
}
