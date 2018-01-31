package lab8;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        String data = "res/task9300/data1.txt";

        File target = new File(data);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            int i =0;
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] mass = line.split(";");
                //s.close();
                String cx = mass[0];
                String cy = mass[1];
                String r = mass[2];
                String sw = mass[3];
                int r1 = Integer.parseInt(r);
                int cx1= Integer.parseInt(cx);
                int cy1 = Integer.parseInt(cy);
                int sw1 = Integer.parseInt(sw);
                boolean error = false;
                if(r1>cx1||r1>cy1){
                    System.out.println("Левая точка круга должна иметь неотрицательные координаты");
                    error = true;

                }
                if (sw1>r1*2) {
                    System.out.println("Толщина обводки должна быть меньше диаметра круга");
                    error=true;
                }
                if (cx1>800) {
                    System.out.println("Правая точка круга должна быть в пределах рисунка");
                    error=true;
                }
                if (cy1>600) {
                    System.out.println("Нижняя точка круга должна быть в пределах рисунка");
                    error= true;
                }
                if (error!=true ){

                String filename = "out/task1"+i+".html";

                PrintWriter writer = new PrintWriter(new File(filename));
                writer.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n" +
                        "<body>\n" +
                        "<h1>Мой первый векторный рисунок</h1>\n" +
                        "\n" +
                        "<svg width=\"800\" height=\"600\">\n" +
                        "\t<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + r + "\" stroke=\"green\" stroke-width=\"" + sw + "\" fill=\"yellow\" />\n" +
                        "</svg>\n" +
                        "</body>\n" +
                        "</html>");
                writer.close();

                Desktop.getDesktop().open(new File(filename));
                i++;
            }}
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
