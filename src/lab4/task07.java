package lab4;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a < b) {
            while (a <= b) {
                System.out.print(a + " ");
                a = a + 1;
            }
        } else {
            while (b <= a) {
                System.out.print(a + " ");
                a = a - 1;

            }
        }
    }
}
