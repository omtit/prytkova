package lab4;

import java.util.Scanner;

public class task39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int q  = s.nextInt();
        int r = Math.abs((q - p)/2);
        int c = r+ Math.min(p,q);
        if (p<q) {while (p<=q){
            if (p<c) {
                System.out.print(p+"<");
            }
            else{
                if (p==q) {
                    System.out.print(p);
                    return;
                }
                System.out.print(p+">");
            }

            p++;
        }}
        else {while (q<=p){
            if (q<c) {
                System.out.print(q+"<");
            }
            else{
                if (p==q) {
                    System.out.print(q);
                    return;
                }
                System.out.print(q+">");
            }

           q++;
        }}
    }
}
