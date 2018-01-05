package lab4;

import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int h = s.nextInt();
        if (w < 0) {
            System.out.println("Значение W должно быть неотрицательно");
            return;
        }
        if (w == 0) {
            return;
        }
        if (h < 0) {
            System.out.println("Значение H должно быть неотрицательно");
            return;
        }
        if (h == 0) {
            return;
        }

        for (int j= 0; j<h;j++){
        for (int i = w; i>j; i--) {
            System.out.print("+");
        }
        for (int z= 0; z<j;  z++){
            System.out.print("#");

        }
        System.out.println();}


}}
