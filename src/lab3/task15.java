package lab3;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        boolean error = false;
        if (a<0) {
            System.out.println("Значение A должно быть неотрицательным");
            error = true;
        }
        if (b<0)  {
            System.out.println("Значение B должно быть неотрицательным");
            error= true;
        }
        if (c<0) {
            System.out.println("Значение C должно быть неотрицательным");
            error = true;
        }
        if (error == true) {
            return;
        }
        if ( a==b || b==c|| a==c){
            System.out.println("Треугольник является равнобедренным.");
        }
        else {
            System.out.println("Треугольник не является равнобедренным.");
        }
    }
}
