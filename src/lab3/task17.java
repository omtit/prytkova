package lab3;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int P = s.nextInt();
        if (P == 0) {
            System.out.println("Значение P должно быть не равно нулю");
            return;
        }
              if (M%P==0) {
                  System.out.println(M/P);
              }else
              {
                  System.out.println("M не делится нацело на P");
              }

    }
}
