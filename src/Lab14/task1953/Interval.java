package Lab14.task1953;

public class Interval {

    private int a;
    private int b;

    public Interval(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public String print() {
        String s;


        s = "[" + a + ";" + b + "]";


        return s;
    }
}