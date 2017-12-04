package lab2;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalInM;
        totalInM = s.nextInt();
        int partInCm;
        partInCm = s.nextInt();
        if (totalInM <=0){
            System.out.println("Значение totalInM должно быть положительным");
            return;
        }
        if (partInCm <=0){
            System.out.println("Значение partInCm должно быть положительным");
            return;
        }
        int amount;
        amount = totalInM*100/partInCm;
        System.out.printf("%d шт и ",amount );
        int deficit;
        deficit = totalInM*100%partInCm;
        System.out.printf("%d см\n", deficit);
        System.out.printf("%d шт и %d см", amount,deficit );

    }
}