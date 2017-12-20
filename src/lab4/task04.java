package lab4;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        if (A >= B) {
            System.out.println("Значение A должно быть не больше значения B");
            return;
        }
        while (B >= A) {
            System.out.print(B+" ");
            B = B - 1;
        }
    }
}
