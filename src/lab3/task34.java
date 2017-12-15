package lab3;

import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double W = s.nextDouble();
        double H = s.nextDouble();
        double C = s.nextDouble();
        double D = s.nextDouble();
        if (H <= 0) {
            System.out.println("Значение H должно быть неотрицательным");
            return;
        }
        if (W <= 0) {
            System.out.println("Значение W должно быть неотрицательным");
            return;
        }
        if (C <= 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }
        if (D <= 0) {
            System.out.println("Значение D должно быть неотрицательным");
            return;
        }
       double result1 = Math.floor(W / C) * Math.floor(H/D);

        double result2 = Math.floor(H / C) * Math.floor(W / D);

        if (result1>result2) {
            System.out.println(result1+ " при C вдоль W");
        } else {
            System.out.println(result2+" при C вдоль H");
        }


    }
}
