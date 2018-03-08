package lab15;

import com.sun.javafx.collections.MappingChange;
import lab15.task7657.Point;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class task06 {

    public static void main(String[] args) {

        int incorrectPointsCount;
        int i = 1;
        while (i <= 7) {
            incorrectPointsCount = 0;
            String filename = "res/task7657/test" + i + ".csv";

            try {
                File target = new File(filename);
                System.out.println("Открываем файл " + target.getAbsolutePath());

                ArrayList<Point> pointsArray = new ArrayList<>();
                Set<Point> pointSet = new HashSet<>();

                incorrectPointsCount = scanFile(target, pointsArray);

                pointSet.addAll(pointsArray);

                for (Point currentPointSet : pointSet) {
                    for(Point currentPointInArray: pointsArray) {
                        if (currentPointSet.equals(currentPointInArray)) {
                            currentPointSet.incrementCountOfDuplicates();
                        }
                    }
                }

                for (Point currentPoint : pointSet) {
                    System.out.println(currentPoint.toString());
                }
                System.out.println("Некорректных записей: " + incorrectPointsCount);

            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует");
            }

            i++;
        }

    }

    private static int scanFile(File fileToScan, ArrayList<Point> pointsArray) throws FileNotFoundException {
        int incorrectCount = 0;
            Scanner s = new Scanner(fileToScan);
            String line;
            while (s.hasNext()) {
                line = s.nextLine();
                String[] str = line.split(";");
                if (str.length != 3) {
                    incorrectCount++;
                } else {

                    try {
                        int x = Integer.parseInt(str[0]);
                        int y = Integer.parseInt(str[1]);

                        Point currentPoint = new Point(x, y, str[2]);
                        pointsArray.add(currentPoint);
                    } catch (NumberFormatException e) {
                        incorrectCount++;
                    }
                }
            }
            s.close();
        return incorrectCount;
    }

//    public static void error(File target, Map<String, Integer> map)throws Exception{
//        Scanner s = new Scanner(target);
//        String line;
//        while (s.hasNext()) {
//            line = s.nextLine();
//            String[] str = line.split(";");
//            if (str.length > 3 || str.length < 3) {
//                throw new Exception("error");
//
//            }
//            Point task6 = new Point(str[0], str[1], str[2]);
//            int str1= Integer.parseInt(str[0]);
//            int str2= Integer.parseInt(str[1]);
//
//            if (map.containsKey(line)) {
//                map.put(line, map.get(line) + 1);
//            } else {
//                map.put(line, 1);
//            }
////            for (Map.Entry<String, Integer> item : map.entrySet()) {
////                System.out.println(item.getKey() + " " + item.getValue());
////            }
//
//        }
//        s.close();
//    }
}

