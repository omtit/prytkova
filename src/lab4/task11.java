package lab4;


import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        if (-100<=A && A<=500)
        {
        int r = 0;
        while (A <= 500){
            r = r + A;
            A = A + 1;

    }
    System.out.print(r );}
    else {
        System.out.println("Значение A должно быть в интервале [-100, 500]");
        return;
    }

}
}
