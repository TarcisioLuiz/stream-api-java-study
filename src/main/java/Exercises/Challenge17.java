package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Challenge17 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                .noneMatch(i -> numero % i == 0);
    }

    public static List<Integer> encontrarNumerosPrimos(List<Integer> numeros) {
        return numeros.stream()
                .filter(Challenge17::ehPrimo)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = encontrarNumerosPrimos(numeros);

        System.out.println(numerosPrimos.stream().distinct().collect(Collectors.toList()));
    }
}