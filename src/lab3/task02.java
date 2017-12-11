package lab3;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int P;
        int Q;
        P = s.nextInt();
        Q =s.nextInt();
        if (P>Q){
            System.out.println("Максимальное "+P+ " Минимальное "+ Q);
        } else{
            System.out.println("Максимальное "+Q+ " Минимальное " +P);
        }
    }
}
