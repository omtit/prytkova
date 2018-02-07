package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pro-31 on 07.02.2018.
 */


public class task6882 {
    public static void main(String[] args) {
        int i = 1;
        int min;
        while (i <= 8) {
            String filename = "res/task6882/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                int a;
                int result = min(s);
                System.out.println(result);
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());
            } catch (InputMismatchException e) {
                System.out.println("Не удается считать число");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            i++;
        }
    }

    public static int min(Scanner s) throws Exception {
        int min;
        if (s.hasNext()) {
            min = s.nextInt();
            while (s.hasNext()) {
                int b = s.nextInt();
                if (min > b) {
                    min = b;
                }
            }
            return min;
        } else {
            throw new Exception("Файл пуст");
        }

    }
}