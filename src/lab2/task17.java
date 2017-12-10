package lab2;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int velocity1;
        velocity1 = s.nextInt();
        if (velocity1<0) {
            System.out.println("Скорость должна быть неотрицательна");
            return;
        }
        int velocity2;
        velocity2 = s.nextInt();
        if (velocity2<0) {
            System.out.println("Скорость должна быть неотрицательна");
            return;
        }
        int distance;
        distance = s.nextInt();
        if (distance<0) {
            System.out.println("Расстояние должно быть неотрицательно");
            return;
        }
        double time;
        time = distance/(velocity1+velocity2);
        System.out.printf("%.4f", time);

    }
}
