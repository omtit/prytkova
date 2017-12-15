package lab3;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();
        if (x >= 1 && x <= 3 && y <= -1 && y>= -2){
            System.out.println("Точка с координатами [" + x + "; " + y + ";] принадлежит множеству");}

        else {
            System.out.println("Точка с координатами [" + x + "; " + y + ";] не принадлежит множеству");
        }

    }
}

