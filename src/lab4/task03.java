package lab4;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        if (A>B){
            System.out.println("Значение A должно быть не больше значения B");
            return;}
        while (A<=B){
            System.out.println(A);
            A=A+1;
        }
    }
}
