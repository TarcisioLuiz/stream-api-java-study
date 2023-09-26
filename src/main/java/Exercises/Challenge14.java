package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Challenge17 numerosPrimos = new Challenge17();

        System.out.println(numerosPrimos.encontrarNumerosPrimos(numeros).stream().max(Comparator.naturalOrder()));
    }
}
