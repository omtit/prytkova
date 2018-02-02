package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(System.in);
        String A = s1.nextLine();
        int count = 0;
        int i = 1;

        String filename = "res/task4954/test1.txt";

        File target = new File(filename);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            String line;
            if (!s.hasNext()) {
                System.out.println("Файл пуст");

            }
             while (s.hasNext()) {

                line = s.nextLine();
                String str = line;
                boolean fact = str.contains(A);
                if (fact) {
                    count++;
                }


            }
            System.out.println(count);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует " + target.getAbsolutePath());


        }

        String B = s1.nextLine();
        count =0;
        String filename1 = "res/task4954/test2.txt";

        File target1 = new File(filename1);
        System.out.println("Открываем файл " + target1.getAbsolutePath());
        try {
            Scanner s = new Scanner(target1);
            String line;
            if (!s.hasNext()) {
                System.out.println("Файл пуст");

            }
            while (s.hasNext()) {

                line = s.nextLine();
                String str = line;
                boolean fact = str.contains(B);
                if (fact) {
                    count++;
                }

            }
            System.out.println(count);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует " + target1.getAbsolutePath());


        }
        String С = s1.nextLine();
        count =0;
        String filename2 = "res/task4954/test3.txt";

        File target2 = new File(filename2);
        System.out.println("Открываем файл " + target2.getAbsolutePath());
        try {
            Scanner s = new Scanner(target2);
            String line;
            if (!s.hasNext()) {
                System.out.println("Файл пуст");

            }
            while (s.hasNext()) {

                line = s.nextLine();
                String str = line;
                boolean fact = str.contains(С);
                if (fact) {
                    count++;
                }

            }
            System.out.println(count);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует " + target2.getAbsolutePath());


        }
        String D = s1.nextLine();
        count =0;
        String filename3 = "res/task4954/test4.txt";

        File target3 = new File(filename3);
        System.out.println("Открываем файл " + target3.getAbsolutePath());
        try {
            Scanner s = new Scanner(target3);
            String line;
            if (!s.hasNext()) {
                System.out.println("Файл пуст");

            }
            while (s.hasNext()) {

                line = s.nextLine();
                String str = line;
                boolean fact = str.contains(D);
                if (fact) {
                    count++;
                }

            }
            System.out.println(count);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует " + target3.getAbsolutePath());


        }
        String E = s1.nextLine();
        count =0;
        String filename4 = "res/task4954/test5.txt";

        File target4 = new File(filename4);
        System.out.println("Открываем файл " + target4.getAbsolutePath());
        try {
            Scanner s = new Scanner(target4);
            String line;
            if (!s.hasNext()) {
                System.out.println("Файл пуст");

            }
            while (s.hasNext()) {

                line = s.nextLine();
                String str = line;
                boolean fact = str.contains(E);
                if (fact) {
                    count++;
                }

            }
            System.out.println(count);
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует " + target4.getAbsolutePath());


        }

    }
}
