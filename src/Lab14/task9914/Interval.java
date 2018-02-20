package Lab14.task9914;

/**
 * Created by adm on 13.02.2018.
 */
public class Interval {
    public int a;
    public int b;
    public boolean intersects(Interval c) {
        if (c==null){
            throw new IllegalArgumentException ("Данный интервал не инициализирован");
        }
        if(a>b){
            throw new IllegalStateException ("Корректность интервала была нарушена");
        }
        if (c.a>c.b){
            throw new IllegalArgumentException ("Некорректный интервал");
        }
        if (b<c.a){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String toString() {
        return "[" + a + ";" + b + "]";
    }

}
