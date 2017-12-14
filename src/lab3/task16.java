package lab3;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(Math.max(Math.max(a ,b),c));

    }
}
