package lab2;

import java.util.Scanner;

public class task19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int initialVelocity;
        initialVelocity = s.nextInt();
        if (initialVelocity < 0) {
            System.out.println("Начальная скорость должно быть неотрицательна");
            return;
        }
        double time;
        time = s.nextInt();
        if (time <=0) {
            System.out.println("Время должно быть положительным");
            return;
        }
        int acceleration;
        acceleration = s.nextInt();
        double distance;
        distance = initialVelocity*time+(acceleration*Math.pow(time,2))/2;
        System.out.printf("%.2f", distance);
    }
}
