package Lab14.task2033;

import Lab14.task2033.Shape;

public class Circle extends Shape {
    public String c;
    public int x;
    public int y;
    public int r;
    public int count =0;

    public Circle(String c, int x, int y, int r) {
        this.c = c;
        this.x = x;
        this.y = y;
        this.r = r;
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
        if ((x+value/2 + r + value/2) <0) {
            throw new Exception(" координата х должна быть не отрицательна");
        }
        if (r + value <= 0) {
            throw new Exception("ширина должна быть положительной");
        }
        x= x+value/2;
        r = r + value/2;
        y= y+value/2;

        count++;

    }

    public void stretchY(int value) throws Exception {
        if (y + r + value > 350) {
            throw new Exception(" координата h должна быть не отрицательна");
        }
        if (r + value <= 0) {
            throw new Exception("ширина должна быть положительной");
        }
        x= x+value/2;
        r = r + value/2;
        y= y+value/2;
        count++;

    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return  "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"transparent\" stroke=\"black\"/>";
    }

}
