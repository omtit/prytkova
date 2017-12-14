package lab3;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (1<=x && x<=2 && 0<=y && y<=4) {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            System.out.println("не принадлежит");
        }

    }
}
