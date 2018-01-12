package lab5;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int x = s.nextInt();
        int y = s.nextInt();
        String [] arr = data.split(" ");
        int [] arr1 = new int [arr.length];
        for (int i = 0; i!=arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for (int z = 0; z<arr1.length; z++) {
            if (arr1[z]==x) {
                arr1[z]=y;
            }
            System.out.print(arr1[z]+" ");
            }

    }
}
