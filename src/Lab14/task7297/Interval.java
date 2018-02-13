package Lab14.task7297;

/**
 * Created by adm on 13.02.2018.
 */
public class Interval {
    public int a;
    public int b;


    public boolean contains(int c) {
        if (a>b){
            throw new IllegalStateException ("Корректность интервала была нарушена");
        }
        if (c > a && c < b) {
            return true;
        } else {
            return false;
        }
    }
}
