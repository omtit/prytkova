package lab2;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base;
        base = s.nextDouble();
        double height;
        height = s.nextDouble();
        if (base<=0) {
            System.out.println("Значение base должно быть положительным");
            return;

        }
        if  (height <= 0) {
                System.out.println("Значение height должно быть положительным");
                return;
        }

        double area;
        area = (base*height)/2;
        System.out.printf("%.4f",area);
            }
}
