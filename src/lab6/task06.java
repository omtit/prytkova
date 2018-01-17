package lab6;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r = "abcdefwxyz";
        String ca = s.nextLine();
        String cb = s.nextLine();

        if (!r.contains(ca)){
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (!r.contains(cb)){
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        if (r.indexOf(ca) < r.indexOf(cb)) {
            String resultStr = r.substring(r.indexOf(ca) + 1, r.indexOf(cb));
            System.out.println(resultStr);

        } else {
            String resultStr = r.substring(r.indexOf(cb) + 1, r.indexOf(ca));
            System.out.println(resultStr);
        }
    }
}
