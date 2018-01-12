package lab5;

import java.util.Scanner;

public class task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int p = s.nextInt();
        int q = s.nextInt();
        String [] arr = data.split(" ");
        if (p<0|| p>= arr.length){
            System.out.println("Число P должно быть в интервале [0, размер массива)");
            return;
        }
        if (q<0|| q>= arr.length){
            System.out.println("Число Q должно быть в интервале [0, размер массива)");
            return;
        }
        int [] arr1 = new int [arr.length];
        for (int i= 0; i!=arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int min = arr1[p];
        for (int z = p; z<=q; z++) {
            if (min>arr1[z]) {
                min= arr1[z];

            }
        }
        System.out.println(min);
    }
}
