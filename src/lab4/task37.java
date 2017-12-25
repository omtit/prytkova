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
        int i = 0;
        while (i < h) {
            System.out.print("+");
            i++;
        }
        System.out.print("+");
        System.out.print("+");
        System.out.print("+");
        System.out.print("+");
        System.out.print("#");
        System.out.println();


        i = 2;
        while (i < h) {
            System.out.print("+");
            i++;
        }
        System.out.print("#");
        System.out.print("#");

        i = 3;
        while (i < h) {
            System.out.print("+");
            i++;
        }
        System.out.print("#");
        System.out.print("#");
        System.out.print("#");
while () {
    for (i=0; i<w; i++ )   {
        System.out.print("+");
    }
    for (int j=w; j)
}

        System.out.println();
        i = 1;
        while (i < h) {
            System.out.print("+");
            i++;
        }
        j = 4;
        while (i < w) {

            System.out.print("#");
            i++;
        }

    }

}
