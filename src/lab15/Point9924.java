package lab15;

public class Point9924 {
    public String x;
    public String y;
    public String c;

    public Point9924(String x, String y, String c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point9924 point9924 = (Point9924) o;

        if (x != null ? !x.equals(point9924.x) : point9924.x != null) return false;
        return y != null ? y.equals(point9924.y) : point9924.y == null;
    }

    @Override
    public int hashCode() {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"x\":" + x + ",\"y\":" + y + ",color:" + c + "}";
    }
}
