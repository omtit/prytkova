package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class task05 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            String filename = "res/task9924/test" + i + ".csv";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());
            try {

               // Scanner s = new Scanner(target);
              //  String line;
                //Set<String> map = new HashSet<>();
                List<Point9924> strs;
                strs = new ArrayList<>();
                error(target,strs);
                //  while (s.hasNext()) {
                  //  line = s.nextLine();
                  //  String[] str = line.split(";");
                    //      String data = "{\"x\":" + str[0] + ",\"y\":" + str[1] + ",color:" + str[2] + "}";
//                    if (str.length > 3 || str.length < 3) {
//                        System.out.println("error");
//                        break;
//                    }
//                    Point9924 point9924 = new Point9924(str[0], str[1], str[2]);
//                    boolean contains = false;
//                    for (Point9924 item : strs) {
//                        if (item.equals(point9924)) {
//                            contains = true;
//                            break;
//                        }
//                    }
//                    if (!contains) {
//                        strs.add(point9924);
//                    }
////                    if (!strs.contains(point9924)) {
////                        strs.add(point9924);/                    }
//                }
                System.out.println(strs.stream().map(Point9924::toString).collect(Collectors.joining(",\n")));
             //   s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());
            }
            catch (NumberFormatException e){
                System.out.println(" не удается считать число");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }


            i++;
        }

    }
    public static void error(File target, List<Point9924> strs)throws Exception{
        Scanner s = new Scanner(target);
        String line;
        while (s.hasNext()) {
        line = s.nextLine();
        String[] str = line.split(";");
                if (str.length > 3 || str.length < 3) {
           throw new Exception("error");

       }
            Point9924 point9924 = new Point9924(str[0], str[1], str[2]);
                int str1= Integer.parseInt(str[0]);
            int str2= Integer.parseInt(str[1]);
            boolean contains = false;
            for (Point9924 item : strs) {
                if (item.equals(point9924)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                strs.add(point9924);
            }
//                    if (!strs.contains(point9924)) {
//                        strs.add(point9924);/                    }
        }
        s.close();
    }
}