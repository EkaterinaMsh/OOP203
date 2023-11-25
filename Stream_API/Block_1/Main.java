import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import java.util.HashSet;
import java.util.Set;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
         // Задача 1
        List<Integer> numbers = new Random().ints(100, 1, 1000).boxed().collect(Collectors.toList());

        long count = numbers.stream().filter(num -> num % 2 == 0).count();

        System.out.println("Количество парных чисел: " + count);


        /*//Задача 2
        Set<String> surnames = new HashSet<>();
        surnames.add("Johnson");
        surnames.add("Smith");
        surnames.add("Jones");
        surnames.add("Jackson");

        surnames.stream().filter(surname -> surname.startsWith("J")).forEach(System.out::println);
        */

        /*//Задача 3
        String[] strings = {"banana", "elderberry", "cherry", "apple", "date"};

        Arrays.stream(strings).sorted().forEach(System.out::println);
         */
    }
}
