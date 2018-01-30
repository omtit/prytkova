package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        boolean error =false ;
        while (i <= 6) {
            String filename = "res/task4488/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                if (!s.hasNext()) {
                    System.out.println("Файл пуст");
                    error = true;

                }
                if (s.hasNext()) {
                    line = s.nextLine();
                    System.out.print(line);
                }
                count=0;
                while (s.hasNext()) {
                    line = s.nextLine();
                    count++;
                }
                if (error!=true){
                System.out.print(" " + count);}

                System.out.println();


                s.close();


            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует " + target.getAbsolutePath());


            }
            i++;
        }
    }
}

