package lab5;

import java.util.Scanner;

/**
 * Created by adm on 05.01.2018.
 */
public class task01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int a = s.nextInt();

        if ("".equals(data)){
            System.out.println("Исходная строка пуста");
            return;
        }
        String[] arr = data.split(" "); // название масива
        if (a<0|| a>= arr.length){
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }

        System.out.println(arr[a]);
    }
}
