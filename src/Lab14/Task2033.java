package Lab14;

import Lab14.task2033.Circle;
import Lab14.task2033.Rectangle;
import Lab14.task2033.Shape;
import Lab14.task3567.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2033 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {
            String filename = "res/task2033/test" + i + ".csv";

            File target = new File(filename);
            System.out.println("Открываем файл " + target.getAbsolutePath());

            List<Lab14.task2033.Circle> n1 = new ArrayList<>();
            List<Rectangle> n2 = new ArrayList<>();
            List<Shape> n3 = new ArrayList<>();
            try {
                Scanner s = new Scanner(target);
                String line;
                while (s.hasNext()) {
                    line = s.nextLine();
                    String[] str = line.split(";");


                    if (str[0].equals("create")) {
                        if (str[1].equals("circle")) {
                            int x = Integer.parseInt(str[3]);
                            int y = Integer.parseInt(str[4]);
                            int r = Integer.parseInt(str[5]);
                            Circle circle = new Circle(str[2], x, y, r);

                            n3.add(circle);
                        }
                        if (str[1].equals("rectangle")) {
                            int x = Integer.parseInt(str[3]);
                            int y = Integer.parseInt(str[4]);
                            int w = Integer.parseInt(str[5]);
                            int h = Integer.parseInt(str[6]);
                            Rectangle rectangle = new Rectangle(str[2], x, y, w, h);

                            n3.add(rectangle);
                        }
                    } else {

                        String action = str[0];
                        int value = Integer.parseInt(str[2]);
                        boolean contains = false;
                        for (Shape item : n3) {
                            if (item.c.equals(str[1])) {
                                contains = true;
                                if (action.equals("shiftX")) {
                                    item.shiftX(value);
                                } else if (action.equals("shiftY")) {
                                   item.shiftY(value);
                                } else if (action.equals("stretchX")) {
                                    item.stretchX(value);
                                } else if (action.equals("stretchY")) {
                                    item.stretchY(value);
                                }
                            }
                        }

//                        for (int i = 0; i < n2.size(); i++) {
//                            Rectangle item = n2.get(i);
//                        }
                        for (Rectangle item : n2) {
                            if (item.c.equals(str[1])) {
                                contains = true;
                                if (action.equals("shiftX")) {
                                    item.shiftX(value);
                                } else if (action.equals("shiftY")) {
                                    item.shiftY(value);
                                } else if (action.equals("stretchX")) {
                                    item.stretchX(value);
                                } else if (action.equals("stretchY")) {
                                    item.stretchY(value);
                                }
                            }
                        }
                    }


                }

                s.close();
                String description;
                for (Circle item : n1){
                    String r = item.c + "Действий: "+ item.count;
                    System.out.println(r);  description = "<p>"+r+"</p>" +
                            "<p>Результат:</p>";

                }
                for (Rectangle item : n2){
                    String r = item.c + "Действий: "+ item.count;
                    System.out.println(r);  description = "<p>"+r+"</p>" +
                            "<p>Результат:</p>";

                }
               // Utils.writeToHtml(filename + ".html", 500, 350, description, example.toString() + circle.toString());




            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует" + target.getAbsolutePath());
            } catch (NumberFormatException e) {
                System.out.println(" не удается считать число");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            i++;
        }


    }
}
