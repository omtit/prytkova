package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String[] top = a.split(" ");
        String[] left = b.split(" ");

        System.out.print("  ");
        System.out.println(String.join(" ", top));
        for (int j = 0; j < left.length; j++) {
            System.out.print(left[j]);
            for (int i = 0; i < top.length; i++) {
                if (top[i].equals(left[j])) {
                    System.out.print(" +");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }
    }
}
