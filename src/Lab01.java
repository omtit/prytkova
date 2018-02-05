public class Lab01 {

    public static void task1860(String a){
        System.out.println("Мы стремимся к " + a);
    }

    public static void task4764(String a){
        System.out.println(a+" нас не остановят!");
    }

    public static void task2429(String a){
        System.out.println("Программирование это " +a +"!");
    }

    public static void task7472(String a, String b){
        System.out.println(b + " " + a);
    }

    public static void task3862(){

        System.out.printf("Значение пи:%.4f\n Значение е:%.4f",Math.PI, Math.E);
    }
    public static void task9231(double a){
        System.out.printf("округление: %.4f\n",a);
    }
    public static void task8624(int k){
        System.out.println("\"" + k + "\"");
    }

    public static void task2959(String a) {
        System.out.println("SELECT first_name, last_name, group\n" +
                "FROM students WHERE student_id = '" + a + "';");
    }

    public static void task7271(int a, int b){
        System.out.println("INSERT INTO points (x, y) VALUES ('" + a + "', '" + b + "');");
    }

    public static void task2632 (int cx, int cy, int r, String fill){
        System.out.println("<circle cx=\""+cx+"\" cy=\""+cy+"\"\n" +
                "r=\""+r+"\" fill=\""+fill+"\"/>");
    }

    public static void task4343(String $USER1, String $PASS1, String $HOST1, String $PORT1, String $DB1 ) {
        System.out.println("User ID=" + $USER1 + ";Password=" + $PASS1 + ";Host=" + $HOST1 + ";Port=" + $PORT1 + ";Database=" + $DB1 + ";");
    }
}
