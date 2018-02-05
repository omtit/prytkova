package lab2;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass;
        mass = s.nextDouble();
        if (mass<=0){
            System.out.println("Масса должна быть положительной");
            return;
        }
        double aInDeg;
        aInDeg = s.nextDouble();
        double g = 9.8067;
        double force;
        force =mass*g*Math.cos(aInDeg*Math.PI/180);
        if (force<=0){
            System.out.println("0");
            return;
        }
        System.out.printf("%f", force);
// если угол больше 90 градусов то 0
    }
}
