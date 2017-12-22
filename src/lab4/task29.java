package lab4;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        int i = 2;
        int count =0;
        if (y <= 0) {
            System.out.println("Значение Y должно быть положительным");
            return;
        }
        while (i < y) {
            if (y%i==0){
                count++;
            }
            i++;
        }

         if(count!=0){
            System.out.println("число не простое");
        } else {
            System.out.println("число простое");
        }
    }
}