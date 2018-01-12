package lab5;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        int[] mass = new int[arr.length];
        for (int i = 0; i != arr.length; i++) {
            mass[i] = Integer.parseInt(arr[i]);
        }

        System.out.println("Ход решения:");
        int min = mass[0];
        System.out.println("Начинаю с " + min);
        int z = 0;
        while (z != mass.length) {
            System.out.println("сравниваю " + min + " и " + mass[z]);
            if (min > mass[z]) {
                System.out.println("Заменяю");
                min = mass[z];
            }
            z++;
        }

        System.out.println("Ответ " + min);

    }
}
