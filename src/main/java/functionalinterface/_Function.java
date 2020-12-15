package functionalinterface;

import java.util.function.Function;

/**
 * @author Mohammed Amr
 * @created 15/12/2020 - 21:39
 * @project javafunctional
 */
public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
