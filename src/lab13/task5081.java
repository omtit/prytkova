package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task5081 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 8) {
            String filename = "res/task5081/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                while (s.hasNext()) {
                    String result = line(s);
                    System.out.println(result);

                }
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует " + target.getAbsolutePath());
            } catch (InputMismatchException e) {
                System.out.println("Не удается считать число");
            } catch (NumberFormatException e) {
                System.out.println("не удается считать число");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            i++;
        }
    }

    public static String line(Scanner s) throws Exception {
        int res;
        String out = null;
        if (s.hasNext()) {
            String data = s.nextLine();
            res = summ(data);
            out =Integer.toString(res);


//            }
            return out;
        } else {
            throw new Exception("Файл пуст");
        }
    }

    public static int summ(String data) throws Exception {

        String[] mass = data.split(",");
//        if (mass.length != 4) {
//            throw new Exception("некорректный формат данных");
//        }
        int sum = 0;
        int[] mass1 = new int[mass.length];
        for (int i = 0; i < mass.length; i++) {
            int a = Integer.parseInt(mass[i]);
            mass1[i] = a;
            sum = mass1[i] + sum;
        }
        return sum;
    }
}

