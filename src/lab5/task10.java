package lab5;


import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        String[] arr = "11;13;17;19;10;12;14;15;16;18;20".split(";");

        int i = 0;
        while (i < arr.length) {
            int a = Integer.parseInt(arr[i]);
            if (x==a) {
                System.out.println(arr[i] + "+");
            } else {
                System.out.println(arr[i]);

            }
            i++;
        }
    }
}


