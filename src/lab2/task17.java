package lab2;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double velocity1;
        velocity1 = s.nextDouble();
        if (velocity1<0) {
            System.out.println("Скорость должна быть неотрицательна");
            return;
        }
        double velocity2;
        velocity2 = s.nextDouble();
        if (velocity2<0) {
            System.out.println("Скорость должна быть неотрицательна");
            return;
        }
        double distance;
        distance = s.nextDouble();
        if (distance<0) {
            System.out.println("Расстояние должно быть неотрицательно");
            return;
        }
        double time;
        time = distance/(velocity1+velocity2);
        System.out.printf("%.4f", time);

    }
}
