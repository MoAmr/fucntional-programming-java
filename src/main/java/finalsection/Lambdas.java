package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Mohammed Amr
 * @created 18/12/2020 - 02:33
 * @project javafunctional
 */
public class Lambdas {

    public static void main(String[] args) {

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {

            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", 20));

    }
}
