package lab8;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        String data = "res/task7343/file.txt";

        File target = new File(data);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            int i = 0;
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] mass = line.split(";");

                String x = mass[0];
                String y = mass[1];
                String w = mass[2];
                String h = mass[3];
                String r = mass[4];
                int r1 = Integer.parseInt(r);
                int cx1 = Integer.parseInt(x);
                int cy1 = Integer.parseInt(y);
                int sw1 = Integer.parseInt(w);
                int h1 = Integer.parseInt(h);
                int x1 = cx1 + sw1;
                String x2 = Integer.toString(x1);
                int y1 = cy1 + h1;
                String y2 = Integer.toString(y1);
                //  boolean error = false;
                ///  if (r1 > cx1 || r1 > cy1) {
                //    System.out.println("Левая точка круга должна иметь неотрицательные координаты");
                //    error = true;

                //}
                /// if (sw1 > r1 * 2) {
                //    System.out.println("Толщина обводки должна быть меньше диаметра круга");
                //    error = true;
                //}
                /// if (cx1 > 800) {
                //    System.out.println("Правая точка круга должна быть в пределах рисунка");
                //    error = true;
                //}
                ///  if (cy1 > 600) {
                //    System.out.println("Нижняя точка круга должна быть в пределах рисунка");
                //    error = true;
                //}
                //if (!error) {

                String filename = "out/task1" + i + ".html";

                PrintWriter writer = new PrintWriter(new File(filename));
                writer.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n" +
                        "<body>\n" +
                        "<h1>Мой 3 векторный рисунок</h1>\n" +
                        "\n" +
                        "<svg width=\"800\" height=\"600\">\n" +
                        "\t<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + w + "\" height=\"" + h + "\" fill=\"red\" opacity=\"0.5\" />\n" +
                        "\t<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"yellow\"opacity=\"0.5\" />\n" +
                        "\t<circle cx=\"" + x2 + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"yellow\"opacity=\"0.5\" />\n" +
                        "\t<circle cx=\"" + x + "\" cy=\"" + y2 + "\" r=\"" + r + "\" fill=\"yellow\"opacity=\"0.5\" />\n" +
                        "\t<circle cx=\"" + x2 + "\" cy=\"" + y2 + "\" r=\"" + r + "\" fill=\"yellow\"opacity=\"0.5\" />\n" +
                        "</svg>\n" +
                        "</body>\n" +
                        "</html>");
                writer.close();

                Desktop.getDesktop().open(new File(filename));
                i++;
            }
            // }
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

