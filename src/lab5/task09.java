package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();

        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};

//arr= "a;b;c;d;e;f;g;h".split(";");
        int i = 0;
        while (i < arr.length) {

            if (x.equals(arr[i])) {
                System.out.println(arr[i] + "+");
            } else {
                System.out.println(arr[i]);

            }
i++;
        }
    }
}

