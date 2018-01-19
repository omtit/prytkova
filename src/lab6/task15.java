package lab6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i = 0;
        int count1 = 0;
        while (i != -1) {
            int x = str.indexOf("{", i);
            int y = str.indexOf("}", i);
            if (x != -1 && y == -1) {
                count1++;
                System.out.print(count1);
            }
            if (x != -1 && y != -1) {
                if (x < y) {
                    count1++;
                    System.out.print(count1);
                } else {
                    count1--;
                    System.out.print(count1);
                }

            }
            if (x==-1 && y!=-1){
                count1--;
                System.out.print(count1);
            }
            i++;

        }
    }
}
