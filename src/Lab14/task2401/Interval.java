package Lab14.task2401;

public class Interval {
    public int a;
    public int b;

    public void squeeze(int c) throws IllegalArgumentException,IllegalStateException{
        if(a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        if(c>(b-a)){
            throw new IllegalArgumentException("Невозможно уменьшить интервал на указанную длину");
        }

b = b-c;
    }
    public String print()throws IllegalStateException {
        if(a>b){
            throw new IllegalStateException("Корректность интервала была нарушена");
        }
        return "[" + a + ";" + b + "]";
    }
}
