package lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task9472 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 8) {
            String filename = "res/task9472/test" + i + ".csv";
            File target = new File(filename);
            System.out.println("Открываем файл: " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                double result;
                result = max(s);
                System.out.println(result);

                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("файл не существует");

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
            i++;
        }
    }

    public static double sq(String data) throws Exception {
        double sq1;
        String[] mass = data.split(";");
        if (mass[0].equals("circle")) {
            if(mass.length!=4){
                throw new Exception("Некорректный формат данных");
            }
             int a = Integer.parseInt(mass[3]);
             sq1 = Math.PI * (a * a);
        }else

        if (mass[0].equals("rect")) {
            if (mass.length!=5){
                throw new Exception("Некорректный формат данных");
            }

               int c = Integer.parseInt(mass[3]);
            int b = Integer.parseInt(mass[4]);

             sq1 = c*b;

        }

        else{
            throw new Exception("Сообщение об ошибке");
        }

        return sq1;
    }


    public static double max(Scanner s) throws Exception {
        double max;
        if (s.hasNext()) {
            String data = s.nextLine();
            max = sq(data);
            while (s.hasNext()) {
                data = s.nextLine();
                double result = sq(data);


                if (max < result) {
                    max = result;
                }
            }
            return max;
        } else {
            throw new Exception("Файл пуст");
        }
    }


}
