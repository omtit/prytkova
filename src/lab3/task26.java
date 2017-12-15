package lab3;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        if (y >= 0.5 && y <= 1.5 || x >= 2 ){
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");}

        else {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] не принадлежит множеству");
        }

    }
}
