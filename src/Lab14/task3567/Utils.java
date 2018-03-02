package Lab14.task3567;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Utils {
    public static void writeToHtml(String filename, int width, int height, String description, String content) {
        try (PrintWriter writer = new PrintWriter(filename, "UTF-8")) {
            writer.println("<!DOCTYPE html>" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>");
            writer.println(filename);
            writer.println("</h1>");
            writer.println(description);
            writer.println(String.format("<svg width=\"%d\" height=\"%d\">", width, height));
            writer.println(content);
            writer.println("</svg>\n" +
                    "</body>\n" +
                    "</html>");
            Desktop.getDesktop().open(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}