package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-27 on 13.01.2018.
 */
public class task01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            String filename = "res/task6175/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                if (!s.hasNext()){
                    System.out.println(" Файл пуст");
                }
                if (s.hasNext()){
                    line= s.nextLine();
                    System.out.print(line);
                }
                while (s.hasNext()) {

                    line = s.nextLine();
                    System.out.print(", "+line);

                }
                System.out.println();


                s.close();


            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());
            }
            i++;
        }
    }
}
