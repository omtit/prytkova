package lab4;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a = 30;
        int b = 40;
        while (a <= b) {
            if (x == a) {
                System.out.println(x + "+");
            } else {
                System.out.println(a+"-");
            }
            a = a + 1;
        }
    }
}
