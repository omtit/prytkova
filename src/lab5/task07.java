package lab5;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int n = s.nextInt();




        int i =arr.length-1; // последняя ндекс в массиве
        String t = arr[i];
        while (i>0){
            arr[i]=arr[i-n];


            // System.out.print(i +" ");
            i--;

        }

        arr[0]=t;
        System.out.println(String.join(" ", arr));
        }


}


