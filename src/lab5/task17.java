package lab5;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int b = s.nextInt();
        String [] arr = data.split(" ");
        if (b<0|| b>= arr.length){
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        int [] arr1 = new int[arr.length];
        int i = 0;
        int count = 0;
        while (i!= arr.length) {
            arr1[i] = Integer.parseInt(arr[i]);
            if (arr1[i]<b) {
                count++;

            }
            i++;

        }
        System.out.println(count);
    }
}
