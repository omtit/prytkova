package lab4;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        if (n < 0) {
            System.out.println("Значение N должно быть неотрицательным");
            return;
        }
        while (n > i) {
            i++;
            System.out.print("#");

            if (i % 20 == 0) {
                System.out.println(" ");
            }

        }
    }
}