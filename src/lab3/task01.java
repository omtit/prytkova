package lab3;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int b;
        b = s.nextInt();
        if (a>b){
            System.out.println("Первое");
        } else{
            System.out.println("второе");
        }
    }
}
