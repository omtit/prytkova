public class Lab08 {
    public static int task9925(String s){
        int count =1;
        for (int i = 1; i<s.length(); i++){
            if (s.charAt(i) == ','){
                count++;
            }
        }
        return count;
    }

    public static String task4265(String str){
        if (str.indexOf("s")==0){
            return str.toLowerCase();

        }
        else if (str.indexOf("U")==0) {
            return str.toUpperCase();
        }
        else{return str;}
    }

}
