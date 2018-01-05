package lab4;

import java.util.Scanner;

public class task38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a < b) {
            while (a <= b) {

                if (a % 2 != 0) {
                        if (a == b|| b-a==1) {
                        System.out.print(a);
                        return;
                    }
                    System.out.print(a+",");
                }
                a++;

            }

        }
        else {
            while (b<=a){
            if (a % 2 != 0) {
                if (a == b|| a-b==1) {
                    System.out.print(a);
                    return;}

                System.out.print(a+",");

                }

            a--;}

        }
    }
}