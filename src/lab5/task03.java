package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr= data.split(" ");
        int i = arr.length-1;
        while (i>=0){
        System.out.print(arr[i]+ " ");
        i--;}
    }
}
