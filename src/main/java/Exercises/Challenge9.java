package Exercises;

import java.util.Arrays;
import java.util.List;

public class Challenge9 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long total = numeros.stream().count();

        long semRepetidos = numeros.stream().distinct().count();

        if (total - semRepetidos != 0) {
            System.out.println("Se repetem");
        } else {
            System.out.println("Não se repetem");
        }
    }
}
