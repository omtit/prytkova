package lab4;

import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int i;
        int j = 0;
        if (w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }

        while (j <= 9) {
            i = 0;
            while (i < w) {
                System.out.print(j);
                i++;
            }
            j++;
            System.out.println();


        }
    }
}
