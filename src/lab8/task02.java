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


                String filename = "out/task1"+i+".html";

                PrintWriter writer = new PrintWriter(new File(filename));
                writer.write("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<meta charset=\"utf-8\"/>\n" +
                        "<head/>\n" +
                        "<body>\n" +
                        "<h1>Мой второй векторный рисунок</h1>\n" +
                        "\n" +
                        "<svg width=\"800\" height=\"600\">\n" +
                        "\t<rect x=\"" + x + "\" y=\"" + y +"\" width=\""+w+"\" height=\""+h+"\"  stroke=\"blue\" stroke-width=\"  2  \" fill=\"red\" />\n" +
                        "</svg>\n" +
                        "</body>\n" +
                        "</html>");
                writer.close();

                Desktop.getDesktop().open(new File(filename));
                i++;
            }
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


