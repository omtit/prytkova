package lab2;

import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double h;
        h = s.nextDouble();
        if (h<0){
            System.out.println("Высота над уровнем Земли должна быть неотрицательна");
            return;
        }
        double r =6350;
        double result;
        result = Math.sqrt(h*(2*r+h));
        System.out.printf("%.4f", result);
    }
}
