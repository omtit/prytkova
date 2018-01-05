package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        System.out.println(arr[0]  +" "+0 );
        System.out.println(arr[1]+1);
        System.out.println(arr[2]+2);
 int i = 0;
        while (i<arr.length){
            System.out.println(arr[i]+" "+i);
            i++;
        }
    }
}
