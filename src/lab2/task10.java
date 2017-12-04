package lab2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double xInDeg;
        xInDeg = s.nextDouble();
        double result;
                result = Math.sin(xInDeg*Math.PI/180);
        System.out.printf("%.4f" , result);

    }

}
