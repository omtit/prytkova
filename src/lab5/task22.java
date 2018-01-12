package lab5;

import java.util.Scanner;
import java.util.Arrays;
public class task22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String [] arr = data.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
