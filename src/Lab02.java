/**
 * @author akryukov
 * 28.03.2017
 */
public class Lab02 {
    public static double task4411(double x) {
        return 2 * x;
    }

    public static double task7711(int x) {
        return Math.sin(x * Math.PI / 180);
    }

    public static int task3832(int x1, int x2, int x3) {
        return x1 * x2 + x1 * x3 + x2 * x3;
    }

    public static double task8428(int x) {
        return x * Math.PI / 180;
    }

    public static double task1262(int x) {
        return 5 * Math.cos(x * Math.PI / 180);
    }

    public static double task2790(int x) {
        return Math.sqrt(1 - Math.pow(Math.sin(x * Math.PI / 180), 2));
    }

    public static double task9164(int a, int b) {
        return Math.sin(a * Math.PI / 180) * Math.cos(b * Math.PI / 180) + Math.cos(a * Math.PI / 180) * Math.sin(b * Math.PI / 180);

    }

    public static double task5789(int xa, int ya, int xb, int yb) {
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }

    public static int task5063(int a) {
        return a % 360;
    }

    public static double task5895(int a, int b, int aInDeg) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(aInDeg * Math.PI / 180));
    }

    public static double task7457(int x) {
        return 7 * Math.pow(x, 2) - 3 * x + 6;
    }

    public static double task9865(double a) {
        return 12 * Math.pow(a, 2) + 7 * a - 16;
    }

    public static double task3558(int aInDeg, int bInDeg) {
        return 3 * Math.sin(2 * aInDeg * Math.PI / 180) * Math.cos(3 * bInDeg * Math.PI / 180);
    }

    public static double task4366(int x1, int x2) {
        return Math.sqrt(Math.pow(x2, 2) + Math.pow(x1, 2));
    }

    public static double task9020(int x) throws Exception{

        if (61-x<0) {
            throw new Exception("Подкоренное выражение должно быть неотрицательным");

        }
        double result;
        result = 3*Math.sqrt(61-x);
       return result;
    }



}

