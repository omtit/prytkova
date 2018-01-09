package lab5;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int n = s.nextInt();


        String[] b = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + n >= arr.length) {
                b[i + n - arr.length] = arr[i];
            } else {
                b[i + n] = arr[i];
            }
        }
        for (String i : b) {
            System.out.print(i+" ");
        }


    }
}