package lab15;

import java.util.HashSet;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(3);
        integers.add(3);
        integers.add(3);
        for (Integer i : integers){
            System.out.println(i);
        }

        Set<Point> pts = new HashSet<>();
        pts.add(new Point(1,1));
        pts.add(new Point(0,0));
        pts.add(new Point(1,1));
        System.out.println(pts.size());

    }
}
