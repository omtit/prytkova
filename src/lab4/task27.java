package lab4;

import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int r = 0;

        if (a>b) {
            while (b<=a) {
                if (b%7==0) {
                 r = b+r;}

                b++;
            }
            System.out.println(r);
            return;
        }
        if (a<b) {
            while (a<=b) {
                if (a%7==0) {
                    r = a+r;}
                    a++;
                }
            System.out.println(r);
            return;
            }
        }
    }

