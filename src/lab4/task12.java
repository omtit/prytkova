package lab4;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int r =0;
        if (b>=-10 && b<=10000) {
            while (-10<=b) {
                 r= r+b;
                b--;

                }
            System.out.println(r);

        } else {
            System.out.println("Значение b должно быть в интервале [-10,10000]");
        }
    }
}
