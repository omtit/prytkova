package lab4;

public class task10 {
    public static void main(String[] args) {
        int a = 100;
        int b = 500;
        int r =0 ;
        System.out.print("Ход решения: ");
        while (a <= b) {
            r= r+a;
            System.out.print(" "+r);

            a = a + 1;


        }
        System.out.println("\n ответ:"+r);


    }
}
