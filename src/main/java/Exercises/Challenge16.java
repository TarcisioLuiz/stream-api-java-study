package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        numeros.stream().forEach(n -> {
            if(n % 2 == 0) {
                numerosPares.add(n);
            } else {
                numerosImpares.add(n);
            }
        });

        System.out.println("Os números pares são: " + numerosPares + " e os números ímpares são: " + numerosImpares );
    }
}
