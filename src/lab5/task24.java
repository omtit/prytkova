package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String [] arr = data.split(" ");
        int [] result = new int [arr.length];
        int count =0;
        for (int i =0; i!=arr.length; i++) {
            String t = arr[i];
            for (int j=0; j< arr.length; j++)
            if (t.equals(arr[j])){
                count++;
            }
            result [i] =count;
            System.out.print(result[i]+" ");
            count=0;
        }

        System.out.println(Arrays.toString(result));
    }
}
