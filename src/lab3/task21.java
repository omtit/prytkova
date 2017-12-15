package lab3;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        int y = s.nextInt();
        if (1<=x && x<=2 &&  y<=4) {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] не принадлежит множеству");
        }

    }
}
