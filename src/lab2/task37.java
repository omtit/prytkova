package lab2;

import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double volume1;
        volume1=s.nextDouble();
                double temperature1;
        temperature1=s.nextDouble();
        double volume2;
        volume2=s.nextDouble();
        double temperature2;
        temperature2=s.nextDouble();
                if (volume1<0){
            System.out.println("Объем должен быть неотрицательным");
            return;
        }
        if (volume2<0){
            System.out.println("Объем должен быть неотрицательным");
            return;
        }
        double volume;
        volume = volume1+volume2;
        double temperature;
        temperature= (temperature1*volume1+temperature2*volume2)/volume;
        System.out.printf("%.4f\n%.4f",volume,temperature);
    }
}
