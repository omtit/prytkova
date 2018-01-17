package lab6;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r = "abcdefwxyz";
        int ca = s.nextInt();
        int cb = s.nextInt();
        if (ca<0|| ca>r.length()){
            System.out.println("Значение CA должно быть в интервале [0, длина строки)");
            return;
        }
        if (ca+cb>r.length())
        {
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }
        if (cb<0){
            System.out.println("Значение CB должно быть неотрицательно");
            return;
        }
        System.out.println(r.substring(0,ca)+ r.substring(ca+cb));

    }
}
