package lab5;

import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int k = s.nextInt();
        int count=0;
        String [] arr = data.split(" ");
        int [] arr1 = new int[arr.length];
        for ( int i = 0; i!=arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
            if (arr1[i]==k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
