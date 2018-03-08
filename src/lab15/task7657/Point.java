package lab15.task7657;

import java.util.Objects;

public class Point {
    public int x;
    public int y;
    public String color;
    public int countOfDuplicates;

    public Point(int x, int y, String color) {
        this.x=x;
        this.y=y;
        this.color=color;
        this.countOfDuplicates = 0;
    }

    @Override
    public String toString() {
        return "{" +
                "\"x\":" + x +
                ", \"y\":" + y +
                ", \"color\":" + color + '\'' +
                '}' + " Замен:" + countOfDuplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                Objects.equals(color, point.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    public void incrementCountOfDuplicates() {
        countOfDuplicates++;
    }
}
