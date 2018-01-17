package lab6;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.01.2018.
 */
public class task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r ="abcdefwxyz";
        String w = s.nextLine();
        boolean fact = r.contains(w);
        if (fact) {
            System.out.println("Содержится");
        } else {
            System.out.println("Не содержится");
        }
    }
}
