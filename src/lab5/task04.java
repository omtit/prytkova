package lab5;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int b = s.nextInt();
        int e = s.nextInt();
        if (b < 0 || b >= arr.length) {
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        if (e < 0 || e >= arr.length) {
            System.out.println("Число E должно быть в интервале [0, размер массива)");
            return;
        }
        if (b <= e) {
            for (int i = b; i <= arr.length; i++) {
                if (i <= e) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        if (e < b) {
            for (int i = e; i <= arr.length; i++) {

                if (i <= b) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
