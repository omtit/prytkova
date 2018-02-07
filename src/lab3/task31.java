package lab3;

import java.util.Scanner;

public class task31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A1 = s.nextInt();
        int B1 = s.nextInt();
        int A2 = s.nextInt();
        int B2 = s.nextInt();
        if (A1>=B1 || A2>=B2) {
            System.out.println("Значение A должно быть меньше значения B");
            return;
        }
        if (A1<A2 && B1<B2){
            System.out.println("пересекаются ("+A2+";"+B1+")");
            return;
    }
    if (A1<A2 && B2<B1){
        System.out.println("пересекаются ("+A2+";"+B2+")");
        return;

    }
    if (A2<A1 && B2<B1){
        System.out.println("пересекаются ("+A1+";"+B2+")");
        return;
    }
    if (A2<A1 && B1<B2){
        System.out.println("пересекаются ("+A1+";"+B1+")");
        return;
    }

        System.out.println("не пересекаются");

    }
}
