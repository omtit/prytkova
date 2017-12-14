package lab3;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if (1000<= A && A<=9999){

        }else {
            System.out.println("Значение A должно быть в интервале [1000, 9999]");
        }
    }
}
