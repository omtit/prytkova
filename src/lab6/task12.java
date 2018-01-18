package lab6;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count =1;
        for (int i = 1; i<str.length(); i++){
            if (str.charAt(i) == ','){
                count++;
            }
        }
        System.out.println(count);
    }
}
