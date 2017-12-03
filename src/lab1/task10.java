package lab1;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        String b;
        b = s.nextLine();
        System.out.println("INSERT INTO points (x, y) VALUES ('" + a + "', '" + b + "');");
        String c;
        c = s.nextLine();
        String d;
        d = s.nextLine();
        System.out.println("INSERT INTO points (x, y) VALUES ('" + c + "', '" + d + "');");
    }
    }
