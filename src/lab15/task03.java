package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task03 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6) {
            String filename = "res/task9990/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                Set<String> strs = new HashSet<>();
                while(s.hasNext()) {
                    strs.add(s.nextLine());
                }
                System.out.println(String.join(",",strs));


                s.close();


            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());


            }
            i++;
        }
    }
    }

