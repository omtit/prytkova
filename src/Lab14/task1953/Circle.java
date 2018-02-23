package Lab14.task1953;

public class Circle {

    private int r;
    private int x;
    private int y;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Circle(int x, int y, int r) {

        this.r = r;
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\"/>";
    }

    public double area() {
        return Math.PI * (r * r);
    }

    public String getProjectionX() {
        x1 = x - r;
        x2 = x + r;
        return "[" + x1 + ";" + x2 + "]";
    }




    public void getProjectionY() {
        y1 = y - r;
        y2 = y + r;

    }
    public String print(){
        return "[" + y1 + ";" + y2 + "]";

    }
}


