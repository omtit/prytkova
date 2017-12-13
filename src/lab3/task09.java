package lab3;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Sc = s.nextInt();
        int Ss = s.nextInt();
        boolean error = false;
        if (Sc<0) {
            System.out.println("Площадь круга должна быть положительной");
            error = true;
        }
        if (Ss<0) {
            System.out.println("Площадь квадрата должна быть положительной");
            error = true;
        }
        if (error == true) {
              return;
        }
        if (2*Math.sqrt(Sc/Math.PI)<= Math.sqrt(Ss)) {
            System.out.println("Круг уместится в квадрате");
            } else {
            System.out.println("Круг не поместится в квадрате");
        }


        }
    }
