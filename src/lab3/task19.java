package lab3;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (x <= -2 && y >= 1) {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            System.out.println("не принадлежит");
        }
    }
}