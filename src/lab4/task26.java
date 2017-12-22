package lab4;

public class task26 {
    public static void main(String[] args) {
        int a = 100;
        int b = 1000;
        int count=0;
        System.out.print("Ход решения:");
        while (a <= b) {

            if (a % 13 == 0) {
                System.out.print(a + "+ ");
                count++;
            } else {
                System.out.print(a+" ");

            }
            a++;
        }
        System.out.println("\nОтвет: "+count);
    }
}
