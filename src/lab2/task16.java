package lab2;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        x = s.nextInt();
        y = s.nextInt();
        if (y<0) {
            System.out.println("Значение y должно быть неотрицательным");
            return;
        }
        double result;
        result = -5*Math.sqrt(x+Math.sqrt(y));
        if (x+Math.sqrt(y)<0) {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        System.out.printf("%.4f", result);
    }
}
