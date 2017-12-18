package lab3;

import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int H1 = s.nextInt();
        int W1 = s.nextInt();

        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int H2 = s.nextInt();
        int W2 = s.nextInt();
        if (H1<=0 || H2<=0) {
            System.out.println("Высота должна быть положительна");
            return;
        }
        if (W1<=0 || W2<=0) {
            System.out.println("Ширина должна быть положительна");
        }



    }
}
