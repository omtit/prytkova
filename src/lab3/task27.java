package lab3;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (-10 <= a && a <= 100) {
            if (a == -3 || a == 3 || a == 23 || a == 33 || a == 43 || a == 53 || a == 63 || a == 73 || a == 83 || a == 93) {
                System.out.println(a + "'ий");
            } else if (a == -8 || a == -7 || a == -6 || a == -2 || a == 0 || a == 2 || a == 6 || a == 7 || a == 8 || a == 22 || a == 26 || a == 27 || a == 28 || a == 32 || a == 36 || a == 37 || a == 38 || a == 40 || a == 42 || a == 46 || a == 47 || a == 48 ||
                    a == 52 || a == 56 || a == 57 || a == 58 || a == 62 || a == 66 || a == 67 || a == 68 || a == 72 || a == 76 || a == 77 || a == 78 || a == 82 || a == 86 || a == 87 || a == 88 || a == 92 || a == 96 || a == 97 || a == 98) {
                System.out.println(a + "'ой");
            } else {
                System.out.println(a + "'ый");
            }
        } else {
            System.out.println("Значение A должно быть в интервале [-10, 100]");
        }

        if (-10 <= a && a <= 100) {
            if (a % 10 == 3) {
                if (a == 13) {
                    System.out.println(a + "'ый");
                } else {
                    System.out.println(a + "'ий");
                }
            }
            else if (a % 10 == 6 || a % 10 == 8 || a % 10 == 7 || a == 40 || a == 0|| a%10==2) {
                if (a==12||a == 16 || a == 17 || a == 18) {
                    System.out.println(a + "'ый");
                } else {
                    System.out.println(a + "'ой");
                }


            } else {
                System.out.println(a + "'ый");

            }
        }
    }
}