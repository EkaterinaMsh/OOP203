import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
    public static List<Integer> getEvenNumbers(List<Integer> list) {
        return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumbers(list)); //=> [2, 4]
    }
     */
/*
    //Задача 2.
     public static void main(String[] args) {
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");


        List<String> uppercaseNames = names.stream()
                .filter(name -> !name.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Непустые имена в верхнем регистре: " + uppercaseNames);


        char targetLetter = 'P';
        long count = names.stream()
                .filter(name -> !name.isEmpty() && name.charAt(0) == targetLetter)
                .count();

        System.out.println("Количество имен, начинающихся с буквы '" + targetLetter + "': " + count);
    }
     */
}