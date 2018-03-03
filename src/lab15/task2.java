package lab15;

import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(Integer.parseInt(arr[i]));
        }
        System.out.println("List: "+ numbers.stream().map(Object::toString).collect(Collectors.joining(",")));

        Set<String> numbers2 = new HashSet<>();
        for (int j = 0; j < arr.length; j++) {
            numbers2.add((arr[j]));

        }
        System.out.println("set: "+ String.join(",", numbers2));
    }
}
