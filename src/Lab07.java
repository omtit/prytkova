import java.util.Arrays;

public class Lab07 {

    public static double task3946(String data) {
        if ("".equals(data)) {
            return 0;
        }
        double summ = 0;
        String[] s1 = data.split(" ");
        int[] a = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            a[i] = Integer.parseInt(s1[i]);
            summ = summ + a[i];

        }
        double result = summ / (s1.length);

        return result;
    }

    public static int task4283(int k, String data) {

        int count = 0;
        String[] arr = data.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i != arr1.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
            if (arr1[i] == k) {
                count++;
            }
        }
        return count;
    }

    public static int task9182(String data) {
        String[] arr = data.split(" ");
        Arrays.sort(arr);

        int count = 1;
        String t = arr[0];
        for (int j = 0; j != arr.length; j++) {
            if (!t.equals(arr[j])) {
                count++;
                t = arr[j];
            }

        }
        return count;
    }

    public static boolean task4515(String data){
        String[] arr = data.split(" ");
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            String n = arr[i];
            for (int z = 0; z < arr.length; z++) {
                  if (n.equals(arr[z]) && z != i) {
                    count++;
                }
            }
            i++;
        }


        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String task7035(String data){
        String[] arr = data.split(" ");
        int[] mass = new int[arr.length];
        for (int i = 0; i != arr.length; i++) {
            mass[i] = Integer.parseInt(arr[i]);
        }

        System.out.println("Ход решения:");
        int min = mass[0];
        System.out.println("Начинаю с " + min);
        int z = 1;
        while (z != mass.length) {
            System.out.println("сравниваю " + min + " и " + mass[z]);
            if (min > mass[z]) {
                System.out.println("Заменяю");
                min = mass[z];
            }
            z++;
        }

        return "Ответ " + min;

    }

    public static StringBuilder task5694(StringBuilder sb, String x){
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};

        int i = 0;
        while (i < arr.length) {

            if (x.equals(arr[i])) {
                sb.append(arr[i]).append("+").append("\n");
            } else {
                sb.append(arr[i]).append("\n");

            }
            i++;
        }
        return sb;
    }

    public static StringBuilder task6806(StringBuilder sb, int x){
        String[] arr = "11;13;17;19;10;12;14;15;16;18;20".split(";");

        int i = 0;
        while (i < arr.length) {
            int a = Integer.parseInt(arr[i]);
            if (x==a) {
                sb.append(arr[i]).append("+").append("\n");
            } else {
                sb.append(arr[i]).append("\n");

            }
            i++;
        }
        return sb;
    }

    public static String task7369(String a, String b){
        StringBuilder sb = new StringBuilder();
        String[] top = a.split(" ");
        String[] left = b.split(" ");
        if ("".equals(a)) {
            return "Данные сверху отсутствуют";

        }
        if ("".equals(b)) {
            return "Данные слева отсутствуют";

        }
        System.out.print("  ");
        System.out.println(String.join(" ", top));
        for (int j = 0; j < left.length; j++) {
            System.out.print(left[j]);
            for (int i = 0; i < top.length; i++) {
                if (top[i].equals(left[j])) {
                    System.out.print(" +");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" |");
        }
        System.out.print("  ");
        for (int n = 0; n < top.length; n++) {
            System.out.print("--");
        }
        String x = sb.toString();
        return x;
    }

}