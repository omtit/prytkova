package lab6;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.01.2018.
 */
public class task04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "abcdacadbacdaabaadc";
        String n = s.nextLine();

        if (n.length()!=2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        int i = str.indexOf(n);
        int z = str.indexOf(n, i+1);
        if (i == -1) {
            System.out.println("Значение отсутствует в строке");
            return;
        }
        if (z<0){
            System.out.println(i);
        } else{
        System.out.println(i + " "+ z);

    }
}}
