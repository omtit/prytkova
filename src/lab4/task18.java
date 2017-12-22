package lab4;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int sum =0;
        int count=0;
        do {
         a= s.nextInt();
         sum = sum + a;
         count++;
        }
        while (sum<=1000);

        System.out.println("Сумма чисел: "+sum +", Количество чисел: "+ count);
    }

}

