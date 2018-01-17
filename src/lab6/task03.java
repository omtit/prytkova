package lab6;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r = "abcdefwxyz";
        String ca = s.nextLine();
        String cb = s.nextLine();

        int i = r.indexOf(ca);
        int z = r.indexOf(cb);
        int count = 0;
        if (i == -1) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (z == -1) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        if (i<z){
        while (i+1 < z) {
            i++;
            count++;

        }}
        if (i>z){
            while (z+1<i){
            count++;
            z++;
        }}


        System.out.println(count);
    }
}


