package lab2;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        x= s.nextInt();
        if (61-x<0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        double result;
        result = 3*Math.sqrt(61-x);
        System.out.printf("%.4f", result);
    }
}
