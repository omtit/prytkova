package lab3;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if (1000<= A && A<=9999){
            int r1 = A%10;
            int r2 = A%1000;
            int r3 = (r2-A%100)/100;
            if (r1==r3) {
                System.out.println("равно"+" " +r1 +" "+r3);
            } else {
                System.out.println("не равно"+" "+r1 +" "+r3);}

        }else {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
        }
    }
}
