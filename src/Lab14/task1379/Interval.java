package Lab14.task1379;

public class Interval {
    public int a;
    public int b;

    private int d;
    private int e;

    public void slide(int c) throws IllegalStateException {
        a = a + c;
        b = b + c;
        if ( a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
    }

    public String print() throws IllegalStateException{
        if ( a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
