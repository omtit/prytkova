package lab4;

import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0;
        int i =0;

        if (a < b) {
            while (a <= b) {
                int r = a % 2;
                if (r != 0) {

                    while (i<=count)    {    System.out.print(".");
                        }


                    System.out.print(a + "\n");

                }
                a++;
                count++;

            }
        }

    }
}

