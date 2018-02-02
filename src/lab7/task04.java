package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class task04 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            String filename = "res/task4642/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                if (!s.hasNext()) {
                    System.out.println("Файл пуст");

                }
               // if (s.hasNext()) {
               //     line = s.nextLine();
               //     System.out.print(line);
               // }
                int z = 0;
                while (s.hasNext()) {
                    line = s.nextLine();
                    String[] arr = line.split(" ");
                    Arrays.sort(arr);
                    //String str = Arrays.toString(arr);
                    //str.trim());

boolean error = false;
                    int count= 0;
                    if (arr[i].isEmpty()){
                        error=true;

                    }
                    if (error=false){
                        count++;}

                  System.out.println(count);


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

