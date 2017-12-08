package lab2;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temperatureInC;
        temperatureInC = s.nextInt();
        if (temperatureInC < -273.15){
            System.out.println("Температура должна быть выше абсолютного нуля");
            return;
        }
        double temperatureInF;
        temperatureInF = temperatureInC *1.8+32;
        System.out.printf("%.5f",temperatureInF);


    }
}
