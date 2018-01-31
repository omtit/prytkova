package lab8;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        String data = "res/task3951/file.txt";

        File target = new File(data);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            int i =0;
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] mass = line.split(";");
                //s.close();
                String x = mass[0];
                String y = mass[1];
                String w = mass[2];
                String h = mass[3];
                int x1 = Integer.parseInt(x);
                int y1 = Integer.parseInt(y);
                int w1 = Integer.parseInt(w);
                int h1 = Integer.parseInt(h);
                boolean error = false;
                if(w1<=0){
                    System.out.println("Ширина прямоугольника должна быть положительной");
                    error = true;

                }
                if (h1<=0) {
                    System.out.println("Высота прямоугольника должна быть положительной");
                    error=true;
                }
                if (x1>=800 || x1+w1>=800) {
                    System.out.println("Правая сторона прямоугольника должна быть в пределах рисунка");
                    error=true;
                }
                if (y1>=600 || y1+h1>=600 ) {
                    System.out.println("Нижняя сторона прямоугольника должна быть в пределах рисунка");
                    error= true;
                }
                if(error!=true){


                String filename = "out/task1"+i+".html";

                PrintWriter writer = new PrintWriter(new File(filename));
                writer.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n" +
                        "<body>\n" +
                        "<h1>Мой 2 векторный рисунок</h1>\n" +
                        "\n" +
                        "<svg width=\"800\" height=\"600\">\n" +
                        "\t<rect x=\"" + x + "\" y=\"" + y +"\" width=\""+w+"\" height=\""+h+"\"  stroke=\"blue\" stroke-width=\"  2  \" fill=\"red\" />\n" +
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


