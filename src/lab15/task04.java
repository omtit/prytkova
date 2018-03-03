package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class task04 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            String filename = "res/task7738/test" + i + ".txt";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                Map<String, Integer> map = new HashMap<>();
//                map.put("сталь", 0);
//                map.put( "медь", 1);
                while (s.hasNext()) {
                    line = s.nextLine();

                    if (map.containsKey(line)) {
                        map.put(line, map.get(line) + 1);
                    } else {
                        map.put(line, 1);
                    }
                }
                for (Map.Entry<String, Integer> item : map.entrySet()) {
                    System.out.println(item.getKey() + " " + item.getValue());
                }





                s.close();


            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());


            }
            i++;
        }
    }
}

