package lab2;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass;
        double velocity;
        double height;
        mass = s.nextDouble();
        velocity = s.nextDouble();
        height = s.nextDouble();
        if (mass<0){
            System.out.println("Значение mass должно быть положительным");
            return;
        }
        if (velocity<0){
            System.out.println("Значение velocity должно быть положительным");
            return;
        }
        if (height<0){
            System.out.println("Значение height должно быть положительным");
            return;
        }
        double kineticEnergy;
        kineticEnergy = (mass*Math.pow(velocity,2))/2;
        double g = 9.8067;
        double potentialEnergy;
        potentialEnergy = mass*g*height;
        System.out.printf("Кинетическая энергия составляет: %.4f Дж\n Потенциальная энергия составляет: %.4f Дж", kineticEnergy, potentialEnergy);
    }

}
