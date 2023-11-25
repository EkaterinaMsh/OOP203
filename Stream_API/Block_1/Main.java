import java.util.Arrays;

public class Main {
    //Задача 3
    public static void main(String[] args) {
        String[] strings = {"banana", "elderberry", "cherry", "apple", "date"};

        Arrays.stream(strings).sorted().forEach(System.out::println);
    }
}
