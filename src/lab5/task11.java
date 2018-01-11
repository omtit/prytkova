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
        if ("".equals(a)) {
            System.out.println("Данные сверху отсутствуют");
            return;
        }
        if ("".equals(b)) {
            System.out.println("Данные слева отсутствуют");
            return;
        }
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
            System.out.println(" |");
        }
        System.out.print("  ");
        for (int n = 0; n < top.length; n++) {
            System.out.print("--");
        }

    }
}
