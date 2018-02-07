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

    public static String task2475() {
        int a = 100;
        int b = 500;
        int r = 0;
        System.out.println("Ход решения: ");
        while (a <= b) {
            r = r + a;
            System.out.print(" " + r);

            a = a + 1;

        }
        return "\n ответ:" + r;


    }

    public static String task5951() {
        double a = 20;
        double r = 0;
        System.out.print("Ход решения: ");
        while (a <= 40) {

            System.out.printf("%.0f+%.0f=", r, Math.pow(a, 3));
            r = r + Math.pow(a, 3);
            a++;
        }
        return "\nOтвет: " + r;
    }

    public static String task8696() {
        int a = 100;
        int b = 1000;
        int count = 0;
        System.out.print("Ход решения:");
        while (a <= b) {

            if (a % 13 == 0) {
                System.out.print(a + "+ ");
                count++;
            } else {
                System.out.print(a + " ");

            }
            a++;
        }
        return "\nОтвет: " + count;
    }

    public static String task2324(String data) {
        String[] s = data.split(" ");
        int[] a = new int[s.length];

        int r = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {

            a[i] = Integer.parseInt(s[i]);
            r = a[i] + r;
            count++;
            if (a[i] == 0) {
                break;
            }

        }
        return "Сумма чисел: " + r + ", Количество чисел: " + count;
    }

    public static StringBuilder task3762(StringBuilder sb) {
        int a = 1;
        int r = 453;
        int b = 453;


        while (a <= 20) {
            sb.append(a).append("   ").append(r).append("\n");
            a = a + 1;
            r = a * b;

        }
        return sb;
    }

    public static StringBuilder task3550(StringBuilder sb, int a) {
        //int a = 1;
        int r = 7;
        while (a < 10) {
            sb.append(a).append(" x 7 = ").append(r).append("\n");
            a++;
            r = a * 7;
        }
        return sb;
    }

    public static void task6572(StringBuilder sb, int a, int b){
        int count=0;
        if (a < b) {
            while (a <= b) {
                int r = a % 2;
                if (r != 0) {
                    for (int i=0; i<count; i++) {
                        System.out.print(".");
                    }

                    System.out.print(a + "\n");

                    count++;
                }
                a++;

            }
        }

        else if (a > b) {
            count=0;
            while (b <= a) {
                int r = b % 2;
                if (r != 0) {
                    for (int i=0; i<count; i++){
                        System.out.print(".");}

                   System.out.print(b + "\n");
                       count++;
                }
                b++;

            }
        }

    }

    public static StringBuilder task2084(StringBuilder sb, int a, int b){
        if (a < b) {
            while (a <= b) {

                if (a % 2 != 0) {
                    if (a == b|| b-a==1) {
                        System.out.print(a);
                        break;
                    }
                    System.out.print(a+",");
                }
                a++;

            }

        }
        else {
            while (b<=a){
                if (a % 2 != 0) {
                    if (a == b|| a-b==1) {
                        System.out.print(a);
                       break;}

                    System.out.print(a+",");

                }

                a--;}
    }
        System.out.println();
    return sb;
}

public static StringBuilder task5411(StringBuilder sb, int p, int q){
    int r = Math.abs((q - p)/2);
    int c = r+ Math.min(p,q);
    if (p<q) {while (p<=q){
        if (p<c) {
            sb.append(p+"<");
        }
        else{
            if (p==q) {
                System.out.print(p);
                break;
            }
            System.out.print(p+">");
        }

        p++;
    }}
    else {while (q<=p){
        if (q<c) {
            System.out.print(q+"<");
        }
        else{
            if (p==q) {
                System.out.print(q);
                break;
            }
            System.out.print(q+">");
        }

        q++;
    }}
    System.out.println();
    return sb;
}

public static StringBuilder task7585(StringBuilder sb, int x){
    int a = 10;
    int b = 20;
    while (a <= b) {
        if (x == a) {
            sb.append(x).append("+").append("\n");
        } else {
            sb.append(a).append("\n");
        }
        a = a + 1;
    }
    return sb;
}

public static StringBuilder task8770(StringBuilder sb, int x){
    int a = 30;
    int b = 40;
    while (a <= b) {
        if (x == a) {
            sb.append(x).append("+").append("\n");
        } else {
            sb.append(a).append("-").append("\n");
        }
        a = a + 1;
    }
    return sb;
}
}


