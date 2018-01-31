package lab8;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        String data = "res/task7060/file.txt";

        File target = new File(data);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            int i = 0;
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] mass = line.split(";");

                String x1 = mass[0];
                String y1 = mass[1];
                String w1 = mass[2];
                String h1 = mass[3];
                String x2 = mass[4];
                String y2 = mass[5];
                String w2 = mass[6];
                String h2 = mass[7];
                int x11 = Integer.parseInt(x1);
                int x22 = Integer.parseInt(x2);
                int y11 = Integer.parseInt(y1);
                int y22 = Integer.parseInt(y2);
                int w11 = Integer.parseInt(w1);
                int w22 = Integer.parseInt(w2);
                int h11 = Integer.parseInt(h1);
                int h22 = Integer.parseInt(h2);
                //boolean error = false;
                //if(w1<=0){
                //    System.out.println("Ширина прямоугольника должна быть положительной");
                //    error = true;
//
                //}
                //if (h1<=0) {
                //    System.out.println("Высота прямоугольника должна быть положительной");
                //    error=true;
                //}
                //if (x1>=800 || x1+w1>=800) {
                //    System.out.println("Правая сторона прямоугольника должна быть в пределах рисунка");
                //    error=true;
                //}
                //if (y1>=600 || y1+h1>=600 ) {
                //    System.out.println("Нижняя сторона прямоугольника должна быть в пределах рисунка");
                //    error= true;
                //}
                //if(error!=true){
                int x33;
                int y33;
                int w33;
                int h33;
                if (x22 > x11) {
                    x33 = x22;
                    w33 = (x11+w11)-x22;
                }else{
                    x33 = x11;
                    w33 = (x22+w22)-x11;
                }
                if (y22 > y11) {
                    y33 = y22;
                    h33 = y11+h11-y22;
                } else {
                    y33 = y11;
                    h33=y22+h22-y11;
                }



                String x3= Integer.toString(x33);
                String y3 = Integer.toString(y33);
                String w3 = Integer.toString(w33);
                String h3 = Integer.toString(h33);


                String filename = "out/task1" + i + ".html";

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
                        "\t<rect x=\"" + x1 + "\" y=\"" + y1 + "\" width=\"" + w1 + "\" height=\"" + h1 + "\" fill=\"blue\" />\n" +
                        "\t<rect x=\"" + x2 + "\" y=\"" + y2 + "\" width=\"" + w2 + "\" height=\"" + h2 + "\" fill=\"red\" />\n" +
                        "\t<rect x=\"" + x3 + "\" y=\"" + y3 + "\" width=\"" + w3 + "\" height=\"" + h3 + "\" fill=\"yellow\" />\n" +

                        "</svg>\n" +
                        "</body>\n" +
                        "</html>");
                writer.close();

                Desktop.getDesktop().open(new File(filename));
                i++;
            }
            //}
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
