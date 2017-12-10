package lab2;

import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass1;
        mass1 = s.nextDouble();
        if (mass1<=0){
            System.out.println("Масса должна быть неотрицательной");
            return;
        }
        double mass2;
        mass2 = s.nextDouble();
        if (mass2<=0){
            System.out.println("Масса должна быть неотрицательной");
            return;
        }
        double distance;
        distance = s.nextDouble();
        if (distance<=0){
            System.out.println("Дистанция должна быть неотрицательной");
            return;
        }
        double g = 9.8067;
        double force;
        force =g*mass1*mass2/Math.pow(distance,2) ;
        System.out.printf("%.4f", force);
    }
}
