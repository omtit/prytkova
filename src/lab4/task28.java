package lab4;

import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 1;
        if (x<=0){
            System.out.println("Значение X должно быть положительным");
        }
        while (i<=x) {
            if (x%i==0) {
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}
