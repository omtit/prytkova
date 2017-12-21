package lab4;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long r =1;
        if (a<b) {
            while (a<=b) {
                r = r*a;
                a++;

            }
            System.out.println(r);
        } else {
            while (a>=b) {
                r = r*b;
                b++;
            }
            System.out.println(r);
        }
    }
}
