package lab8;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        String data = "res/task6409/file.txt";

        File target = new File(data);
        System.out.println("Открываем файл " + target.getAbsolutePath());
        try {
            Scanner s = new Scanner(target);
            int i = 0;
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] mass = line.split(";");
                //s.close();
                String x = mass[0];
                String y = mass[1];
                String A = mass[2];
                String L = mass[3];
                int x1 = Integer.parseInt(x);
                int y1 = Integer.parseInt(y);
                int A1 = Integer.parseInt(A);
                int L1 = Integer.parseInt(L);
                int x2 = x1 + A1;
                String x22 = Integer.toString(x2);
                int y2 = y1 + A1;
                String y22 = Integer.toString(y2);
                int xh = A1/2+x1;
                double yh = Math.sqrt(L1*L1-A1*A1/4);

                //boolean error = false;
                //if(r1>cx1||r1>cy1){
                //    System.out.println("Левая точка круга должна иметь неотрицательные координаты");
                //    error = true;

                //}
                //if (sw1>r1*2) {
                //    System.out.println("Толщина обводки должна быть меньше диаметра круга");
                //    error=true;
                //}
                //if (cx1>800) {
                //    System.out.println("Правая точка круга должна быть в пределах рисунка");
                //    error=true;
                //}
                //if (cy1>600) {
                //    System.out.println("Нижняя точка круга должна быть в пределах рисунка");
                //    error= true;
                //}
                //if (error!=true ){

                String filename = "out/task1" + i + ".html";

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
                        "\t<line x1=\"" + x + "\" y1=\"" + y + "\" x2=\"" + x22 + "\" y2=\"" + y + "\" stroke=\"blue\" stroke-width=\"" + 2 + "\"  />\n" +
                        "\t<line x1=\"" + x + "\" y1=\"" + y + "\" x2=\"" +xh  + "\" y2=\"" + yh + "\" stroke=\"blue\" stroke-width=\"" + 2 + "\"  />\n" +
                        "\t<line x1=\"" + x22 + "\" y1=\"" + y + "\" x2=\"" +xh  + "\" y2=\"" +yh  + "\" stroke=\"blue\" stroke-width=\"" + 2 + "\"  />\n" +

                        "</svg>\n" +
                        "</body>\n" +
                        "</html>");
                writer.close();

                Desktop.getDesktop().open(new File(filename));
                i++;
            }
            //}
            s.close();

        } catch (
                FileNotFoundException e)

        {
            e.printStackTrace();
        } catch (
                IOException e)

        {
            e.printStackTrace();
        }
    }
}



