package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by pro-31 on 07.02.2018.
 */
public class task1212 {
    public static void main(String[] args) {
        int i = 1;
        int min;
        while (i <= 9) {
            String filename = "res/task1212/test" + i + ".csv";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);

                int result = max(s);
                System.out.println(result);
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());
            } catch (InputMismatchException e) {
                System.out.println("Не удается считать число");
            }catch (NumberFormatException e){
                System.out.println("не удается считать число");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            i++;
        }
    }

    public static int max(Scanner s) throws Exception {
        int max;
        if (s.hasNext()) {
            String data = s.nextLine();
            max = oks(data);
            while (s.hasNext()) {
                data = s.nextLine();
                int result = oks(data);


                if (max < result) {
                    max = result;
                }
            }
            return max;
        } else {
            throw new Exception("Файл пуст");
        }
    }

    public static int oks(String data) throws Exception {

        String[] mass = data.split(";");
        if (mass.length != 4) {
            throw new Exception("некорректный формат данных");
        }
        int[] mass1 = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            int a = Integer.parseInt(mass[i]);
            mass1[i] = a;
        }
        int S = mass1[2] * mass1[3];
        return S;
    }
}
