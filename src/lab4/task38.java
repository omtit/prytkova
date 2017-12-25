package lab4;

import java.util.Scanner;

public class task38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a < 0) {
            System.out.println("Значение A должно быть неотрицательно");
            return;
        }
        if (a == 0) {
            return;
        }
        if (b < 0) {
            System.out.println("Значение B должно быть неотрицательно");
            return;
        }
        if (b == 0) {
            return;
        }
        if (a < b) {
            while (a <= b) {

                if (a < b) {
                    System.out.print(a + ", ");}
                if (a==b)    {
                    System.out.print(a);
                }
                a++;
            }
        }
        else  {
            while (a>=b)
            if (a == b) {
            System.out.println(a);
        } else{
            System.out.print(a + ", ");}
            a--;

        }
    }
}
