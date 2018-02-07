package lab4;

import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0;


        if (a < b) {
            while (a <= b) {
                int r = a % 2;
                if (r != 0) {
                    for (int i=0; i<count; i++) {
                        System.out.print(".");
                    }

                    System.out.print(a + "\n");

                    count++;
                }
                a++;

            }
        }

       else if (a > b) {
            count=0;
            while (b <= a) {
                int r = b % 2;
                if (r != 0) {
                    for (int i=0; i<count; i++) {
                        System.out.print(".");
                    }

                    System.out.print(b + "\n");

                    count++;
                }
                b++;

            }
        }

    }
}


