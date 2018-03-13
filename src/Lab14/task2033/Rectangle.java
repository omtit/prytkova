package Lab14.task2033;

public class Rectangle extends Shape {
    public String c;
    public int x;
    public int y;
    public int w;
    public int h;
    public int count=0;

    public Rectangle(String c, int x, int y, int w, int h) {
        this.c = c;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + w + "\" height=\"" + h + "\" fill=\"transparent\" stroke=\"" + c + "\"/>";
    }

    public void shiftX(int value) throws Exception {
        if (x + value < 0) {
            throw new Exception(" координата х должна быть не отрицательна");
        }
        x = x + value;
        count++;

    }

    public void shiftY(int value) throws Exception {
        if (y + value < 0) {
            throw new Exception(" координата y должна быть не отрицательна");
        }
        y = y + value;
        count++;

    }

    public void stretchX(int value) throws Exception {
        if (w + x + value > 500) {
            throw new Exception(" координата х должна быть не отрицательна");
        }
        if (w + value <= 0) {
            throw new Exception("ширина должна быть положительной");
        }
        w = w + value;
        count++;

    }

    public void stretchY(int value) throws Exception {
        if (y + h + value > 350) {
            throw new Exception(" координата h должна быть не отрицательна");
        }
        if (h + value <= 0) {
            throw new Exception("высота должна быть положительной");
        }
        h = h + value;
        count++;

    }
}

