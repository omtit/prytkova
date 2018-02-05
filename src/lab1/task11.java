package lab1;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fill = s.nextLine();
        int cx = s.nextInt();
        int cy = s.nextInt();
        int r = s.nextInt();

        System.out.println("<circle cx=\""+cx+"\" cy=\""+cy+"\"\n" +
                "r=\""+r+"\" fill=\""+fill+"\"/>");
    }
}
