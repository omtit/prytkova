package lab6;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str ="abcdacadbacdaabaadc";
        String x = s.nextLine();
        if (x.length()!=2) {
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }
        String newStr = str.replace(x, " ");
        System.out.println(newStr);
    }
}
