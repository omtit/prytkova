package lab5;


import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");

       for (int i=0; i<arr.length/2;i++){
           String t = arr[i]; // задали переменную где будем хранить первое значение
           arr[i]= arr[arr.length-i-1]; // из последней переносим в первую
           arr[arr.length-i-1]=t; // ставим в последнюю первую
        }
        System.out.print(String.join(" ", arr));
    }


}

