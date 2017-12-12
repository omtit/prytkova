package lab3;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius;
        double edge;
        radius = s.nextDouble();
        edge = s.nextDouble();
        boolean error = false;
        if (radius<0){
            System.out.println("Радиус должен быть положительным");
            error = true;
        }
        if (edge<0) {
            System.out.println("Сторона квадрата должна быть положительна");
            error = true;
        }
        if (error == true){
        return;}
        double Sr = Math.PI*Math.pow(radius, 2);
        double Se= Math.pow(edge,2);
        if ( Sr<Se ){
            System.out.printf("Площадь квадрата %.4f больше площади круга %.4f",Se, Sr);
        } else {
            System.out.printf("Площадь круга %.4f больше площади квадрата %.4f" ,Sr, Se);
        }
    }
}
