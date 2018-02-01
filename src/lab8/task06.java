package lab8;

public class task06 {
    public static void main(String[] args) {
int a = 100;
int b = 999;

        int [] mass = new int [10];
        for (int i =0; i!=mass.length; i++){
            int n = a + (int) (Math.random() * b);
            mass [i]= n;
            System.out.print(mass[i]+" ");

        }

    }
}
