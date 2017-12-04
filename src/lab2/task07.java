package lab2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aInDeg;
        aInDeg = s.nextInt();
        double aInRad;
        aInRad=aInDeg*Math.PI/180;
        System.out.printf("%.4f",aInRad);

    }
}
