package lab1;
import java.util.Scanner;
public class task09 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        System.out.println("SELECT first_name, last_name, group\n" +
                "FROM students WHERE student_id = '" + a + "';");
    }
    }
