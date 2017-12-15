package lab3;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        if (x >= 2 && y >= 1 || x >= 2 && y <= -1.5){
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");}

        else {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] не принадлежит множеству");
        }

    }
}
