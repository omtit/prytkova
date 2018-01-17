package lab6;

import java.util.Scanner;

/**
 * Created by pro-27 on 13.01.2018.
 */
public class task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r ="abcdefwxyz";
        String w = s.nextLine();
        int i = r.indexOf(w);
        if (i==-1){
            System.out.println("Значение отсутствует в строке");
            return;
        }
        int l =r.length();
        int result = (l -1)-i;
        System.out.println(result);
    }
}
