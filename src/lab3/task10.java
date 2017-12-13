package lab3;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();
        if (x > 0) {
            System.out.print(x * x + "; ");
        } else {
            System.out.print(x + "; ");
        }
        if (y > 0) {
            System.out.print(y * y + "; ");
        } else {
            System.out.print(y + "; ");
        }
        if (z > 0) {
            System.out.print(z * z);
        } else {
            System.out.print(z);
        }
    }
}