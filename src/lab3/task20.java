package lab3;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (-2<=y && y<=1.5) {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            System.out.println("не принадлежит");
        }
    }
}
