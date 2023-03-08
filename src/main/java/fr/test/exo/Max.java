package fr.test.exo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Max {
    public static int sequence(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            var result = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream()
                    .mapToInt(Integer::intValue)
                    .sum();
            System.out.println(i + "result : " + result);
        }
        return 0;
    }
}
