package lab2;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int radius;
        radius = s.nextInt();
        if (radius <=0){
            System.out.println("Радиус должен быть положительным");
            return;
        }
        double circumference;
        circumference=2*Math.PI*radius;
        System.out.printf("%.4f",circumference);
    }
}
