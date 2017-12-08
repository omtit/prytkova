package lab2;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius;
        radius = s.nextInt();
        if (radius<=0) {
            System.out.println("Значение radius должно быть положительным");
            return;
        }
        double volume;
        volume = 4*Math.PI*Math.pow(radius,3)/3;
        System.out.printf("%.4f",volume);
    }
}
