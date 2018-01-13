package lab5;

import java.util.Scanner;

public class
task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String[] top = a.split(" ");
        String[] left = b.split(" ");
        if ("".equals(a)) {
            System.out.println("Данные сверху отсутствуют");
            return;
        }
        if ("".equals(b)) {
            System.out.println("Данные слева отсутствуют");
            return;
        }
        int i = 0;
        int z = 0;
        int count = 0;

        while (i < top.length) {
            String n = top[i];
            for (z = 0; z < left.length; z++) {
                String t = left[z];

                if (n.equals(t)) {
                    count++;
                }
            }
            i++;
        }
        System.out.println("Повторений: "+count);
    }
}


