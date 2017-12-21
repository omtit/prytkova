package lab4;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int r = 0;
if (a<b){
        while (a <= b) {

            r = a + r;
            a++;
        }
        System.out.println(r);}
        else {
        while (b<=a) {
            r=b+r;
          b++;
        }
       System.out.println(r);}
    }
}
