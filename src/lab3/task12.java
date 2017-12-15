package lab3;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       String x = s.nextLine();
        String S = "a\nb\nd\ne\nf\ng\nh";

        if (x == "a") {
            System.out.println("a+\nb\nd\ne\nf\ng\nh");

        }
        if (x == "b"){
            System.out.println("no");
        }
    }
}