package lab4;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int r =0;
        int count=1;
        a= s.nextInt();
        while (a!=0) {
            r = a +r;
            a= s.nextInt();

            count = count+1;

        }
        System.out.println("Сумма чисел: "+r +", Количество чисел: "+ count);
    }
}
