package lab4;

import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (w==0) {
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        if (h==0) {
            return;
        }
        for (int i = -1; i <= w; i++) {
            if (i == -1 || i == w) {
                System.out.print(" ");
            } else {
                System.out.print(i);
            }
        }

        for (int n = 0; n < h; n++) {
            System.out.print("\n" + n);
            for (int b = 0; b <= w; b++) {
                if (b == w) {
                    System.out.print("|");
                } else {
                    System.out.print(".");
                }
            }
        }
        System.out.print("\n");
        for (int v = -1; v <= w; v++) {
            if (v == -1 || v == w) {
                System.out.print(" ");
            } else {
                System.out.print("-");
            }
        }
    }
}
