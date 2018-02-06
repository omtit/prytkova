/**
 * Created by pro-31 on 02.02.2018.
 */
public class Lab06 {
    public static StringBuilder task8495(StringBuilder sb) {
        for (int i = 1; i <= 13; i++) {
            sb.append("!");
        }
        return sb;


    }

    public static void task1315(StringBuilder sb) {
        for (int i = 17; i <= 47; i++) {
            sb.append(i + " ");
        }

    }

    public static int task9562(int a, int b) {
        int r = 0;
        if (a < b) {
            while (a <= b) {

                r = a + r;
                a++;
            }
            return r;
        } else {
            while (b <= a) {
                r = b + r;
                b++;
            }
            return r;

        }
    }

    public static long task6580(int a, int b) {
        long r = 0;
        if (a > b) {
            while (a >= b) {
                r = r + b * b;
                b++;
            }


        }
        if (b > a) {
            while (a <= b) {

                r = r + a * a;
                a++;
            }

        }
        return r;
    }

    public static int task8731(String a) {
        int sum = 0;
        int count = 0;

        String[] s = a.split(" ");

        for (int i = 0; i < s.length; i++) {
            int mass = Integer.parseInt(s[i]);
            sum = sum + mass;
            count++;
            if (sum > 1000) {
                break;
            }
        }
        return count;
    }

    // public static String task4082(String b) {

    public static long task3669(int a, int b) {
        long r = 1;
        if (a < b) {
            while (a <= b) {
                r = r * a;
                a++;

            }
            return r;
        } else {
            while (a >= b) {
                r = r * b;
                b++;
            }
            return r;
        }
    }

    public static int task5969(int a, int b) {
        int r = 0;

        if (a > b) {
            while (b <= a) {
                if (b % 7 == 0) {
                    r = b + r;
                }

                b++;
            }

        }
        if (a < b) {
            while (a <= b) {
                if (a % 7 == 0) {
                    r = a + r;
                }
                a++;
            }

        }


        return r;
    }

}
