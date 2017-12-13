package lab3;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a < b && b < c) {
            System.out.println("\"Выполняется\"");
        } else {
            System.out.println("\"Не выполняется\"");
        }


        if (a < b) {
            if (b < c) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        } else {
            System.out.println("-");
        }

    }
}