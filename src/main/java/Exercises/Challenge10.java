package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge10 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().filter(num -> num % 2 != 0).filter(num -> num % 3 == 0 || num % 5 == 0).collect(Collectors.toList()));
    }
}
