package Lab14.task5242;

public class Interval {
    public int a;
    public int b;
    public  String print()throws IllegalStateException{
        if (a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";

    }
}
