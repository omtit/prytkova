package lab4;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count1 = 0;
        int count2 = 0;

       while (a>199 || a<83) {
           if (a<83) {
               count1++;
               a=s.nextInt();
           }
           if (a>199) {
               count2++;
               a=s.nextInt();
           }
       }
        System.out.println("Количество слева: "+count1+ ",  количество справа: " +count2);

    }
}





