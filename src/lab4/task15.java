package lab4;

public class task15 {
    public static void main(String[] args) {
       double a = 20;
        double r = 0;
        System.out.print("Ход решения: ");
        while (a <= 40) {

            System.out.printf("%.0f+%.0f=",r,Math.pow(a,3));
            r = r + Math.pow(a,3);
            a++;
        }
        System.out.printf("\nOтвет: %.0f",r);
    }
}