package lab2;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edge;
        edge = s.nextInt();
        if (edge <=0){
            System.out.println("Значение edge должно быть положительным");
            return;
        }
        double area;
        area = 6 * Math.pow(edge,2);
        System.out.printf("%.0f", area);
    }
}
