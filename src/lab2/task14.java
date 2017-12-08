package lab2;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int b;
        b = s.nextInt();
        if (b>0){
            System.out.println("Значение B должно быть не положительным");
            return;
        }
        double result;
        result = a*Math.sqrt(-7*b);
        System.out.printf("%.4f", result);

    }
}
