package lab4;

import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        System.out.print("+");
        for ( int i = 2; i<w; i++) {
             System.out.print("-");
            }

        System.out.print("+\n");
        System.out.print("|");
            for (int b =2; b<w; b++) {

                    System.out.print(".");

        }
        System.out.print("|\n");
        System.out.print("+");
        for (int n =2; n<w; n++) {

            System.out.print("-");

        }
        System.out.print("+\n");
    }
}
