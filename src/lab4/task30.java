package lab4;

import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int i = 1;
        if (w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }
        while (i <= i) {
            while (i <= w) {
                System.out.print("a");
                i++;
            }
            while (i <= w) {
                System.out.print("b");
                i++;
            }
            while (i <= w) {
                System.out.print("c");
                i++;
            }
            i++;
        }
    }
}
