package lab3;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        if (a <= 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (b <= 0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (c <= 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }
        if (d <= 0) {
            System.out.println("Значение D должно быть неотрицательным");
            return;
        }
        if (a < c && b < d) {
            System.out.println("Размещение возможно");
        } else {
            System.out.println("Размещение невозможно");
        }
    }
}