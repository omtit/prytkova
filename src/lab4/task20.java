package lab4;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long r = 0;
        if (a > b) {
            while (a >= b) {
                r = r + b * b;
                b++;
            }
            System.out.println(r);
            return;
        }
        if (b > a) {
            while (a <= b) {

                r = r + a * a;
                a++;
            }
            System.out.println(r);
        }

    }
}
