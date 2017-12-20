package lab4;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        while (b < a) {
            System.out.print(b+ " ");
            b = b + 1;
        }
        while (a <= b) {
            System.out.print(a+ " ");
            a = a + 1;
        }
    }
}



