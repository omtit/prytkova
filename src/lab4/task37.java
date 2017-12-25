package lab4;

import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (w == 0) {
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        if (h == 0) {
            return;
        }
        int i=0;
        while (i<=w)
            System.out.print("+");
        i++;



            }
}