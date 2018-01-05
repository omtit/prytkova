package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String [] arr= data.split(" ");
       // String t = arr[5];
      //  arr [5] = arr[4];
       // arr[4]=arr[3];
       // arr[3]= arr[2];
       // arr[2]=arr[1];
       // arr[1]=arr[0];

      //  arr[0]=t;



         int i =arr.length-1; // последняя ндекс в массиве
        String t = arr[i];
        while (i>0){
            arr[i]=arr[i-1];

           // System.out.print(i +" ");
            i--;

        }
                arr[0]=t;
        System.out.println(String.join(" ", arr));
    }
}
