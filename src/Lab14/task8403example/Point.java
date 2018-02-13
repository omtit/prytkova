package Lab14.task8403example;

/**
 * @author akryukov
 *         13.07.2017
 */
public class Point {
    public int x;
    public int y;
    public Point(){

    }
    public double distanceTo(int px, int py){
        int dx = px - this.x;
        int dy = py - this.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
