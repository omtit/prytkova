package lab3;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double roadInKm = s.nextDouble();
        double lenghtInFeet= s.nextDouble();
        if (roadInKm<0){
            System.out.println("Расстояние между деревнями должно быть неотрицательно");
            return;
        }
        if (lenghtInFeet<0){
            System.out.println("Длина кабеля должна быть неотрицательна");
            return;
        }

        if (roadInKm*1000<lenghtInFeet*0.305){
            System.out.println("Кабеля хватит. Расстояние меньше длины кабеля.");
                    }else{
            System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния.");
        }
    }
}
