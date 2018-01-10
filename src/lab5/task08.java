package lab5;


import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int i = arr.length-1;
        int n = 0;
        while (i > 0 && n > arr.length) {

            String t = arr[i];
            arr[i] = arr[n];
            arr[n] = t;
            i--;
            n++;
        }
        System.out.print(String.join(" ", arr));
    }


}

