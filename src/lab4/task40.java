package lab4;

import java.util.Scanner;

public class task40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int w = s.nextInt();
        int h = s.nextInt();
        int i = 1;
        while (i <= h) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    System.out.print(s2);
                }
            } else {
                for (int g = 0; g < w; g++) {
                    System.out.print(s1);
                }
            }
            i++;
            System.out.println();
        }
    }

}

