package lab2;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edge;
        edge = s.nextInt();
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительным");
            return;
        }
        double volume;
        volume = Math.pow(edge, 3);
        System.out.printf("%.3f",volume);
    }
    }

