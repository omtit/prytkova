package Lab14.task2000;

/**
 * Created by adm on 13.02.2018.
 */
public class Interval {
    private int a;
    private int b;
    public Interval(int a, int b){
        if (a>b){
            throw new IllegalArgumentException("Некорректный интервал");
        }
        this.a = a;
        this.b=b;


    }
    public String print(){
        return "[" + a + ";" + b + "]";
    }
    public void slide(int x){
        a= a+x;
         b=b+x;
    }
    public void squeeze(int x){
        if (a>(b-x)){
            throw new IllegalArgumentException("Невозможно уменьшить интервал на указанную длину");
        }
        b=b-x;
    }
    public int length(){
        return b-a;
    }
}

