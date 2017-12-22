package lab4;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = s.nextInt();
        if (y < 0 || y > 15) {
            System.out.println("Значение Y должно быть в интервале [0, 15]");
            return;
        } else {
            while (x < 15) {
                x++;
                if (x <= y) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }


            }

        }
    }
}