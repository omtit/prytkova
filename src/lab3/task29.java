package lab3;

import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x<0) {
            System.out.println("Координата X должна быть неотрицательной");
            return;
        }
        if (y<0) {
            System.out.println("Координата Y должна быть неотрицательной");
            return;
        }
        if (x>=100 && x<=190 && y>=100 && y<=170) {
            System.out.println("Точка внутри");
        } else {
            System.out.println("Точка снаружи");

        }


    }
}
