package lab4;

import java.util.Scanner;

public class task41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int w = s.nextInt();
        int h = s.nextInt();
        if (w<0 ){
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (h<0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        if (w==0||h==0){
            return;
        }
        int i = 1;
        int j = 1;
        while (i <= h) {
            while (j <=w) {
                if (j % 2 == 0) {
                    System.out.print(s2);
                } else {
                    System.out.print(s1);
                }
                j++;

            }
            j=1;
            System.out.println();
            i++;

        }

    }
}
