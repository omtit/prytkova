package lab6;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.01.2018.
 */
public class task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r ="abcdefwxyz";
        int ca = s.nextInt();
        int cb = s.nextInt();
        String str = r.substring(ca, cb+1);
        System.out.println(str);
    }
}
