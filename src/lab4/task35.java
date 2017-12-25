package lab4;

import java.util.Scanner;

public class task35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        int h = s.nextInt();
        if (h<0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        if (h==0) {
            return;
        }
        for (int i = 1; i<=h; i++) {

            for (int z = i; z>0; z--) {
                System.out.print(p);
            }
            System.out.println();

        }

    }
}
