package lab2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextDouble();
        if (x<0){
            System.out.println("Значение X должно быть неотрицательным");
            return;
        }
        double result;
        result = Math.sqrt(x);
        System.out.printf("%.4f" , result);

    }
}
