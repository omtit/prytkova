package lab6;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.length()!=13){
            System.out.println("Некорректная длина штрих-кода");
            return;
        }
        System.out.println("Код страны: "+str.substring(0,2));
        System.out.println("Код изготовителя: "+ str.substring(3,6));
        System.out.println("Код товара: "+str.substring(7,11));
        System.out.println("Контрольное число: "+str.substring(12));
    }
}
