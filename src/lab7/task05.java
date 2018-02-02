package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-31 on 02.02.2018.
 */
public class task05 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            String filename = "res/task5537/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                if (!s.hasNext()) {
                    System.out.println("Файл пуст");

                }

// char c1 = line.charAt(0);
           //     char c2 = line.charAt();
//
         //       char[] arr = word.toCharArray[];
          //      char cc1 = arr[0];



                s.close();


            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());


            }
            i++;
        }
    }
}
