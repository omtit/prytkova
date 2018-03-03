package lab15;

import java.util.ArrayList;
import java.util.List;

public class task02 {
    public static void main(String[] args){
            List<Integer> numbers;
            numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(7);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
       List<String> strings = new ArrayList<>();
       List<Point> points = new ArrayList<>();
       points.add(new Point(0,0));
       points.add (new  Point (1,1));
       Point p = new Point(1,1);
       if (points.contains(p)){
           System.out.println("+");
       }else {
           System.out.println("-");
       }

    }
}
