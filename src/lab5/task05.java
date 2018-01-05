package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int p = s.nextInt();
        int q = s.nextInt();
        String[] arr= data.split(" ");
        if (p<0|| p>=arr.length){
            System.out.println("Число P должно быть в интервале [0, размер массива)");
            return;
        }

        if (q<0|| q>= arr.length){
            System.out.println("Число Q должно быть в интервале [0, размер массива)");
            return;
        }

        String t = arr[q];
        arr [q] = arr [p];
        arr[p]=t;
        int i = 0;
        while (i<arr.length){
            System.out.println(arr[i]+" "+i);
            i++;
        }

    }
}
