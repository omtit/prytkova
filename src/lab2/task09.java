package lab2;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aInitial;
        aInitial=s.nextInt();
        double aRemainder;
        aRemainder= aInitial%360;
        System.out.printf("%.0f", aRemainder);
    }
}
