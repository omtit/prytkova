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
}