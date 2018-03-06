package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class task05 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            String filename = "res/task9924/test" + i + ".csv";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {
                Scanner s = new Scanner(target);
                String line;
                //Set<String> map = new HashSet<>();
                while (s.hasNext()) {
                    line = s.nextLine();
                    String[] str = line.split(";");
                    System.out.println("{\"x\":" + str[0] + ",\"y\":" + str[1]+",color:"+str[2]+"}");

                   /* if (map.containsKey(line)) {
                        map.put(line, map.get(line) + 1);
                    } else {
                        map.put(line, 1);
                    }*/
//                }
//                for (Map.Entry<String, Integer> item : map.entrySet()) {
//                    System.out.println(item.getKey() + " " + item.getValue());
//                }


                    s.close();


                    //}

                }
                i++;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());


            }
        }

    }
}