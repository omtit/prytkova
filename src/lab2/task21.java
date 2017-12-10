package lab2;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double R1;
        R1= s.nextDouble();
        double R2;
        R2 =s.nextDouble();
        if (R1== 0){
            System.out.println("Значение r1 должно быть не равно нулю");
            return;
        }

        if (R2==0){
            System.out.println("Значение r2 должно быть не равно нулю");
            return;
        }
        double result;
        result = 1/R1 + 1/R2;
        System.out.printf("%.4f", result);
    }
}
