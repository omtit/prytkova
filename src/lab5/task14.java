package lab5;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int n = s.nextInt();
        if ("".equals(data)){
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] s1 = data.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i != s1.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
            a[i] = n * a[i];
            System.out.print(a[i]+" ");

        }
    }
}