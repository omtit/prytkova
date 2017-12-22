package lab4;


import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double r = 1;
        double sum = 0;
        if (n<=0) {
            System.out.println("Значение N должно быть положительным");
            return;
        }
        while (r<=n) {
            sum = sum+1/r;
            r++;


        }
        System.out.printf("%.4f",sum);
    }
}
