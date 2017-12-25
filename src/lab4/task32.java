package lab4;

import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String p = s.nextLine();
    int w = s.nextInt();
    int h = s.nextInt();
    if (w<0) {
        System.out.println("Значение W должно быть неотрицательно");
        return;
    }
    if (h<0) {
        System.out.println("Значение H должно быть неотрицательно");
        return;
    }


    for (int n = 1; n<=h; n++) {

        for (int i = 1; i <= w; i++) {
            System.out.print(p);
        }
        System.out.print("\n");

    }
    }}
