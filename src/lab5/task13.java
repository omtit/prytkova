package lab5;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            String n = arr[i];
            for (int z = 0; z < arr.length; z++) {
                //String t = arr[z];

                if (n.equals(arr[z] )&& z!=i) {
                    count++;
                }
            }
            i++;
        }
        System.out.println("Повторений: " + count);


    }
    //    System.out.println(" повторений нет");
}

