package lab4;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String B = s.nextLine();
        int A = s.nextInt();
        if (A < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        int i = 0;
        System.out.print("\"");
        while (i < A) {
            System.out.print(B);
            i = i + 1;
        }
        System.out.print("\"");
    }
}
