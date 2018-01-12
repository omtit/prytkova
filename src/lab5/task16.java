package lab5;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data1 = s.nextLine();
        String data2 = s.nextLine();

        String[] left = data1.split(" ");
        String[] right = data2.split(" ");
        if (left.length != right.length) {
            System.out.println("Размеры массивов должны быть одинаковы");
            return;
        }

        int[] left1 = new int[left.length];
        int[] right1 = new int[right.length];
        int[] result = new int[left.length];
        int i = 0;
        int z = 0;
        int j = 0;
        while (i < left.length) {

            left1[i] = Integer.parseInt(left[i]);
            right1[z] = Integer.parseInt(right[z]);
            result[j] = left1[i] * right1[z];
            System.out.print(result[j] + " ");
            i++;
            z++;
            j++;

        }


    }
}