package Lab14.task6037;

public class Interval {
    public int a;
    public int b;

    public static boolean hasIntersection(Interval l, Interval r) throws IllegalStateException {

        if (l.a > l.b || r.a > r.b) {
            throw new IllegalStateException("Корректность интервала была нарушена");
        }

        if (l.a <= r.b && l.b >= r.a){
            return true;
        }

        return false;
    }
}
