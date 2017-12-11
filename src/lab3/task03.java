package lab3;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int K;
        K= s.nextInt();
        double r;
        if (K>0){
            r=Math.sqrt(K);
        } else {
            r=K*K;
        }
        System.out.println(r);
    }

}
