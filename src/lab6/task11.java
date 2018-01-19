package lab6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length() - 1;
        if (str.charAt(0) != '"' || str.charAt(n) != '"') {
            System.out.println("error");
            return;
        }

        //  String str1 = str.replaceFirst("\"", " ");
        //  char ch3 = str1.charAt(n);
        String str1 = str.replaceFirst("\"", " ");

        char last = str1.charAt(str1.length() - 1);
        char newone = str1.charAt(0);
        String str2 = str1.replace(last, newone);


        System.out.println(str1.substring(0,str1.length()-1).trim()); // удаляет пробелы в начаде и конце
    }
}
