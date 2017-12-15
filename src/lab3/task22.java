package lab3;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (1<=x  && 2<=y && y<=4) {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");
        } else {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] не принадлежит множеству");
        }

    }
}
