package lab3;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double shipInKmH = s.nextDouble();
        double cometInMS = s.nextDouble();
        if (shipInKmH<0) {
            System.out.println("Скорость корабля должна быть неотрицательна");
        }
        if (cometInMS<0) {
            System.out.println("Скорость кометы должна быть неотрицательна");
        }
        if (shipInKmH*1000/3600> cometInMS){
            System.out.println("Корабль догонит комету. Скорость кометы "+cometInMS+" м/с меньше скорости корабля "+shipInKmH+"км/ч" );
        } else{
            System.out.println("Комета улетит от корабля. Скорость корабля "+shipInKmH+" км/ч меньше скорости кометы "+cometInMS + "м/с");
        }
    }
}
