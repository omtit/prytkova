package lab6;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String [] str1 = str.split(" ");
        String str2 = str.replaceFirst("\"", "[");
        String str3 = str2.replace("\"","]");
        System.out.println(str3);

    }
}
