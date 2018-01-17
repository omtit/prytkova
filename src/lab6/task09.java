package lab6;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
       // char n = str.charAt(0);
       // String n1= char[] toCharArray(n);
        if (str.indexOf("s")==0){
            System.out.println(str.toLowerCase());

        }
        else if (str.indexOf("U")==0) {
            System.out.println(str.toUpperCase());
        }
        else{System.out.println(str);}
    }
}
