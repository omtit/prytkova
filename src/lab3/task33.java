package lab3;

import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if (t <0 || t> 59) {
            System.out.println("Значение T должно быть в интервале [0, 59]");
            return;
        }
        int r= t%5;
        if (r>=3){
            System.out.println("Красный");
        } else {
            System.out.println("зеленный");
        }
    }
}
